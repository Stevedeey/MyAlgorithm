package tosinRepo;

import java.util.ArrayList;
import java.util.List;

public class NumberCounting {
    public static Integer counting(String s) {

        int counter = 0;
        int starter = 2;

        List arr = new ArrayList();
        String b = "01";
        String c = "10";

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                arr.add(b);
                arr.add(c);
            } else {
                b = "0" + b + "1";
                c = "1" + c + "0";
                arr.add(b);
                arr.add(c);
            }
        }
        //System.out.println(arr);

        while (starter < s.length()) {
            for (int i = 0; i < s.length() - (starter - 1); i++) {
                String value = s.substring(i, starter + i);
                System.out.println("val" + value);
                if (arr.contains(value)) {
                    counter++;
                }
            }


            starter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(counting("00110"));
//        System.out.println(counting("10101"));
//        System.out.println(counting("10001"));
        //   System.out.println(counting("00100000111111111110001111110000000111111000111010101010101010"));
    }
}
