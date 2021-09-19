package New;

import java.util.Scanner;

public class Loops2 {

    static int change(int a){
        int data = a + 2;
        return  data;
    }


   static class Some
    {
        int data;

        public Some(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {

        int temp = 3;
        int method = change(temp);
        System.out.println("The answer "+ method);
        System.out.println("The temp::::: "+ temp);
        System.out.println();
    }
}
