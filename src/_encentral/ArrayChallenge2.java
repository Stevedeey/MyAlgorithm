package _encentral;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayChallenge2 {

    /*?
    *
    * Array Challenge
Have the function ArrayChallenge(arr) take the array of numbers stored in arr which will contain integers that
*  represent the amount in dollars that a single stock is worth, and return the maximum profit that could have
*  been made by buying stock on day x and selling stock on day y where y > x. For example: if arr is
*  [44, 30, 24, 32, 35, 30, 40, 38, 15] then your program should return 16 because at index 2 the stock was
*
*  worth $24 and at index 6 the stock was then worth $40, so if you bought the stock at 24 and sold it at 40,
*  you would have made a profit of $16, which is the maximum profit that could have been made with this list of
* stock prices.

If there is not profit that could have been made with the stock prices, then your program should return -1.
* For example: arr is [10, 9, 8, 2] then your program should return -1.

Examples
Input: new int[] {10,12,4,5,9}
Output: 5 Input: new int[] {14,20,4,12,5,11}
Output: 8
    * */


    public static class algo {
        public static void main(String[] args) {
//            int[] as = {10, 9, 8, 5};
//            var s = arrayChallenge(as);
//        System.out.println("Profit: $"+s);
//        var result = stringChallenge(new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"});
//        System.out.println("Result: "+ result);
//            System.out.println("RES1: "+longest(453857));
//            System.out.println("RES2: "+longest(363223311));

            reverse(Arrays.asList("Baby", "Apple", "Cat"));

          //  longest(89);
        }

        public static int ArrayChallenge(int[] arr) {

            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (j > i) {
                        if (arr[j] > arr[i]) {
                            result.add(arr[j] - arr[i]);
                        }
                    }
                }
            }

            var max = Collections.max(result);
//        int res = 0;
//        for (Integer a:result) {
//            if(a > res) res = a;
//        }

            if (result.size() > 1) return max;
            else return -1;
        }


        public static int longest(int num) {
            int highest = 0;
            String numStr = String.valueOf(num);
            int index = 0;
            for (int i = 0; i < numStr.length(); i++) {


                if (i < numStr.length() - 1) {

                    int value = Integer.parseInt(String.valueOf(numStr.charAt(i)  + numStr.charAt(i+1)));
                    if (value > highest) {
                        index = i;
                        highest = value;
                    }
                }
            }

            return Integer.parseInt((numStr.charAt(index) + "" + numStr.charAt(index + 1)));
        }


        public static void reverse(List<String> list) {
            List<String> temp = new ArrayList<>(list.size());

            for(int i = list.size() - 1; i>=0; i--){
                String s = list.get(i);
                temp.add(s);
            }
            temp.stream().map(i->i).collect(Collectors.toList()).forEach(System.out::println);


        }



        public static Integer arrayChallenge(int[] arr) {

            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (j > i) {
                        if (arr[j] > arr[i]) {
                            result.add(arr[j] - arr[i]);
                        }
                    }
                }
            }
            int res = -1;
            for (Integer a : result) {
                if (a > res) res = a;

            }
            return res;
        }

        public static int secondMax(int[] arr) {
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

    }
}