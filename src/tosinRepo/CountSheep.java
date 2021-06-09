package tosinRepo;

import java.util.Arrays;
import java.util.Collections;

public class CountSheep {

    /*
     *           Consider an array/list of sheep where some sheep may be missing from their place
     * .          We need a function that counts the number of sheep present in the array (true means present).
     *
     *
     * */


    public static int countSheeps2(Boolean[] arrayOfSheeps) {
        return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {

        String true_false = "";
        //System.out.println(true_false);
        for (int i = 0; i < arrayOfSheeps.length; i++) {

            true_false += arrayOfSheeps[i] + ",";

        }

        String[] arrayOfTrueFalse = true_false.split(",");
        int count = 0;
        String tr = "true";
        for (int i = 0; i < arrayOfTrueFalse.length; i++) {

            if (arrayOfTrueFalse[i].equals(tr)) {
                count++;
            }
        }


        return count;
    }


    public static boolean isFound(String chara, String ar) {
        for (int i = 0; i < ar.length(); i++) {
            if (ar.contains(chara)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(countSheeps(new Boolean[]{false, true, true, false, true}));
        System.out.println(countSheeps2(new Boolean[]{false, true, true, false, true, true, true}));
        // System.out.println(countSheep(new Boolean[]{false, true, true, false, true, true, true}));

    }
}