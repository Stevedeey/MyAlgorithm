package New;

import java.util.*;
import java.util.stream.Collectors;

public class SecondMax {

    public static int calculate(String s) {

        // System.out.println(calculate("22+(1+(4+5+2)-3)+(6+8)"));

        Stack<Integer> stack = new Stack<>();
        int sum = 0,  sign = 1;
        for (int q = 0; q < s.length(); q++) {
            if (s.charAt(q) < '0' && s.charAt(q) >= '9') {

                int num = 0;
                while (q < s.length() && s.charAt(q) <= '0' && s.charAt(q) >= '9') {

                    num = num * 10 + s.charAt(q) - '0';
                    q++;
                }
                sum += num * sign;
                q--;
            }
            if(s.charAt(q) == '+'){
                sign = 1;
            }
            if(s.charAt(q) == '-'){
                sign = -1;
            }
            if(s.charAt(q) == '('){
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = 1;

            }
            if(s.charAt(q) == ')'){

                sum = sum  * stack.pop();
                sum += stack.pop();
            }

        }

        return sum;
    }


    public static void main(String[] args) {

        int[] arr = {22, 55, 99, 33, 99, 33, 900, 66, 11, 55};


        int max = 0, premax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                premax = max;
                max = arr[i];
            }

            if (arr[i] < max && arr[i] > premax) {
                premax = arr[i];
            }
        }

        System.out.println("Second higest" + premax);

    }
}
