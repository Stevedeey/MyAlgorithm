package tosinRepo;

public class FirstNonReapeatingLetter {
    public static String firstNonReapeatingLetter(String str) {
        String letter = "";


        for (int i = 0; i < str.length(); i++) {
            String newString = String.valueOf(str.charAt(i)).toLowerCase();
            String toLowerCase = str.toLowerCase();
            if (str.indexOf(newString) == str.lastIndexOf(newString)) {
                letter = String.valueOf(str.charAt(i));
                break;
            }
        }

        return letter;
    }

    public static void main(String[] args) {
        System.out.println(firstNonReapeatingLetter("multimediua"));
    }
}
