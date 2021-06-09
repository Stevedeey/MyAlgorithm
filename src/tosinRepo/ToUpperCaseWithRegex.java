package tosinRepo;

import java.util.regex.Pattern;

public class ToUpperCaseWithRegex {
    public static String toCapCase(String s) {
        return Pattern.compile("(^|\\s)[a-z]").matcher(s).replaceAll(m -> m.group().toUpperCase());
    }

    public static void main(String[] args) {
        System.out.println(toCapCase("aa aa"));
    }
}
