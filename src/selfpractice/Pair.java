package selfpractice;

import java.util.ArrayList;
import java.util.List;

public class Pair {
    public static void main(String[] args) {
        System.out.println(checkEven(11, 3));
    }

    public static List checkEven(Integer num, Integer part) {
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        int diff = 0;
        int evenCounter = 0;
        for (int i = 1; i <= num; i++) {
            if (i % part == 0) {
                list.add(i);
                evenCounter++;
            }

        }
        if (evenCounter == part) {
            diff = evenCounter - part;
        }
        for (int i = 0; i < diff; i++) {

        }
        return list;
    }
}
