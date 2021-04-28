package tosinRepo;

import java.util.List;

public class ParkArray2 {
    /*
 MONDAY
 Task
Given an array of 2k integers (for some integer k, which will be betwen 0 and 5 inclusive), perform the following operations until the array contains only one element:

On the 1st, 3rd, 5th, etc. iterations (1-based) replace each pair of consecutive elements with their sum;
On the 2nd, 4th, 6th, etc. iterations replace each pair of consecutive elements with their product.
After the algorithm has finished, there will be a single element left in the array. Return that element.

Specification
Challenge.packArray(arr)
Parameters
arr: Integer[] - An array of integers to be packed

Return Value
Integer - The final product

Constraints
arr.length == 2k

0 ≤ k ≤ 5

-9 ≤ arr[i] ≤ 99

Example
For arr = [1, 2, 3, 4, 5, 6, 7, 8], the output should be 186.

We have [1, 2, 3, 4, 5, 6, 7, 8] -> [3, 7, 11, 15] -> [21, 165] -> [186], so the answer is 186.
  */
    public static Integer packArray( List<Integer> arr ) {
        int length = arr.size();

        //as long as length is greater than one then we move to the next iteration.
        for (int iteration = 1; length > 1; iteration++){
            for (int j = 0, k = 0; j < length; j+= 2, k++) {
                int replacement;
                if ((iteration%2) != 0) //if iteration is odd then addition
                    replacement = arr.get(j) + arr.get(j + 1);
                else //if iteration is even then multiplication
                    replacement = arr.get(j) * arr.get(j + 1);

                arr.set(k, replacement);
            }
            length /= 2;
        }
        return arr.get(0);
    }

}

