package _encentral;

import java.util.*;

public class EncentralAlgorithm {

    static class Node{
        private String data;
        private Node next;

        public String getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(String data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }

        public static void main(String[] args) {
            Node node = new Node("Olaleye", null);
            Node node2 = new Node("Oluwatosin", node);
            System.out.println(node2.getNext().getData());
            System.out.println(node2.getData());
        }

    }



    // 1.
    public static String strChallenge(String[] strArr, String str) {
        String[] dictionary = str.split(",");
        List<String> wordList = new ArrayList<>();
        for (String word : dictionary) {
            if (strArr[0].indexOf(word) != -1) {
                for (String eachWord : wordList) {

                    if ((word + eachWord).equals(strArr[0])) {
                        return word + "," + eachWord;
                    }
                    if ((eachWord + word).equals(strArr[0])) {
                        return eachWord + "," + word;
                    }
                }
            }
            wordList.add(word);
        }
        return "not possible";
    }
    
    public static int highest(int num){
        String strNum = String.valueOf(num);
        int index = 0; int highest = 0;
        for (int i = 0; i < strNum.length(); i++) {
            if(i < strNum.length() - 1){
                int value = Integer.parseInt(strNum.charAt(i) +"" + strNum.charAt(i + 1));
                if(value >= highest){
                    index = i;
                    highest = value;
                }
            }
        }
        return Integer.parseInt(strNum.charAt(index) + "" + strNum.charAt(index+1));
    }
    public static Integer arrayChallenge(int []arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j > i){
                    if(arr[j] > arr[i]){
                        list.add(arr[j] - arr[i]);
                    }
                }
            }
        }
        return list.size() > 1 ? Collections.max(list) : -1;
    }

    public static  String distinct (String str){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < set.size(); i++) {
            set.add(str.charAt(i));
        }
        return (set.size() > 10) ? "true" : "false";
    }

    public static String SearchingChallenge(String str) {
        String[] eachString = str.split(" ");
        Map<Integer,Integer> res = new HashMap<>();
        for(int i = 0; i < eachString.length; i++){
            Map<String, Integer> map = new HashMap<>();
            for(int j = 0; j < eachString[i].length(); j++){
                if(map.containsKey(eachString[i].charAt(j)+"")){
                    Integer count = map.get(eachString[i].charAt(j)+"");
                    map.put(eachString[i].charAt(j)+"", count+1);
                }else{
                    map.put(eachString[i].charAt(j)+"", 1);
                }
            }
            int result = 1;
            for (Integer a: map.values()) {
                if(a > 1) result = a;
            }
            if(result != 1){
                res.put(i, result);
            }
        }
        int longestKey = 0;
        int value = 0;
        for(Map.Entry<Integer, Integer> a: res.entrySet()){
            if(a.getValue() > value){
                value = a.getValue();
                longestKey = a.getKey();
            }
        }
        if(res.size() == 0) return "-1";
        return eachString[longestKey];
    }

   static class li{
        final static int Max = m1();
       public static int m1()
       {
           System.out.println(Max+ "zero");
           return 1500;

       }
   }

    public static void main(String[] args) {
      String str = "the timidity of the omnipotent";
        var so = SearchingChallenge(str);
        System.out.println(so);
    }
}
