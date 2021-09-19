package New;

import java.util.Stack;

public class MagicCalculator {

    public static void main(String[] args) {

        //Input: s = "(1+(4+5+2)-3)+(6+8)"
        //System.out.println("The result: " + calculate("2+(4+5+2)-3)+(6+8)"));

        System.out.println(calculate("22+(1+(4+5+2)-3)+(6+8)"));

//        System.out.println(secondHighest(new int[]{2,3,5,2,4,5,6}));
//
//        generateFibonacci(10);
    }

    public static  int calculate (String s){
        int sum = 0, sign = 1;
        Stack<Integer> stack  = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                int num = 0;

                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    num = num * 10 + s.charAt(i) - '0';
                     i++;
                }

                sum += num * sign;

                i--; // I was increased at first to ensure even when the charAt(i) doesn't return a number
                // this actually broke the while loop. so we need to decrement i for that extra attempt that didn't return a number
            }

            if(s.charAt(i) == '+'){
                sign = 1;
            }
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            if (s.charAt(i) == '('){
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = 1;
            }
            if(s.charAt(i) == ')'){
                sum = stack.pop() * sum;  //The last sum * the last sign
                sum += stack.pop();
            }
        }
        return sum;
    }

    public static int secondHighest(int arr[]){
        int max = Integer.MIN_VALUE, premax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                premax = max;
                max = arr[i];
            }
            if( arr[i] < max && arr[i] > premax ){
                premax = arr[i];
            }
        }
        return premax;
    }

    public static void generateFibonacci(int count){
        int n1 = 0, n2 = 1, n3 = 0;

        if(count > 0){
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;

        System.out.println("" + n3);
        generateFibonacci(count -1);
        }


    }

}
