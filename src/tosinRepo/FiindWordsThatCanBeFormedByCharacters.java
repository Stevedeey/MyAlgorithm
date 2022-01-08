package tosinRepo;

import java.nio.charset.UnmappableCharacterException;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FiindWordsThatCanBeFormedByCharacters {
    int counter = 0;

    public static int countCharacter(String[] words, String myCharacters) {
        StringBuilder resultBuild = new StringBuilder();
        Map<Character, Long> charMap = myCharacters.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> wMap;
        for (String w : words) {
            wMap = w.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            boolean taken = true;
            for (int i = 0; i < w.length(); i++) {
                if (!charMap.containsKey(w.charAt(i))) {
                    taken = false;
                    break;
                }
                char c = w.charAt(i);
                if (wMap.get(c) > charMap.get(c)) {
                    taken = false;
                    break;
                }
            }
            if (taken)
                resultBuild.append(w);
        }
        return resultBuild.length();

    }
}
