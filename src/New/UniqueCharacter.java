package New;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {
    public static void main(String[] args) {
     String str = "abcdef";
        System.out.println(unique2(str));

    }
    public static boolean unique2(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) return false;
        }
        return true;
    }


    public static boolean unique(String str){
        int count = 1; boolean flag;
        Map<Character,Integer> map = new HashMap<>();
        for (Character ch: str.toCharArray()) {

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
                 count ++;
            }
            else map.put(ch, 1);
        }

       for( Map.Entry<Character ,Integer> entry : map.entrySet())
       {
           System.out.println("Key= "+ entry.getKey() + " Value "+ entry
           .getValue());
       }
//
//        for (Integer in: map.values()) {
//            if(in > 1) return false;
//        }
        if(count > 1) return false;
        return true;
    }


}
