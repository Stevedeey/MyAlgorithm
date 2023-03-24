package _encentral;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

class SchedulingChallenge {
    public static void main(String[] args) {

//        ArrayList<Integer> aList = new ArrayList<>(List.of(3, 10, 10, 1, 2));
//
//        System.out.println(sjf(aList, 2));

        String s = "((199+(4+5+2)-3)+(6+8)";
        System.out.println(calculator(s));
    }

    public static int sjf(ArrayList<Integer> jobs, int index) {
        int res = 0;
        for (int i = 0; i < jobs.size(); i++) {
            if (jobs.get(i) < jobs.get(index) || (jobs.get(i) == jobs.get(index) && i <= index)) {
                res += jobs.get(i);
            }
        }
//        var result = jobs.stream().filter(i -> i < jobs.get(index) || (i == jobs.get(index) && jobs.indexOf(i) <= index)).collect(Collectors.toList());
//        for (int i = 0; i < result.size(); i++) {
//            res += result.get(i);
//        }
        return res;
    }

    public static int calculator(String str) {
        //Input: s = "(199+(4+5+2)-3)+(6+8)"
        int sum = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int num = 0;
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    num = num * 10 + str.charAt(i) - '0';
                    i++;
                }
                sum += num * sign;
                i--;
            }
            if (str.charAt(i) == '+') {
                sign = 1;
            }
            if (str.charAt(i) == '-') {
                sign = -1;
            }
            if (str.charAt(i) == '(') {
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = 1;

            }
            if (str.charAt(i) == ')') {
                sum = sum * stack.pop();
                sum += stack.pop();

            }

        }

        return sum;
    }
}
