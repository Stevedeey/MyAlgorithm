package tosinRepo;

public class CharCount {
    public static int characterCount(String[] words, String chars){
        String value = "";
        for(int i = 0; i < words.length; i++){
            boolean check = checkValidity(words[i], chars);
            if(check) value += words[i];
        }
        return value.length();
    }
    public static boolean checkValidity(String words, String chars){
        for(char letter: words.toCharArray()){
            if(chars.indexOf(letter) == -1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(characterCount(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr"));
    }
}