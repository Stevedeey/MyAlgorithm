package tosinRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

    @FunctionalInterface
    interface SaySomethingAnonymously {
        void saySomething(String some);

    }

    @FunctionalInterface
    interface SaySomethingWithLambda{
        void saySomething(String name, int age);
    }

    @FunctionalInterface
    interface Addition{
        int add(int a, int b);
    }

    public static void main(String[] args) {

        //:: MESSING WITH 2D ARRAY

        int [] [] twoD = { {1,2,3},
                           {4,5,6},
                           {7,8,9}
        };
        int [][] twoDD = new int[3][3];

        Scanner scanner =  new Scanner(System.in);

        for (int i = 0; i < twoDD.length; i++) {
            for (int j = 0; j < twoDD[i].length; j++) {
                System.out.println("Enter a number >> "+ twoD[i][j]);
               twoDD[i][j] =  scanner.nextInt();
            }
        }

        for (int i = 0; i < twoDD.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < twoDD[i].length; j++) {
                System.out.print(" "+ twoDD[i][j]);
            }
        }




//        SaySomethingAnonymously anonymously = new SaySomethingAnonymously() {
//
//            @Override
//            public void saySomething(String some) {
//            System.out.println( "I have nothing to say: " + some);
//            }
//        };
//
//        anonymously.saySomething("Dare");
//
//
//        // With Lambda
//
//        SaySomethingWithLambda lambda = (String name, int age) -> {
//            System.out.println("The name of this fellow is "+ name + "and he's aged "+ age);
//        };
//
//        lambda.saySomething("Damola", 24);
//
//
//        // With Lambda and with return keyword
//
//        Addition addition = (a, b) -> {
//            return (a + b);
//        };
//
//        //OR
//        // With Lambda and without return keyword
//
//       // Addition addition = (a, b) -> (a+b);
//
//        int answer = addition.add(100,100);
//
//        System.out.printf("The result of addition is: %s", answer);

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
