package tosinRepo;

public class JutsTest {
    public static String toCapital2(String str) {
        String value = "";
        for (int i = 0; i < str.length(); i++) {
            String check = str.charAt(i) + "";
            String repeat = check.repeat(i + 1);
            String res = check.toUpperCase() + repeat.substring(1).toLowerCase();
            value = value + res + "-";


        }
        return value.substring(0, value.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(toCapital2("Abbc"));
    }
}
