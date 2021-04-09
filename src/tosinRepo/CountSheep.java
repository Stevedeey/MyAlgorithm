package tosinRepo;

import java.util.Arrays;
import java.util.Collections;

public class CountSheep {

    public static int countSheeps2(Boolean[] arrayOfSheeps) {
        return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {

        String true_false = "";
        System.out.println(true_false);
        for (int i = 0; i < arrayOfSheeps.length; i++) {

            true_false += arrayOfSheeps[i] + ",";

        }

        String[] arr = true_false.split(",");
        int count = 0;
        String tr = "true";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(tr)) {
                count++;
            }
        }


        return count;
    }


    public static void main(String[] args) {
        System.out.println(countSheeps(new Boolean[]{false, true, true, false, true}));
        System.out.println(countSheeps2(new Boolean[]{false, true, true, false, true, true, true}));

    }
}