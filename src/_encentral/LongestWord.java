package _encentral;

import java.util.ArrayList;
import java.util.List;

public class LongestWord {

   // Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string.
    // If there are two or more words that are the same length, return the first word from the string with that length.
    // Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"

//    Examples
//    Input: "fun&!! time"
//    Output: time
//    Input: "I love dogs"
//    Output: love

    public static String LongestWord(String sen) {

        String[] arr = sen.split(" ");
        String result = "";
        int count = 0;


        for (String each : arr){

            each = each.replaceAll("[^A-Za-z]", "");

            int eachLen = each.length();
            if(eachLen > count) {
                count = eachLen;
                result = each;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(LongestWord("fun&!! time"));
        System.out.println(LongestWord("I love dogs"));
    }
}
