package tosinRepo;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class UseOfMaxAndNoOfCharacterInaString {
    public static String firstNonRePeating(String str) {
        String letter = "";
        String strIgnoreCase = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        char[] characters = strIgnoreCase.toCharArray();
        int counter = 0;

        // boolean checkAvailability = isFound(str,characters[i]+"");

        for (char x : characters) {
            if (map.containsKey(x)) {
                int oldCount = (int) map.get(x);
                map.put(x, oldCount + 1);
            } else {
                map.put(x, 1);
            }
            map.remove(' ');

        }
        int max = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            max = entry.getValue();
            for (int i = 0; i < map.size(); i++) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                }
            }

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                letter = entry.getKey() + "";
            }


        }


        return letter;
    }
//    public static boolean isFound(String words, String le)
//    {
//        char [] letters = words.toCharArray();
//        for (char letter:letters ) {
//            if (!words.contains(le+""))
//            {
//                return false;
//            }
//
//        }
//        return  true;
//    }

    public static void main(String[] args) {
        //System.out.println(isFound("Daayo","a"));
        System.out.println(firstNonRePeating("DaaYO"));
    }
}
