package New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OutlinerOddEven {
    static int find(int[] integers) {
//        int[] array = Arrays.stream(integers).filter(index->index%2==0).toArray();
//        return array.length==1 ? array[0]: Arrays.stream(integers).filter(i->i%2!=0).findAny().getAsInt();
        //[2,4,0,4,11,2602,36] 11/
        int data = 0;
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < integers.length; i++) {
            if (integers[i]%2==0)
                evenList.add(integers[i]);
            else oddList.add(integers[i]);
        }
        if(evenList.size() == 1 && oddList.size() > 1)
            data = evenList.get(0);
        else data = oddList.get(0);

        return data;

    }

    public static void main(String[] args) {
        int [] ar =  {160,3,1719,19,13,-21};
        System.out.println(find(ar));
    }
}
