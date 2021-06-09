package tosinRepo;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

    public static String FirstReverse(String str) {

        char[] arr = str.toCharArray();
        String value = "";
        // List<String> list  =new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {

            value += arr[i] + "" +
                    "";

        }

        return value;
    }

    public static void main(String[] args) {
        System.out.println(FirstReverse("My name"));
    }
}
