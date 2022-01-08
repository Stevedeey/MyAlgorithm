package _encentral;

public class __amain {
    public static void main(String[] args) {
        Memoization memoization = new Memoization();
        System.out.println("Factorial of 3: ");
        System.out.println("************");
        System.out.println("Calculate for 3: "+memoization.calculate(4));
        System.out.println("Size "+ memoization.getList().size());
        System.out.println("Printing the list :"+ memoization.getList());

        System.out.println(">>>>>>>>>>>>>>>>>>*<<<<<<<<<<<<<<<<<<<");
        System.out.println("Factorial of 7: ");
        System.out.println("************");
        System.out.println("Result: "+memoization.calculate(7));
        System.out.println("Size "+ memoization.getList().size());
        System.out.println("Printing the list :"+ memoization.getList());
    }
}

