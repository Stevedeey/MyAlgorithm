package _encentral;

import java.util.*;

public class __EncentralAlgo {


    public static int secondMax(int[] arr){
        int max = 0, secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;

    }
    public static Integer largest(Integer num){
        int value = 0, highest = 0, index = 0;
        String strNum = String.valueOf(num);
        for (int i = 0; i < strNum.length(); i++) {
            if(i < strNum.length() - 1){
                value = Integer.parseInt(strNum.charAt(i) + "" + strNum.charAt(i + 1));
                if(value >= highest){
                    index = i;
                    highest = value;
                }
            }
            
        }
        return Integer.parseInt(strNum.charAt(index)+ "" +strNum.charAt(index+1));
        
    }

    public static void fizzBuzz(){

        for (int i = 1; i <= 15; i++) {
            if(i % 5 == 0){
                if(i % 3 == 0) System.out.println("FizzBuzz");
                else System.out.println("Fizz");
            }
            else if(i % 3 == 0) System.out.println("Buzz");
            else System.out.println(i);

        }
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

    private static int indexOfFirstRepeatinNo(int[] arr){

        //initialize a var with -1
        //loop through the list from the right
        //create a hashSet
        //check if eah no is found in th hashset
        //if yes, set the var to the index, if no add to hashset
        var set = new HashSet<>();
        int repeat = -1;
        for(int i = arr.length - 1; i >= 0; i--){

            if(set.contains(arr[i])){
                repeat = i;
            }else {
                set.add(arr[i]);
            }
        }
        return repeat;
    }

    private static int largest22(int num){
        int highest = 0, index = 0;
        String strNum = String.valueOf(num);
        for (int i = 0; i < strNum.length(); i++) {
            if(i < strNum.length() - 1 ){
                int value = Integer.parseInt(strNum.charAt(i) + "" +strNum.charAt(i + 1));
                if(value >= highest){
                    index = i;
                    highest = value;
                }
            }
        }
        return Integer.parseInt(strNum.charAt(index) +"" +strNum.charAt(index + 1));
    }

    //String challenge
    public static String stringChallenge(String[] str){

        String[] dictionary = str[1].split(",");
        List<String>  list = new ArrayList<>();
        for (String word : dictionary){
            if(str[0].indexOf(word) != -1){
                for (String savedWord: list
                     ) {
                    if((word + savedWord).equals(str[0])){
                        return word + "," + savedWord;
                    }
                    if((savedWord + word).equals(str[0])){
                        return savedWord + "," + word;
                    }
                }

                list.add(word);
            }
        }
        return "not possible";
    }

    public static void main(String[] args) {
        int [] arr = { 66,2,7,11, 15, 25, 25, 15, 7};
        //var result = Arrays.toString(twoSum(arr,9));

        var result = indexOfFirstRepeatinNo(arr);

        System.out.println(result);

//        String result = distinct("abcdefghijklmnop");
//        System.out.println("Result: "+ result);

        //System.out.println("RES1: "+longest(453857));
//          System.out.println("RES2: "+largest(3632));
        //  fizzBuzz();
       // System.out.println(arrayChallenge(new int[]{7,5,3,8,10,4,9}));


    }
    public static int arrayChallenge(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j > i){
                    if(arr[j] > arr[i]){
                        list.add(arr[j] - arr[i]);
                    }
                }
            }
        }
        return Collections.max(list);
    }
    public static String distinct(String str){
        Set<Character> set = new HashSet<>();
        String flag = "false";
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

       if(set.size() >= 10)
       {flag = "true";}

       return flag;
    }

    public static int secondMaxw(int[] arr) {
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
