package tosinRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackArray1 {
    public static Integer packArray(List<Integer> arr) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Integer result = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            list1.add(arr.get(i) + arr.get(i + 1));
            i = i + 1;
        }
        for (int i = 0; i < list1.size() - 1; i++) {
            list2.add(list1.get(i) * list1.get(i + 1));
            i = i + 1;
        }
        for (int i = 0; i < list2.size(); i++) {
            result += list2.get(i);
        }
        return result;

    }

    public static void main(String[] args) {

        int[] arr =  {1,2,3,4};
        System.out.println(packArray(arr));

    }

    private static  int packArray(int[] inputArray){
        List<Integer> integerList = new ArrayList<>();
        List<Integer> multiList = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            integerList.add(inputArray[i] + inputArray[i + 1]);
            i++;
        }
        for (int i = 0; i < integerList.size() - 1; i++) {
            multiList.add(integerList.get(i) + integerList.get(i+1));
            i++;
        }

        for (int i = 0; i < multiList.size(); i++) {
            sum += multiList.get(i);
        }
        return sum;
    }


}
