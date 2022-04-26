package _encentral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringManipulationCoderbyte {

//    Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers,
//    letters, and question marks, and check if there are exactly 3 question marks between every pair of two numbers
//    that add up to 10. If so, then your program should return the string true, otherwise it should return the string false.
//    If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.

    //    For example: if str is "arrb6???4xxbl5???eee5" then your program should return true
//    because there are exactly 3 question marks between 6 and 4, and 3 question marks
//    between 5 and 5 at the end of the string.


   static String QuestionsMarks(String str) {
       String[] strArr = str.split("");
       int count = 0;
       for (int i = 0; i < strArr.length; i++) {
           if (strArr[i].equals("?")) {
               count++;
           }
       }
       if (count % 3 != 0) {
           return "false";
       }
       for (int i = 0; i < strArr.length; i++) {
           if (strArr[i].equals("?")) {
               if (strArr[i + 1].equals("?")) {
                   if (strArr[i + 2].equals("?")) {
                       if (Integer.parseInt(strArr[i - 1] + strArr[i + 3] + "") == 10) {
                           return "true";
                       }
                   }
               }
           }
       }
       return "false";

//       //
//       while(str.contains("???")){
//           int questionMark = str.indexOf("???");
//
//           if(questionMark == -1) { return false; }
//           var firstNumber = str.charAt(questionMark - 1);
//           var secondNumber = str.charAt(questionMark + 3);
//
//           if(Character.isDigit(firstNumber) && Character.isDigit(secondNumber)) {
//               int firstNumberInt = Character.getNumericValue(firstNumber);
//               int secondNumberInt = Character.getNumericValue(secondNumber);
//
//               if (firstNumberInt + secondNumberInt == 10) return true;
//           }
//
//           str = str.substring(questionMark + 4);
//       }
//
//       return false;
//
   }


    public static void main(String[] args) {
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }


    public static String HTMLElements(String str) {

        List<String> openTags = Arrays.asList("<div>", "<p>", "<i>", "<em>", "<b>");
        List<String> closeTags = Arrays.asList("</div>", "</p>", "</i>", "</em>", "</b>");
        List<String> tags = new ArrayList<>();
        List<String> strArr = new ArrayList<>();

        int x = 0, y = 0;

        for (int i = 0; i < str.length() + 1; i++) {
            if(x != 0 && y != 0) {
                tags.add(str.substring(x -1, y));
                x = 0; y = 0;
            }

            if(i == str.length()) break;

            if(str.charAt(i) == '<') { x = i+1; }
            if(str.charAt(i) == '>') { y = i+1; }
        }

        System.out.println(tags);

        for (int i = 0; i < tags.size(); i++) {
            if(openTags.contains(tags.get(i))) strArr.add(tags.get(i));
            else{
                if(strArr.size() == 0) return tags.get(i);

                String lastTag = strArr.get(strArr.size() - 1);
                if(tags.get(i).equals(closeTags.get(0)) && lastTag.equals(openTags.get(0))
                || tags.get(i).equals(closeTags.get(1)) && lastTag.equals(openTags.get(1))
                || tags.get(i).equals(closeTags.get(2)) && lastTag.equals(openTags.get(2))
                || tags.get(i).equals(closeTags.get(3)) && lastTag.equals(openTags.get(3))
                || tags.get(i).equals(closeTags.get(4)) && lastTag.equals(openTags.get(4))) {
                    strArr.remove(strArr.size() - 1);
                }else{
                    break;
                }
            }
        }

       return  strArr.get(strArr.size() - 1).replaceAll("<", "").replaceAll(">", "");

    }
}

/***
 *  if (Integer.parseInt(strArr[i - 1] + strArr[i + 3] + "") == 10) {
 *                            return true;
 *                        }
 */
