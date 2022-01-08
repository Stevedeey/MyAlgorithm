package New;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void count(String str){
        var charArray = str.toCharArray();
        Map map = new HashMap();
        int starter = 1;
        for (Character character:charArray) {
            if(map.containsKey(character)){
              int oldCount = (int)map.get(character);
              map.put(character,oldCount+1);
            }
            else {
                map.put(character,starter);
            }

        }
        map.remove(' ');
        System.out.println(map);
    }

    public static void main(String[] args) {

        count("I am a boy");

    }
}
