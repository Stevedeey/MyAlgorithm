package tosinRepo;

public class SumOfOdd {
    /*
    *       Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29

    *Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
    * */

        public static int rowSumOddNumbers(int n) {
            //TODO

            return (int)Math.pow(n, 3);

        }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(2));
    }
}



