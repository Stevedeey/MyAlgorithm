package selfpractice;

import java.util.ArrayList;
import java.util.List;

public class Array {
    private int[] firstArray;
    private int count; //

    public Array(int length) {
        firstArray = new int[length];
    }

    public void insert(int item) {
        if (firstArray.length == count) // to check if the array is full
        {
            //create a new arry that is twice as the first aray
            int[] secondArray = new int[count * 2];
            //copy all the existing items
            for (int i = 0; i < count; i++) {
                secondArray[i] = firstArray[i];

            }
            firstArray = secondArray;
        }
        firstArray[count++] = item;
        //count++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++) {

            firstArray[i] = firstArray[i + 1];
        }
        count--;

    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (firstArray[i] == item)
                return i;
        return -1;
    }


    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(firstArray[i]);
        }
    }

    public static int secondMax(int[] arr) {
        int premax = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                premax = max;
                max = arr[i];
            }
            if (arr[i] > premax && arr[i] < max) {
                premax = arr[i];
            }
        }
        return premax;
    }

    public static void main(String[] args) {
        System.out.println(secondMax(new int[]{9909, 90, 7, 5, 3, 8, 10, 4, 9, 100, 900, 8, 9000}));

    }
}
