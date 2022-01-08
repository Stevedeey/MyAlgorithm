package utilities;

import java.util.*;

public class TestingCollection {


    public static void main(String[] args) {
        /*
         * COMPARE AND RETURN MIN OBJ USING COMPARATOR
         * */
        List<String> list = List.of("hfjhfjhf", "sdfdg", "sfdg", "sdf");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        String max = Collections.max(list, comparator);
        System.out.println("The maximum String is " + max);
        list.stream().forEach(System.out::println);

    }
}
