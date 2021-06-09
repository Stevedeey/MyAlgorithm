package selfpractice;

public class MissingNumber2 {
    public static void findingMissingNumber2(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            int difference = arr[j] - arr[i];
            if (difference != 1) {
                int missinNumber = arr[i] + 1;
                for (int k = difference; k > 1; k--) {
                    System.out.printf("The missing number is: %d %n: ", missinNumber);
                    missinNumber++;

                }
            }
        }
    }

    public static void main(String[] args) {
        findingMissingNumber2(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 50});
    }
}
