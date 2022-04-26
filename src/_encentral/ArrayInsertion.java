package _encentral;

import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        var d = insertElementInArray2(new int[]{1, 2, 3, 4, 5}, 6, 4);
        System.out.println(Arrays.toString(d));

    }

    //[34,8,10,3,2,80,30,33,1]  index 2

    //

    public static int[] insertElementInArray(int[] array, int element, int index) {
        var newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = element;
                newArray[i + 1] = array[i];

            } else {
              newArray[i + 1] = array[i];

            }
        }
        return newArray;
    }

    public static int[] insertElementInArray2(int[] array, int element, int index) {

        for(int i = array.length - 1; i > index; i--) {
                 array[i] = array[i - 1];
        }
        array[index] = element;

        return array;
    }



    }
