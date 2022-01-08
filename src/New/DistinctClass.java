package New;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class DistinctClass {
    public static void main(String[] args) throws IOException {


//        String str = "390k6";
//        int  num = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            while(str.charAt(i)=='0' || str.charAt(i) == '9'){
//                num = num * 10 + str.charAt(i) + '0';
//            }
//        }
//        System.out.println("This is num: "+ num);
//
//
//
//        int N = 10;
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%s X %s = %s %n", N, i, N * i);
//
//        }

        int [] arr = {3,5,6,7,5};
        int arrr []= {4,6,8,2,5};
        System.out.println("First Array: "+evenOddArray(arr));
        System.out.println("Second Array: "+evenOddArray(arrr));


    }

    public  static  int evenOddArray(int [] integers){

        int [] array = Arrays.stream(integers).filter(i-> i % 2 ==0).toArray();
        return array.length == 1 ? array[0] : Arrays.stream(integers)
                .filter(i->i % 2 !=0).findAny().getAsInt();
    }

    public static boolean distinct(String str){

        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i)+ "");
        }
        if(set.size() >= 10) return  true;

        return false;
    }
}

 class Solution {
    public static void main(String[] args) throws IOException {



    }
}
