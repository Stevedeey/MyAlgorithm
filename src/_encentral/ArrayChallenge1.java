package _encentral;

import java.util.*;

public class ArrayChallenge1 {

    /*

Have the function ArrayChallenge(strArr) read the array of strings stored in strArr,
* which will contain 2 elements: the first element will be a sequence of characters, and the
*  second element will be a long string of comma-separated words, in alphabetical order, that
* represents a dictionary of some arbitrary length. For example:strArr can
* be: ["hellocat", "apple,bat,cat,goodbye,hello,yellow,why"].
*  Your goal is to determine if the first element in the input can be split
* into two words, where both words exist in the dictionary that is provided in the second input.
* In this example, the first element can be split into two words: hello and cat because both of those words are in the dictionary.
Your program should return the two words that exist in the dictionary separated by a comma. So for the example above, your program should return hello,cat.
*  There will only be one correct way to split the first element of characters into two words. If there is no way to split string into two words that exist in the
* dictionary, return the string not possible. The first element itself will never exist in the dictionary as a real word.
*
* ExamplesInput: new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}
Output:base,ball Input: new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"}
Output:abcg,efd


    *
    *Find the first repeating element in array of integers.
Input :
Input: array[] = {10, 7, 8, 1, 8, 7, 6}

1,7,7,8,8,10

Set<Integer> set = new HashSet<>();
for(int i)
Output: 7 [7 is the first element actually repeats]
    * */

//    public static void main(String[] args) {
////        countChars("abracadabra");
//      var res =  firstRepeating(new int[]{10, 7, 8, 1, 8, 7, 6});
//        System.out.println(res);
//
////        String[] arr = {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
////        var res = ArrayChallenge(arr);
////        System.out.println("Result: " + res);
//    }

    public static int firstRepeating(int[] arr) {
        var list = convertArrayToList(arr);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == list.get(i + 1)) {
                return list.get(i);
            }
        }
        return -1;
    }

    public static List<Integer> convertArrayToList(int array[]) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }

    private static void characterCounting(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                //tio ba wa nibe tele, wa jade, that returns number and increment it..
                int oldCount = map.get(str.charAt(i)) + 1;
                map.put(str.charAt(i), oldCount);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
//            if (entry.getValue() > 1) {
//                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
//            }
        }
    }

//    public static void main(String[] args) {
//        String str = "Exercise Book".replaceAll("\\s+","").toLowerCase();
//        System.out.println(str + "-> This is the new string");
//        characterCounting(str);
//    }

//    public static void countChars(String str) {
//
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            if (map.containsKey(str.charAt(i))) {
//                int oldCount = map.get(str.charAt(i)) + 1;
//                map.put(str.charAt(i), oldCount);
//            } else {
//                map.put(str.charAt(i), 1);
//            }
//        }
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
//            }
//        }
//    }


    public static int findFirstRepeating(int[] arr) {

        Set<Integer> set = new HashSet<>();
        int min = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                min = i;
            } else {
                set.add(arr[i]);
            }
        }
        return min != -1 ? arr[min] : min;

    }

    public static int ff(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return arr[i];
            } else set.add(arr[i]);
        }
        return -1;
    }

    public static String arrayChallenge(String[] strArr) {
        List<String> result = new ArrayList<>();
        String[] dictionary = strArr[1].split(",");
        for (String data : dictionary) {
            if (strArr[0].contains(data)) {
                for (String each : result) {
                    if ((data + each).equals(strArr[0])) {
                        return data + "," + each;
                    }

                    if ((each + data).equals(strArr[0])) {
                        return each + "," + data;
                    }
                }
                result.add(data);
            }
        }

        return "not possible";
    }

    //Input: s = "(1+(4+5+2)-3)+(6+8)"
    public static int calculator(String str) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int sign = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '0' && str.charAt(i) < '9') {
                int num = 0;
                while (i < str.length() && str.charAt(i) > '0' && str.charAt(i) < '0') {
                    num = num * 10 - '0';
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
                sum = stack.pop() * sum;
                sum += stack.pop();
            }
        }
        return sum;
    }

    private static Integer maxProfit(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j > i) {
                    if (arr[j] > arr[i]) {
                        list.add(arr[j] - arr[i]);
                    }
                }
            }

        }
        return list.size() > 1 ? Collections.max(list) : -1;
    }


    public static int find(int[] arr) {
        int min = -1;
        Set<Integer> set = new HashSet<>();

        for (int i = arr.length; i >= 0; i--) {
            if (set.contains(arr[i])) {
                min = i;
                return arr[i];
            } else
                set.add(arr[i]);
        }
        return -1;
    }

    public static String myArrayChallenge(String[] arr) {
//        String[] arr = new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};
        String[] dictionary = arr[1].split(",");
        List<String> newArray = new ArrayList<>();
        for (String each : dictionary) {
            if (arr[0].contains(each)) {
                for (String data : newArray) {
                    if ((each + data).equals(arr[0])) return each + "," + data;
                    if ((data + each).equals(arr[0])) return data + "," + each;

                }
                newArray.add(each);
            }
        }
        return "not possible";
    }
            //Joyo  //    // Find duplicate character in a string
//    public static void countChars(String str) {
//        Map<Character, Integer> map = new HashMap<>();
//        var charArray = str.toCharArray();
//        for (Character character : charArray) {
//            if (map.containsKey(character)) {
//                int count = map.get(character) + 1;
//                map.put(character, count);
//            } else {
//                map.put(character, 1);
//            }
//        }
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if(entry.getValue() > 1){
//                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
//            }
//        }
//
//    }


        }
