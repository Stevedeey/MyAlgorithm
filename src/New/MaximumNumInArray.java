package New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumNumInArray {
    public static void main(String[] args) {
      int max =   max2(new int[]{34,1000,567,34,555,7});
        System.out.println("maximum num "+ max);

        //largest

        int[] arrLa = {1,2,4,5,6,7,8};
        int len = arrLa.length;

        System.out.println(largest(arrLa, len));


    }
    public static int max(int [] arr){
        int maximum =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maximum) maximum = arr[i];
        }
        return maximum;
    }
    public static int max2(int [] arr){
       int max =  Arrays.stream(arr).max().getAsInt();
        List<Integer> intL = new ArrayList<>();

       return  max;
    }
    static int largest(int []arr,
                       int n)
    {
        Arrays.sort(arr);
        return arr[n - 1];
    }

}
