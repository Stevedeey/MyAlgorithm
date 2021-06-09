package tosinRepo;

public class LargestNumber {
    public static String LongestWord(String sen) {
        char[] myChar = sen.toCharArray();
        String filterText = "";
        for (int i = 0; i < myChar.length; i++) {
            if (!Character.isLetter(myChar[i])) {
                filterText = myChar[i] + "";
            }
        }
        System.out.println(filterText);
//           String[] split = sen.split(" ");
//
//
//        for (int i = 0; i < split.length; i++) {
//
//            System.out.println(split[i]);
//
//        }
        return sen;
    }

    public static void main(String[] args) {
        LongestWord("I am good");
    }
}
