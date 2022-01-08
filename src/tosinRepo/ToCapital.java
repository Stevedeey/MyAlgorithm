package tosinRepo;

public class ToCapital {
    public static void main(String[] args) {
        System.out.println(accum("RqaEzty"));
    }

    public static String accum(String s) {
        String value = "";
        for (int i = 0; i < s.length(); i++) {
            String check = s.charAt(i) + "";
            String repeat = check.repeat(i + 1);
            String res = check.toUpperCase() + repeat.substring(1).toLowerCase();
            value += res + "-";
        }
        return value.substring(0, value.length() - 1);
    }

}