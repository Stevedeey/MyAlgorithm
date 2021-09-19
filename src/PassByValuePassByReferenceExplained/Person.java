package PassByValuePassByReferenceExplained;

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

       int [] arr = {123, 456};
        System.out.println("Before the method call:::::The first element of the array is "+ arr[0]);
        changeListItem(arr);
        System.out.println("Before the method call:::::The first element of the array is "+ arr[0]);

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



    }
}

