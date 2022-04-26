package tosinRepo;

public class Factorial {
    public static int FirstFactorial(int num) {
        // code goes here

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int FirstFactorial2(int num) {
        // code goes here
        if (num <= 1) return 1;
        else {
            int temp = num - 1;
            int factorial = num * FirstFactorial2(temp);
            return factorial;
        }
    }

    public static void main(String[] args) {

        System.out.println(FirstFactorial2(4)

        );
    }
}
