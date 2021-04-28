package tosinRepo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CharCount {
    public static int characterCount(String[] words, String chars) {
        String value = "";
        for (int i = 0; i < words.length; i++) {
            boolean check = checkValidity(words[i], chars);
            if (check) value += words[i];
        }
        return value.length();
    }

    public static boolean checkValidity(String words, String chars) {
        for (char letter : words.toCharArray()) {
            if (chars.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }

    public void doSomething()
    {
        int[] arra = {5,6,7,8,9};
       int fre =  Collections.frequency(Arrays.asList(arra),9);
    }
    public static void main(String[] args) {
        System.out.println(characterCount(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr"));
    }
}