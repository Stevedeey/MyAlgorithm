package _encentral;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class __EncentralAlgo {

    public static void main(String[] args) {
        int [] arr = { 66,2,7,11,15};
        var result = Arrays.toString(twoSum(arr,9));
        System.out.println("Result: "+ result);


    }

    public static int[] twoSum(int[] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[]{ map.get(complement), i };
            }
            else {
                map.put(arr[i], i);
            }
        }

        return new int[2];
    }
}
