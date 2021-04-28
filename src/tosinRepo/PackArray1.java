package tosinRepo;

import java.util.ArrayList;
import java.util.List;

public class PackArray1 {
    public static Integer packArray( List<Integer> arr ) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Integer result = 0;
        for(int i = 0; i < arr.size() - 1; i++){
            list1.add(arr.get(i) + arr.get(i+1));
            i = i + 1;
        }
        for(int i = 0; i < list1.size() - 1; i++){
            list2.add(list1.get(i) * list1.get(i+1));
            i = i + 1;
        }
        for(int i = 0; i < list2.size(); i++){
            result += list2.get(i);
        }
        return result;

    }

    public static void main(String[] args) {

    }
}
