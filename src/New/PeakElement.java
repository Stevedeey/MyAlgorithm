package New;

import java.io.File;

public class PeakElement {

    public static void main(String[] args) {
//        int [] arr = {5,6,4,8,17,7,5,8,1,8};
        int [] arr = {5,5,3,66,4,3,6,4,5,3};
        var result = peakElement(arr);
        System.out.println("Now the result is: "+ result);
      //  testingSomething(arr);



//        int [] array = {15,6,4,8,5,8,9,8,4};
//               Integer peak = peakElement(array);
//               System.out.println(peak != null ? "Peak Element is "  + peak : "No peak element!" );

    }


    //O(N) solution

    public static Integer peakInOofNSolution(int arr[]){

        for (int i = 0; i < arr.length; ++i) {
            if(i==0 || arr[i-1] < arr[i] && i == i -1 || arr[i+1] < arr[i]){
                return arr[i];
            }
        }
        return null;
    }


    public static void testingSomething(int[] arr){
;
        int start = 0;
        int end  = arr.length - 1;

        int mid = start + end / 2;

    }
    public static Integer peakElement(int[] array){

        if (array == null || array.length == 0) return null;

        int n = array.length;

        int start = 0;
        int end = n - 1;

        while (start <= end) { // just like looping from the start of the array to the end of it.
            int mid = (start + end) / 2;
            if ((mid == 0 || array[mid - 1] <= array[mid]) && (mid == n - 1 || array[mid] >= array[mid + 1])) {   // mid = 0 ? we assume the leftmost number is greater than -INF, mid =n -1, we assume that the last number is greater than the rightmost number
                return array[mid];
            } else if (mid > 0 && array[mid - 1] > array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return null;

    }

}
