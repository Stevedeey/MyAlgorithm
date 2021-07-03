package selfpractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);

        System.out.println("d" + numbers.indexOf(20));

        numbers.print();


    }
}
