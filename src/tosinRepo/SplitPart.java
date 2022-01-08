package tosinRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitPart {
//    public static List<Integer> splitInteger( Integer num, Integer parts ) {
//        Integer[] arr = new Integer[parts];
//
//        if(num % parts == 0){
//            int divisible = num / parts;
//            for(int i = 0; i < parts; i++){
//                arr[i] = divisible;
//            }
//        }else{
//            int newN = num % parts;
//
//            for(int i = 0; i < parts - newN; i++){
//                arr[i] = num / parts;
//            }
//
//            for(int j = parts - newN; j < parts; j++){
//                arr[j] = (num/parts)+1;
//            }
//        }
//
//        return Arrays.asList(arr);
//    }
//    public static List<Integer> splitInteger(Integer num, Integer parts) {
//        List<Integer> list = new ArrayList<>(parts);
//        if (num % parts==0){
//            for (int i = 0; i <parts; i++) {
//                list.add(num / parts);
//            }
//        }else if (num % parts!=0){
//            list.add(num / parts+1);
//            for (int i = 0; i <=parts-2 ; i++) {
//                list.add(num / parts);
//            }
//        }
//        for (int i = 1; i <list.size() ; i++) {
//            if (list.get(i)%2!=0){
//                Integer int1 = list.get(i - 1);
//                Integer int2 = list.get(i);
//                list.set(i-1, int1+1);
//                list.set(i, int2-1);
//            }
//        }
//        return  list;
//    }

    public static List<Integer> splitInteger(Integer num, Integer parts) {
        List<Integer> split = new ArrayList<>();

        for (int i = parts; i >= 1; i--) {
            int x = num / i; //3
            split.add(x);
            int result = num - x; //11-3 =8
            num = result;
        }
        return split;
    }

    public static void main(String[] args) {
        System.out.println(splitInteger(11, 3));
    }
}
