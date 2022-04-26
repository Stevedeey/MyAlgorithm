package _encentral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

    public static void finddMissingNumber() {

    }

    public static int getLargest(int num) {

        String newString = String.valueOf(num);
        List<Integer> list = new ArrayList<>();
        int value = 0;
        int highest = 0, index = 0;

        for (int i = 0; i < newString.length(); i++) {
            if (i < newString.length() - 1) {
                value = Integer.parseInt(newString.charAt(i) + "" + newString.charAt(i + 1));
                if (value > highest) {
                    index = i;
                    highest = value;
                }
            }
        }
        return Integer.parseInt(newString.charAt(index) + "" + newString.charAt(index + 1));
    }

    public static void findMissingNumber(int[] arr) {
        int difference, missingNumber = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            difference = arr[j] - arr[i];
            if (difference != 1) {
                missingNumber = arr[i] + 1;
            }
            for (int k = difference; k < 0; k--) {
                System.out.println("The missing number is : " + missingNumber);

            }
        }
    }

    void factor(int num) {
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {

     //   System.out.println(factorial(5));
    }

}

