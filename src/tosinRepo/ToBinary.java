package tosinRepo;

import java.util.Arrays;
import java.util.List;

public class ToBinary {

/*
Task
You are given an array of up to four non-negative integers, each less than 256.

Your task is to pack these integers into one number M so that the first element of the array occupies the first (or least significant) 8 bits of M; the second element occupies next 8 bits, and so on.

Return the obtained integer M as unsigned integer.

Note
As indicated the first 8 bits are the least significant bits of M, meaning the right-most bits of the integer.
For further clarification see the following example.

Specification
Challenge.arrayPacking(array)
Parameters
array: List<Integer> - up to four unsigned integers

Return Value
Integer - an unsigned integer

Constraints
array.length == 3

0 ≤ array[i] < 256

Example
For [24, 85, 0] the output should be 21784

[24,       85,       0       ] - The initial array
[00011000, 01010101, 00000000] - Translate each number to Binary
   000000000101010100011000    - Compact to a single number
            21784              - Translate to Decimal
 */

        /*
        assertEquals((Integer)21784, Challenge.arrayPacking(Arrays.asList(24,85,0)));
            assertEquals((Integer)2567447, Challenge.arrayPacking(Arrays.asList(23,45,39)));
            assertEquals((Integer)3618615, Challenge.arrayPacking(Arrays.asList(55,55,55)));
            assertEquals((Integer)65793, Challenge.arrayPacking(Arrays.asList(1,1,1)));
            assertEquals((Integer)1, Challenge.arrayPacking(Arrays.asList(1,0,0)));
            assertEquals((Integer)256, Challenge.arrayPacking(Arrays.asList(0,1,0)));

         */
        public static void main(String[] args) {
            System.out.println(arrayPacking(Arrays.asList(24,85,0)));
            System.out.println(arrayPacking(Arrays.asList(23,45,39)));
            System.out.println(arrayPacking(Arrays.asList(55,55,55)));
            System.out.println(arrayPacking(Arrays.asList(1,1,1)));
            System.out.println(arrayPacking(Arrays.asList(1,0,0)));
            System.out.println(arrayPacking(Arrays.asList(0,1,0)));
        }
        public static Integer arrayPacking( List<Integer> integers ) {
            String fullBinaryString = "";

            //loop through array from right-most element
            for (int i = integers.size() - 1; i >= 0; i--){
                String binaryString = Integer.toBinaryString(integers.get(i)); //convert to binary string
                String binaryStringWithLeadingZeros =  String.format("%8s", binaryString).replaceAll(" ", "0"); //format string to adding leading zeros to fit "8-bits"
                fullBinaryString += binaryStringWithLeadingZeros;
            }

            //parse the string back to integer format, specifying that you're parsing from binary/base 2
            return Integer.parseInt(fullBinaryString, 2);
        }


}
