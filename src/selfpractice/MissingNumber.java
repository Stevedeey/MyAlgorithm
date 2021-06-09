package selfpractice;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber {


    //        private static int getMissingNumber(int[] numbers, int totalCount) {
//        int expectedSum = totalCount * ((totalCount + 1) / 2);
//        int actualSum = 0;
//        for (int i : numbers) {
//            actualSum += i;
//        }
//
//        return expectedSum - actualSum;
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

    public static void main(String[] args) {
//        System.out.println(getMissingNumber(new int []{1, 2, 3, 4, 6},6));
        // printMissingNumber(new int []{1, 2, 3, 4, 6},6);
        findMissingNumber(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 50});


    }
    //Online solution

    private static void findMissingNumber(int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            int j = i + 1;
            int difference = number[j] - number[i];
            if (difference != 1) {
                int missing_num = number[i] + 1;
                for (int k = difference; k > 1; k--) {
                    System.out.println("Missing Number is " + missing_num);
                    missing_num++;
                }
            }
        }
    }
}
