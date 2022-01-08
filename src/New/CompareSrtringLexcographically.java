package New;

import java.util.ArrayList;
import java.util.List;

public class CompareSrtringLexcographically {

    static String newlyString(String str, int k){
        String X ="";
        while(str.length() > 0){

            char temp = str.charAt(0);

            for(int i = 1; i < k && i < str.length(); i ++){
                 if (str.charAt(i) < temp){
                     temp = str.charAt(i);
                 }
            }
            X = X + temp;

            for (int i = 0; i < k; i++) {
                if (str.charAt(i) == temp) {

                    str = str.substring(0, i) + str.substring(i + 1);
                    //s.erase(s.begin() + i);
                    break;
                }
            }

            for (int i = 0; i < k; i++) {
                if (str.charAt(i) == temp) {

                    str = str.substring(0, i) + str.substring(i + 1);
                    //s.erase(s.begin() + i);
                    break;
                }
            }
        }
        return X;
    }





    static String newString(String s, int k) {
        List<Integer> lst = new ArrayList<>();


        lst.stream().mapToInt(o->o).toArray();
        // new string
        String X = "";

        // Remove characters until
        // the string  is empty
        while (s.length() > 0) {

            char temp = s.charAt(0);

            // Traverse to find the smallest character in the
            // first k characters
            for (int i = 1; i < k && i < s.length(); i++) {
                if (s.charAt(i) < temp) {
                    temp = s.charAt(i);
                }
            }

            // append the smallest character
            X = X + temp;

            // removing the lexicographically smallest
            // character from the string
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == temp) {

                    s = s.substring(0, i) + s.substring(i + 1);
                    
                    //s.erase(s.begin() + i);
                    break;
                }
            }
        }

        return X;
    }

    public static void main(String[] args) {
        //gaurang  agangru
        System.out.println(newlyString("gaurang", 2));
    }

}
