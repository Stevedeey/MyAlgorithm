package New;

import java.util.*;

public class SimpleCalculastor {
    public static void main(String[] args) {

//        int n1 = 0, n2 = 1, n3 = 0;
//
//
//        System.out.println(n1 + "" + n2);
//        fibonacci(5);


        String  s = "(1+(4+5+2)-3)+(6+8)";

        System.out.println(calculate(s));

//         System.out.println(calculate("222+(4+5+2)-3)+(6+8)"));
        System.out.println(calculate("2+(1+(4+5+2)-3)+(6+8)"));





    }


    public static void fibonacci(int num){

        int n1 = 0, n2 = 1, n3 = 0;
        if(num > 0){
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;

            System.out.println(" "+n3);
            fibonacci(num - 1);
        }
    }





    public static int largestNumber(int num) {

        String newString = String.valueOf(num);
        List<Integer> newInt = new ArrayList<>();
        for(int i = 0; i< newString.length()-1; i++){
            var t = newInt.add(Integer.valueOf(newString.charAt(i)+""+newString.charAt(i+1)));
        }
        Collections.sort(newInt);
        return newInt.get(newInt.size()-1);
    }

    public static boolean dist(String arr){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < arr.length(); i++) {
            set.add(arr.charAt(i));
        }
        return  set.size() >= 10 ? true : false;
    }



    public static int calculate(String s){
        //Input: s = "(1+(4+5+2)-3)+(6+8)"
        int sign = 1;
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            //Note that input can be
            // 1 .number
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){ //checking if the current position is a number
                int num = 0;
                //to cater for multiple digits keep looping as long as the encountered character is still a number
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9')
                {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;

                }
                sum += num   * sign;

                i--;
            }
            // 2. +
            if(s.charAt(i) == '+'){
                sign = 1;
            }
            // 3. -
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            // 4. (
            if(s.charAt(i) == '('){
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = 1;
            }
            // 5. )
            if(s.charAt(i) == ')'){
                sum = stack.pop() * sum; //sign
                sum += stack.pop();
            }
        }

        return sum;
    }

    public static boolean Distinct2(String str){
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i)+"");
        }
        return set.size()>10 ? true : false;
    }


}
