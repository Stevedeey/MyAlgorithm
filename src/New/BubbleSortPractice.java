package New;

import selfpractice.Array;

import java.util.Arrays;

public class BubbleSortPractice {
    public static void main(String[] args) {
        int[] arr = { 4,6,7,3,6,9,5,900,8 , 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));

//        int answer = secondMaximun(arr);
//        System.out.println("Second Maximum "+ answer);

    }

    public static void sort(int[] arr){
        boolean isSorted;
        for (int i = 0; i < arr.length; i++) {
          isSorted = true;
            for (int j = 1; j < arr.length - i; j++) {

                if(arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
                isSorted = false;
            }
            if(isSorted) return;

        }

    }

    private static void swap(int[] arr, int index1, int index2){
        int temp =  arr[index1];
        arr[index1]  = arr[index2];
        arr[index2] = temp;
    }


    public static  int secondMaximun(int[] arr){

        int max = 0, premax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                premax = max;
                max = arr[i];
            }

            if(arr[i] < max && arr[i] > premax){
                premax = arr[i];
            }
        }
        return  premax;
    }


}
