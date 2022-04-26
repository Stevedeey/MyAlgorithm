package _encentral;

import java.util.*;

public class QuickPractice {

    public static void main(String[] args) {
//        var str = stringChallenge(new String[]{"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"});
//        int[] as = {10, 9, 8, 5};
//        var res = arrayChallenge(as);
//
//        System.out.println("Result: " + res);
        List<Integer>list = Arrays.asList(1,2,3,4,5);
        System.out.println(calculate(list,2));

        int[] arr = {5, 5, 3, 66, 4, 3, 6, 4, 5, 3};

        bubbleSort(arr);
        var answer =Arrays.toString(arr);
        System.out.println(answer);

//        var result = peakElement(arr);
//        System.out.println("Now the result is: " + result);

//        int a = arrayChallenge(new int[] {14,20,4,12,5,11});
//        System.out.println("Result: "+ a);



//        String dd = Distinct("babab");
//        System.out.println("First class:-> "+ dd);
//        System.out.println("RES1: "+longest(453857));
//        System.out.println("RES2: "+longest(363223311));

    }
    public static List<Integer> calculate(List<Integer> number, int n){
        Collections.rotate(number,n);
        return number;
    }


    // Array of string with
    public static String stringChallenge(String[] strArr) {

       String[] dictionary  = strArr[1].split(",");
       List<String> listOfWord = new ArrayList<>();
       for (String eachWord : dictionary){

           if(strArr[0].indexOf(eachWord) != -1){

               for (String word : listOfWord){
                   if((eachWord + word).equals(strArr[0])){
                       return eachWord + "," + word;
                   }
                   if((word + eachWord).equals(strArr[0])){
                       return word + "," + eachWord;
                   }
               }
               listOfWord.add(eachWord);
           }
       }
       return "not possible";
    }

    //profit or no profit
    public static Integer arrayChallenge(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j > i){
                    if(arr[j] > arr[i]){
                        list.add(arr[j] - arr[i]);
                    }
                }
            }

        }
        int max = 0;
        for (Integer a : list){
            if(a > max){
                max = a;
            }
        }
     return  max;
    }


    public static String Distinct(String str) {

        Set<Character> set = new HashSet<>();
        int count = 0;
        while (count < str.length()){
            set.add(str.charAt(count));
            count++;
        }
        return (set.size()) >= 10 ? "true" : "false";
    }

    public static int longest(int num) {
        //  System.out.println("RES1: "+longest(453857));
        int highest = 0, index = 0;

        String strNum = String.valueOf(num);

        for (int i = 0; i < strNum.length(); i++) {
            if(i < strNum.length() - 1){
                int value = Integer.parseInt(strNum.charAt(i) + "" + strNum.charAt(i + 1));

                if(value > highest){
                    index = i;
                    highest = value;
                }
            }
        }

        return Integer.parseInt(strNum.charAt(index) + "" + strNum.charAt(index+1));

    }

    public static String se(String str) {

        return "";
    }
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void fibonacci(int num){
      if(num > 0){
          n3 = n1 + n2;
          n1 = n2;
          n2 = n3;
          System.out.println(" "+ n3);
          fibonacci(num - 1);
      }

    }

    public static int[] twoSum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)){
               return new int[]{map.get(complement), i};
            }else {
                map.put(arr[i], i);
            }
        }
        return new int[]{};

    }



    public static Integer peakElement(int[] arr) {

        if(arr.length == 0 || arr == null){
            return null;
        }
        int n = arr.length - 1;
        int start = 0;
        int end = n;
        while (start <= end){
            int mid = start + end / 2;
            if(((mid == 0)||(arr[mid] > arr[mid - 1])) && ((arr[mid] > arr[mid+ 1])||(mid == end)) ){
                return arr[mid];
            }else if( (mid > 0)&&(arr[mid-1] > arr[mid]) ){
                end = mid - 1;
            }else {
                end = mid + 1;
            }
        }
        return null;
    }

    public static void bubbleSort(int[] arr){

        // int[] arr = {5, 5, 3, 66, 4, 3, 6, 4, 5, 3};

        for (int i = 0; i < arr.length; i++) {
            boolean isSorted  = true;

            for (int j = 1; j < arr.length - i; j++) {

                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    isSorted = false;
                }

            }
            if(isSorted) return;
        }
    }

    public static int secondMax(int[] arr){

        int max = 0, preMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                preMax = max;
                max = arr[i];
            }

            if(arr[i] > preMax && arr[i] < max){
                //  if(arr[i] < max && arr[i] > premax){
                preMax = arr[i];
            }

        }
        return preMax;
    }
}
