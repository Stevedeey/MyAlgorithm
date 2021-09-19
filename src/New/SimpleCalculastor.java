package New;

import java.util.*;

public class SimpleCalculastor {
    public static void main(String[] args) {
        //Input: s = "1 + 1"
        //Input: s = " 2-1 + 2 "
        //Input: s = "(1+(4+5+2)-3)+(6+8)"
   // System.out.println(calculate("1 + 1"));
     //   System.out.println(  calculate(" 2-1 + 2 "));
     // System.out.println(calculate("222+(4+5+2)-3)+(6+8)"));
        //System.out.println(calculate("2+(1+(4+5+2)-3)+(6+8)"));
//        int ch = '8' ;
//        System.out.println(ch -'0');
        System.out.println(Distinct("eeeemmmmmmmmm1000"));

        System.out.println(largestNumber(363223311));


    }

    public static boolean Distinct(String s) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i)+"");
        }
       return set.size()>=10 ? true : false;


    }

    public static int largestNumber(int num) {

        String newString = String.valueOf(num);
        List<Integer> newInt = new ArrayList<>();
        for(int i=0; i< newString.length()-1; i++){
            var t = newInt.add(Integer.valueOf(newString.charAt(i)+""+newString.charAt(i+1)));
        }
        Collections.sort(newInt);
        return newInt.get(newInt.size()-1);
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

//    public static int calculate(String s) {
//        int sum = 0;
//        int sign = 1;
//
//        Stack<Integer> st = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            if (Character.isDigit(ch)) {
//
//                int val = 0;
//                while (i < s.length() && Character.isDigit(s.charAt(i))) {
//                    val = val * 10  + (s.charAt(i) -'0');
//                    i++;
//                }
//                i--;
//                val = val * sign;
//                sign = 1;
//                sum += val;
//            } else if (ch == '(') {
//                st.push(sum);
//                st.push(sign);
//                sum = 0;
//                sign = +1;
//            } else if (ch == ')') {
//                sum *= st.pop();
//                sum += st.pop();
//            } else if (ch == '-') {
//                sign *= -1;
//            }
//        }
//
//        return sum;
//    }
}
