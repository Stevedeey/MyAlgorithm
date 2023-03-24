package decagonDev;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitingEven {

    //        Task
//        In this challenge, you will write a function to divide an integer into a number of even parts, which will be returned in a result array.
//        Summing the integers in this result array will produce the original number.
//
//        For example, given number = 10 and parts = 2, splitInteger(10, 2) should return an array of integers with length equal to parts: [5, 5].
//
//        Not all numbers will offer a clean division. In this case, we should split the number as closely as possible to even,
//        with the smaller numbers in the front of the array. For example,
//
//        splitInteger(11, 3) → [3, 4, 4]
//        There is no reason to test for edge cases; the input to your function will always be valid for this challenge.

    /**
     * var splitInteger = function(num, parts) {
     * // Complete this function
     * <p>
     * var val;
     * var mod = num % parts;
     * if(mod == 0){
     * val = num/parts;
     * retData = Array(parts).fill(val);
     * } else {
     * val = (num-mod)/parts;
     * retData = Array(parts).fill(val);
     * for(i=0;i<mod;i++){
     * retData[i] = retData[i] + 1;
     * }
     * retData.reverse()
     * }
     * <p>
     * return retData;
     * <p>
     * }
     */

    public static List<Integer> splitInteger(int num, int parts) {
        Integer[] array = new Integer[parts];
        int data;
        int mod = num % parts;
        if (mod == 0) {
            data = num / parts;
            Arrays.fill(array, data);  // Makes all elements of array[] equal to "data"
        } else {
            data = (num - mod) / parts;
            Arrays.fill(array, data);
            for (int i = 0; i < mod; i++) {
                array[i] = array[i] + 1;
            }
            Collections.reverse(Arrays.asList(array));  // You can also recursively reverse the content of the array.
        }

        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        var result = splitInteger(11, 3);
        System.out.println("Result " + result);
    }
}
