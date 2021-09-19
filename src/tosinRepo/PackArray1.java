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

    interface Dog {
        void saySomething(String some);
    }


    public static void main(String[] args) {

        Dog dog = new Dog() {

            @Override
            public void saySomething(String some) {
            System.out.println( "I have nothing to say: " + some);
            }
        };

        dog.saySomething("Dare");

//        int [] arr = new int[2];
//        try {
//            System.out.println("fourth Index: "+ arr[3]);
//        }catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println("Exception Caught!! ");
//        }
//        catch (Exception exception){
//            System.out.println("Caught Exception ");
//        }finally {
//            arr[0] = 6;
//            System.out.println("Accessing First Index "+ arr[0]);
//        }

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
