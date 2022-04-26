package _encentral;

import java.util.ArrayList;
import java.util.List;

public class __amainMemoize {
    public static void main(String[] args) {
        Memoization memoization = new Memoization();
        System.out.println("Factorial of 3: ");
        System.out.println("************");
        System.out.println("Calculate for 3: "+memoization.calculate(3));
        System.out.println("Size "+ memoization.getList().size());
        System.out.println("Printing the list :"+ memoization.getList());

        System.out.println(">>>>>>>>>>>>>>>>>>*<<<<<<<<<<<<<<<<<<<");
        System.out.println("Factorial of 7: ");
        System.out.println("************");
        System.out.println("Result: "+memoization.calculate(7));
        System.out.println("Size "+ memoization.getList().size());
//        System.out.println("Printing the list :"+ memoization.getList());
//       int answer =  findIndexOfMin(new int[]{23, 34, 42, 513, 62, 74, 84, 94, 10, 88}, 0, 9);
//        System.out.println("Answer: "+answer);
    }

     static int findIndexOfMin(int[] arr, int start, int end) {
        int min = arr[start];
        int minIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    int findIndexOfMax(int[] arr, int start, int end) {
        int max = arr[start];
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
  int findSecondMaximumNumber(int[] arr){
      int max = arr[0];
      int secondMax = arr[0];
      for(int i = 1; i < arr.length; i++){
          if(arr[i] > max){
              secondMax = max;
              max = arr[i];
          }else if(arr[i] > secondMax){
              secondMax = arr[i];
          }
      }
      return secondMax;
  }

  int findPeakElement(int[] arr){
      int peakElement = 0;
      for(int i = 1; i < arr.length; i++){
          if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
              peakElement = i;
          }
      }
      return peakElement;
  }

}

