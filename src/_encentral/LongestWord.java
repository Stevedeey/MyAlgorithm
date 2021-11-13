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

      String[] str = sen.split(" ");
      String result = "";
      int count = 0;

      for (String each : str){

          each = each.replaceAll("[^A-Za-z]", "");
          int eachCount = each.length();
          if(eachCount > count){
              count = eachCount;
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
