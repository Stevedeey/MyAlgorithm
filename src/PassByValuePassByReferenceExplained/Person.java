package PassByValuePassByReferenceExplained;

import java.util.Arrays;

public  class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void changeDetails(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
      return  this.name + " " + this
        .age;
    }

    public static void changeListItem(int arr[] ){
        System.out.println("The first element of the array is "+ arr[0]);
        arr[0] = 100;
        System.out.println("The first element of the array is "+ arr[0]);
    }

    public static void main(String[] args) {

//       int [] arr = {123, 456};
//        System.out.println("Before the method call:::::The first element of the array is "+ arr[0]);
//        changeListItem(arr);
//        System.out.println("Before the method call:::::The first element of the array is "+ arr[0]);

//        Person person1 = new Person("Adewale", 30);
//
//        Person person2;
//
//        person2 = person1;
//
//        person2.changeDetails("Mary", 23);
//
//        System.out.println("Person1::::::: "+ person1);
//        System.out.println("Person2::::::: "+ person2);
        int [] arr = {9,7,8, 0};

//        bubble(arr);
        swap2(arr);
        System.out.println(Arrays.toString(arr));



    }

    private static void bubble(int arr[]){
        //int[] n = {9,7,8};

        boolean isSorted;
        for (int i = 0; i < arr.length; i++) {

            isSorted = true;
            for (int j = 1; j < arr.length -  i; j++) {
                if (arr[j] < arr[j - 1]){

                   swap(arr, j, j -1);
                    isSorted = false;

                }
            }
            if(isSorted) return;
        }

    }

    private static void swap (int arr[], int index1, int index2){
        int temp  = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    private static void swap2(int[] arr){

        for (int i = 1; i < arr.length; i++) {

            if(arr[i] < arr[i-1]){
                int temp = arr[i - 1];
                arr[i- 1] = arr[i];
                arr[i] = temp;

            }
        }


    }
}

