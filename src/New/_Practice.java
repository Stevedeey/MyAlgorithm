package New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _Practice {


    private static int mergeListandAdd(int[] arr) {

        // arr = {7,86,67,6,55,4,6}

        List<Integer> addList = new ArrayList<>();
        List<Integer> multiList = new ArrayList<>();
        int total = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int sum = arr[i] + arr[i + 1];
            addList.add(sum);
            i = i + 1;
        }
        for (int i = 0; i < addList.size() - 1; i++) {
            int mult = addList.get(i) * addList.get(i + 1);
            multiList.add(mult);
            i = i + 1;

        }
        for (int i = 0; i < multiList.size(); i++) {
            total += multiList.get(i);
        }

        return total;
    }


    static int n1 = 0, n2 = 1, n3 = 0;

    private static void fibonacc(int num) {

        if (num > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacc(num - 1);
        }
    }


    private static int secondLargest(int[] arr) {

        int max = 0, secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];

            }
        }
        return secondMax;
    }

    private static void bubbleSort(int[] arr) {
        boolean isSorted;
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j-1);
                    isSorted = false;
                }
            }
            if (isSorted == true) return;
        }
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public static void main(String[] args) {

//        int[] arr = {8, 5, 36, 7, 9, 5, 4,6};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));

//        var ans = mergeListandAdd(arr);
//        System.out.println(ans);

//        System.out.println(secondLargest(arr) + " is the second largest number");
//        System.out.print(n1 + " " + n2);
        fibonacc(6);

    }
}
