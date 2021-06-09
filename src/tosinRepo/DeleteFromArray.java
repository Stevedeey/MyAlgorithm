package tosinRepo;

import java.util.Scanner;

public class DeleteFromArray {
    public static int[] deleteFrom(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The current Array state..");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " \n");
        }
        System.out.println("Specify the number to remove ");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];

                }
                break;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("The state now");
        int[] arr = deleteFrom(new int[]{5, 6, 9, 7, 4});
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


//                Scanner in = new Scanner(System.in);
//                int[] numArray = {6, 8, 10, 34, 12, 2};
//
//                System.out.print("Enter Element to be deleted: ");
//                int element = in.nextInt();
//
//                for(int i = 0; i < numArray.length; i++){
//                    if(numArray[i] == element){
//                        // shift elements to the left
//                        for(int j = i; j < numArray.length - 2; j++){
//                            numArray[j] = numArray[j+1];
//                        }
//                        break;
//                    }
//                }
//        for (int i = 0; i < numArray.length; i++) {
//            System.out.println(numArray[i]);
//        }

    }
}
