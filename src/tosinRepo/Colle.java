package tosinRepo;

import java.util.*;

public class Colle {
    static List alist = new ArrayList();

    public static void doomethib() {
        alist.add("Ade");
        alist.add("Yemi");
        ListIterator iterator = alist.listIterator(alist.size());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
//        alist.forEach(str->{
//            System.out.println(str);
//        });

        Map<String, Integer> map = new HashMap<>();
        map.put("Ade", 5);
        map.put("Yemi", 6);
        map.put("Ayo", 5);

    }



    public static void main(String[] args) {
        doomethib();
    }

}
