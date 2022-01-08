package _encentral;

import java.util.ArrayList;
import java.util.List;

public class Complaints<T> {

    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static <E> void printArray(E[] elements){
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

       Character[] characters = {'(','e','r',')'};
       Integer[] integers = {1,2,3,4};

        printArray(characters);
        printArray(integers);


    }
}
