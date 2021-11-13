package _encentral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueArray {
    public static int[] uniqueArray(int [] arr){

        List<Integer> list = new ArrayList<>();
        if(arr == null || arr.length == 0){
            return new int[]{};
        }

        for (int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }


        }
        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
          int arr[] = new int[]{3,5,3,4,5,5,4,3,5,6,7,8,9,0,-5};
          System.out.println(Arrays.toString(uniqueArray(arr)));
    }
}
