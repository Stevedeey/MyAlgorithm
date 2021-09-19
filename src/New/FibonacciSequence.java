package New;

import java.util.LinkedList;

public class FibonacciSequence {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void generateFibSequence(int count) {

        if (count > 0) {

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.println("" + n3);
            generateFibSequence(count - 1);
        }

    }


    public static int secondHighest(int[] arr) {
        int max = 0, preMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                preMax = max;
                max = arr[i];
            }

            if (arr[i] < max && arr[i] > preMax) {
                preMax = arr[i];
            }

        }
        return preMax;

    }

    public static void main(String[] args) {
        System.out.println(n1 + " " + n2);
        generateFibSequence(8);
    }
}
