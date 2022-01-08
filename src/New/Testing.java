package New;

import javax.swing.tree.TreeNode;
import java.util.*;

public class Testing {

    public static void main(String[] args) {
      //  System.out.println(some(new int[] {50,8,30,45,34,48,6,37,10,11,11,22,49,24,17,45,49,5,18,19,21,40,23,8,2,46,37,21,33,24,29,44,49,19,0,0,2,14,15,47,6,34,21,24,10,18,3,0,15,13,37}, 2 ));
        String str = String.valueOf(some(new int[] {50,8,30,45,34,48,6,37,10,11,11,22,49,24,17,45,49,5,18,19,21,40,23,8,2,46,37,21,33,24,29,44,49,19,0,0,2,14,15,47,6,34,21,24,10,18,3,0,15,13,37}, 2 ));
        System.out.println(str);


    }
    public static int[] some (int[] done, int max){
        Map<Integer, Integer> map =new HashMap<>();
        List<Integer> list = new ArrayList<>();


        for (int each : done) {
            if(map.containsKey(each)){
                map.put(each, map.get(each));
            }
            else {
                map.put(each , 1);
            }
            if(map.get(each) <= max){
                list.add(each);
            }

        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static  boolean isBo(int valueTocheck, int prevoiusvAL, int currentVlue){
//        prevoiusvAL = 0; currentVlue =1;
//        valueTocheck = currentVlue + prevoiusvAL;
        return  false;

    }
}
