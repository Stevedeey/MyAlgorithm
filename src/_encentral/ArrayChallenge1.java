package _encentral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayChallenge1 {

    /*

Have the function ArrayChallenge(strArr) read the array of strings stored in strArr,
* which will contain 2 elements: the first element will be a sequence of characters, and the
*  second element will be a long string of comma-separated words, in alphabetical order, that
* represents a dictionary of some arbitrary length. For example:strArr can
* be: ["hellocat", "apple,bat,cat,goodbye,hello,yellow,why"].
*  Your goal is to determine if the first element in the input can be split
* into two words, where both words exist in the dictionary that is provided in the second input.
* In this example, the first element can be split into two words: hello and cat because both of those words are in the dictionary.
Your program should return the two words that exist in the dictionary separated by a comma. So for the example above, your program should return hello,cat.
*  There will only be one correct way to split the first element of characters into two words. If there is no way to split string into two words that exist in the
* dictionary, return the string not possible. The first element itself will never exist in the dictionary as a real word.
*
* ExamplesInput: new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}
Output:base,ball Input: new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"}
Output:abcg,efd


    *
    *
    * */

    public static void main(String[] args) {
        var result = ArrayChallenge(new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"});
        System.out.println("Result: "+ result);

        var res = maxProfit(new int[]{10,9,8,7,4});
        System.out.println("Result: $" + res);
    }

    public static String ArrayChallenge(String[] strArr) {
        List<String> result = new ArrayList<>();
        String[] dictionary = strArr[1].split(",");
        for (String data : dictionary) {
            if (strArr[0].indexOf(data) != -1) {
                for (String each : result) {
                    if ((data + each).equals(strArr[0])) {
                        return data + "," + each;
                    }

                    if ((each + data).equals(strArr[0])) {
                        return each + "," + data;
                    }
                }
                result.add(data);
            }
        }

        return "not possible";
    }

    private static Integer maxProfit(int[] arr) {
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


}
