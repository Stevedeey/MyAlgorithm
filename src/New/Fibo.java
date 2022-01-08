package New;

import java.util.*;

public class Fibo {

    public static void main(String[] args) {
        //fibonacci(8);

        int arr[] = {172,7,11,2};
        System.out.println(indexOf1(arr, 2));
     //   System.out.println(Arrays.toString(twoSum(arr, 9)));





//        var list = List.of(1,2,4,5);
//        var i = list.stream().mapToInt(i ->i).toArray();
//        System.out.println(Arrays.toString(i));
    }

    public static int[] twoSum2(int [] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]))
            {
                return new int[]{i , map.get(arr[i])};
            }
            else {
            map.put(target - arr[i], i);
            }
        }
        return new int[2];
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                int complement = target - nums[j];
                if(nums[j] == complement){
                    return new int[]{i , j};
                }
            }
        }
        throw new IllegalArgumentException("No suitabe");
    }




    public static int indexOf(int arr[], int search){
        int k = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search){
                k = i;
                break;
            }
        }
        return k;
    }
//1
        public static int indexOf1(int arr[], int search){
                int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == search){
                    k = i;
                    break;
                }
            }
            return k;
        }

    static int n1 = 0, n2 = 1, n3 = 0;

    public static void fibonacci(int num){

        if(num > 0) {

            n3 = n1 + n2;  // n3 = 1   2  3

            n1 = n2;    //n1 =     1   1  2

            n2 = n3;   // n2 =     1   2

            System.out.println("" + n3);

            fibonacci(num - 1);
        }

    }

    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            boolean isSorted = true;
            for (int j = 1; j < arr.length -  i ; j++) {

                if(arr[j] < arr[j-1]){
//                    int temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
                    swap(arr, j, j -1);
                    isSorted = false;
                }
            }
            if(isSorted){
                return;
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2 ){

        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;

    }
}
