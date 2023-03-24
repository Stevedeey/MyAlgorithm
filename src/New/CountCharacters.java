package New;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharacters {

//    * ExamplesInput: new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}
//    Output:base,ball Input: new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"}
//    Output:abcg,efd

    public static  String ArrayChallenge(String[] strArr){
        var dictionary = strArr[1].split(",");
        List<String> result = new ArrayList<>();
        for (String each : dictionary) {
            if(strArr[0].contains(each)){
                for (String word : result) {
                    if((each + word).equals(strArr[1])){
                        return each + "," + word;
                    }
                    if((word + each).equals(strArr[0])){
                        return word + "," + each;
                    }
                }
                result.add(each);
            }
        }
        return "not possible";
    }

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
