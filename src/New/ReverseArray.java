package New;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,5,6,7,8);
        System.out.println(reverseArray(list));

        String s1 = "yes";
        String s2= "yes";
        System.out.println(s1==s2);
    }

    public static void main(char[] args) {
        System.out.println("second");
    }
    public static List<Integer> reverseArray(List<Integer> a) {

        List<Integer> tempList = new ArrayList<>();
        for (int i = a.size(); i > 0; i--) {
            tempList.add(i);
        }
        return tempList;

    }
}
