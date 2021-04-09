package tosinRepo;

import java.util.Arrays;

public class FindingTwoSum
{
    public static int[] twoSum(int[] arr, int target )
    {
        int[] indexes = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int check = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(i !=j)
                {
                    if(check+arr[j]==target)
                    {
                        indexes[0] = i;
                        indexes[1] = j;
                    }
                }
            }

        }
        Arrays.sort(indexes);
        return indexes;
    }

    public static void main(String[] args) {

       int arr[] =twoSum(new int[]{2,7,11,15},9);
        for (int i:arr
             ) {
            System.out.println(i);

        }
    }
}
