package _encentral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class QuickPractice {

    public static String stringChallenge(String[] strArr) {

        String[] dictionary = strArr[1].split(",");
        List<String> stringList = new ArrayList<>();

        for (String word : dictionary){
            if(strArr[0].indexOf(word) != -1){

                for (String item : stringList){
                    if( (word + item).equals(strArr[0])){
                        return word + ","+ item;
                    }

                    if((item + word).equals(strArr[0])){
                        return item + "," + word;
                    }
                }
                stringList.add(word);
            }
        }


        return "";
    }

    public static Integer arrayChallenge(int[] arr) {

        List<Integer> listOfProfits = new ArrayList<>();

           for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr.length; j++) {

                   if (j > i) {
                       if (arr[j] > arr[i]) {
                           listOfProfits.add(arr[j] - arr[i]);
                       }

                   }

               }
           }

        if(listOfProfits.size() > 1) return Collections.max(listOfProfits);
        else return -1;
    }


    public static String Distinct(String str) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
            }
        }
        return (list.size() > 10) ? "true" : "false";
    }
public static int longest(int num){

        int index = 0, highest = 0;
        String strNum = String.valueOf(num);
    for (int i = 0; i < strNum.length(); i++) {
        if(i < strNum.length() - 1){
            int value = Integer.parseInt(String.valueOf(strNum.charAt(i) + strNum.charAt(i + 1)));

            if(value >= highest){

                index = i;
                highest = value;
            }
        }
    }
    return Integer.parseInt(strNum.charAt(index) + "" + strNum.charAt(index + 1));
}

    public static void main(String[] args) {
        var result = arrayChallenge(new int[]{14,20,4,12,5,11});
//        System.out.println("Result: " + result);
        String str = "babababa";
        System.out.println(">>: "+ Distinct(str));
    }
}
