package tosinRepo;

public class Spin {

    public static String spinWords(String sentence) {
        String str = "";
        String toTrim = "";
        String[] splitArray = sentence.split(" ");

        for (int i = 0; i < splitArray.length; i++) {

            if (splitArray[i].length() < 5) {
                str += splitArray[i] + " ";

            } else {
                StringBuffer sbf = new StringBuffer(splitArray[i]);
                str += sbf.reverse() + " ";
            }

        }
        toTrim = str.trim();
        return toTrim;
    }

    public static void main(String[] args) {
        System.out.println(spinWords("This is a another test"));
    }
}
