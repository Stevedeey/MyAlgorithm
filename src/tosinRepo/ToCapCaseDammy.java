package tosinRepo;

public class ToCapCaseDammy {
    public static String toCapCase(String s) {
        String[] str = new String[0];
        String newStr = "";
        if (s.indexOf(" ") != -1) str = s.split(" ");
        else if (s.indexOf("\t") != -1) str = s.split("\t");
        else if (s.indexOf("\n") != -1) str = s.split("\n");
        else {
            char first = Character.toUpperCase(s.charAt(0));
            return first + s.substring(1);
        }
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                char first = Character.toUpperCase(str[i].charAt(0));
                str[i] = first + str[i].substring(1);
            }
        }
        for (String item : str) newStr += item + " ";
        newStr = newStr.trim();
        if (str[0].equals("")) newStr = " " + newStr;
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(toCapCase("Aa A Aaa"));
    }
}
