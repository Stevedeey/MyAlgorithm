package New;

import java.util.ArrayList;
import java.util.List;

public class ThreeDivSubSe {
    public static void main(String[] args) {
       System.out.println(threeDivSubsequences2("6666"));
        System.out.println(threeDivSubsequences2("200"));
        System.out.println(threeDivSubsequences2("10"));

        System.out.println(threeDivSubsequences("6666"));
        System.out.println(threeDivSubsequences("200"));
        System.out.println(threeDivSubsequences("10"));
    }




        public static int threeDivSubsequences(String number)
        {
            int count = 0;

            int rem[] = new int[3];

            rem[0] = 1;
            StringBuffer curr = new StringBuffer();


            for (int i = number.length() - 1; i >= 0; i--)
            {

                curr.insert(0, number.charAt(i));

                long num = Long.parseLong(curr.
                        toString());
                count += rem[(int)num % 3];

                rem[(int)num % 3]++;
            }

            return count;
        }





    static int threeDivSubsequences2(String str)
    {
        int count = 0;

        int len = str.length();

        for (int i = 0; i < len; i++)
        {
            int n = 0;

            for (int j = i; j < len; j++)
            {
                n = n * 10 + (str.charAt(j) - '0');

                if (n % 3 == 0)
                    count++;
            }
        }

        return count;
    }




    static  int histogramSquare( int[] histogram)
    {
        return 0;
    }
}
