package challenges.stringChallenge;

import java.util.*;

public class Challenge {

    public static void main(String[] args) {
//        var map = isDuplicate("independent");
//        for (Map.Entry<Character, Integer> m : map.entrySet()) {
//            if (m.getValue() > 1)
//                System.out.printf("%s : %d %n", m.getKey(), m.getValue());
//        }
//    var result = anagram("Army" , "Mary");
//        System.out.println("Result>>>"+result);
        ada();
    }

    private static boolean anagram(String str, String sr) {
        // Army = Mary
        if(str.length() != sr.length()) return false;
        char[] characters = str.toCharArray();
        int count = 0;
        for (char each: characters){
            if(sr.indexOf(each) != -1) count++;
        }
        if(str.length() == count) return true;
        return false;
    }

    private static Map<Character, Integer> isDuplicate(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var charArray = str.toCharArray();
        List<Character> characterList = new ArrayList<>();
        // "Java"
        for (Character c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);

            } else {
                map.put(c, 1);
            }
        }
        map.remove(' ');
        return map;
    }

    private static void ada(){
        var set = new HashSet<String>();

        set.add("Baldung");
        set.add("Is");
        set.add("Awesome");
        System.out.println(set);

        TreeSet treeSet = new TreeSet(set);
        System.out.println("Treeset is "+ treeSet);
    }
}
