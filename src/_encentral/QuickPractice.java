package _encentral;

import java.util.*;

public class QuickPractice {

    public static void main(String[] args) {
//        var str = stringChallenge(new String[]{"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"});
//        int[] as = {10, 9, 8, 5};
//        var res = arrayChallenge(as);
//
//        System.out.println("Result: " + res);

//        int[] arr = {5, 5, 3, 66, 4, 3, 6, 4, 5, 3};
//        var result = peakElement(arr);
//        System.out.println("Now the result is: " + result);

        System.out.println("RES1: "+longest(453857));
        System.out.println("RES2: "+longest(363223311));

    }


    // Array of string with
    public static String stringChallenge(String[] strArr) {

        String[] dictionary = strArr[1].split(",");
        List<String> list = new ArrayList<>();

        for (String word : dictionary) {

            if (strArr[0].indexOf(word) != -1) {

                for (String eachWord : list) {
                    if ((word + eachWord).equals(strArr[0])) {
                        return word + "," + eachWord;

                    }
                    if ((eachWord + word).equals(strArr[0])) {
                        return eachWord + "," + word;
                    }
                }
                list.add(word);
            }
        }
        return "not possible";
    }

    //profit or no profit
    public static Integer arrayChallenge(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j > i) {
                    if (arr[j] > arr[i]) {
                        list.add(arr[j] - arr[i]);

                    }
                }
            }

        }
        return list.size() > 1 ? Collections.max(list) : -1;
    }


    public static String Distinct(String str) {

        return "";
    }

    public static int longest(int num) {
        int index = 0, highest = 0;
        String strNum = String.valueOf(num);

        for (int i = 0; i < strNum.length() - 1; i++) {

//            if(i < strNum.length() - 1){
            int value = Integer.parseInt(strNum.charAt(i) + "" + strNum.charAt(i + 1));
            if (value >= highest) {
                index = i;
                highest = value;
            }

//            }
        }
        return Integer.parseInt(strNum.charAt(index) + "" + strNum.charAt(index + 1));
    }

    public static String se(String str) {

        return "";
    }

    public static int[] twoSum(int[] arr, int target) {
        return new int[]{};

    }

    public static int[] twoSumm(int[] arr, int target) {
        return new int[]{};
    }

    public static Integer peakElement(int[] arr) {
        return 0;
    }
}
