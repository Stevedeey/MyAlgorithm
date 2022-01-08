package tosinRepo;

import java.util.*;

public class IteratorClass {
    public static int countS(Boolean[] sheepArray) {
        return Collections.frequency(Arrays.asList(sheepArray), true);
    }

    public static int countS2(Boolean[] sheepArray) {
        int count = 0;
        for (int i = 0; i < sheepArray.length; i++) {
            if (sheepArray[i].equals(true)) {
                count++;
            }

        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countS2(new Boolean[]{true, false, true}));
//        List<String> list = new ArrayList<>();
//        list.add("Volvo");
//        list.add("BMW");
//        list.add("Ford");
//        //   cars.add("Mazda");
//        Iterator<String> iterator = list.iterator();
//
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
//
//


    }


}
