package tosinRepo;

public class MyGenerics<T> {
    T obj, obj2;

    void add(T obj, T obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    T get() {
        return obj;
    }

    public static <E> void printArray(E[] elements) // can print values of different type
    {
        for (E element : elements) {
            System.out.println(element);
        }
    }

    public static boolean repeatedChar(String jav) {
        boolean flag = false;
        for (int i = 0; i < jav.length(); i++) {
            String each = String.valueOf(jav.charAt(i)).toLowerCase();
            if ((jav.indexOf(each) == jav.lastIndexOf(each))) {
                flag = true;

            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        //what ever type specified is what it stores with


        // list.add(4);
        System.out.println(repeatedChar("mamamam"));
        System.out.println(repeatedChar("string"));


//        String [] strArray = {"Ade "," yemi"};
//       int[] intArray = {3,4,5,6};

        //  printArray(strArray);


        //System.out.println(list.get());


    }


}
