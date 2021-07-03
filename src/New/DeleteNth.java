package New;

import javax.lang.model.type.MirroredTypeException;
import java.util.*;
import java.util.stream.Collectors;

public class DeleteNth {
    public static void main(String[] args) {

//        EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
//        EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
//        System.out.println(deleteNth(new int[] {4,7,15,13,12,7,11,2,1,17,3,11,8,1,9,12,2,12}, 9 ));
      //  System.out.println(deleteNthi(new int[] {50,8,30,45,34,48,6,37,10,11,11,22,49,24,17,45,49,5,18,19,21,40,23,8,2,46,37,21,33,24,29,44,49,19,0,0,2,14,15,47,6,34,21,24,10,18,3,0,15,13,37}, 2 ));

    }
//10,56,64



    static int[] deleteNthj(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> stats = new HashMap<>();
        return  Arrays.stream(elements)
                .filter(e -> stats.merge(e, 1, Integer::sum) <= maxOccurrences).toArray();
    }

    public static int[] deleteNthi(int[] elements, int maxOcurrences) {
        if (elements == null || elements.length == 0) return new int[0];

        Map<Integer, Integer> numberCount = new HashMap<>();
        List<Integer> filteredList = new ArrayList<>();

        for (Integer aNumber : elements) {
            if (numberCount.containsKey(aNumber)) {
                numberCount.put(aNumber, numberCount.get(aNumber)+1);
            } else {
                numberCount.put(aNumber, 1);
            }

            if (numberCount.get(aNumber) <= maxOcurrences) {
                filteredList.add(aNumber);
            }
        }

        return filteredList.stream().mapToInt(i -> i).toArray();
       // return filteredList.stream().mapToInt(Integer::valueOf).toArray();
    }


        public static int[] deleteNth(int[] elements, int maxOccurrences) {
            List<Integer> newList = new ArrayList<>();
            Map<Integer,Integer> map1 = new LinkedHashMap<>();
            Map<Integer,Integer> counterMap = new LinkedHashMap<>();
            Set<Integer> newSet = new LinkedHashSet<>();

            for(int i =0; i < elements.length;i++){
                map1.put(elements[i],0);
                newSet.add(elements[i]);
                counterMap.put(elements[i],1);
            }
            System.out.println(map1);
            List<Integer> finalList = new ArrayList<>(newSet);
            for(int i =0; i<elements.length; i++){
                if(map1.containsKey(elements[i]) && map1.get(elements[i]) < maxOccurrences){
                    map1.put(elements[i],map1.get(elements[i])+1);
                }
            }

            for(int j =0; j< elements.length;j++){
                if(map1.containsKey(elements[j]) && counterMap.get(elements[j]) <= map1.get(elements[j])){
                    newList.add(elements[j]);

                    counterMap.put(elements[j],counterMap.get(elements[j])+1 );
                }
            }

            int[] finalArray = new int[newList.size()];
            for(int i =0; i<finalArray.length; i++){
                finalArray[i] = newList.get(i);
            }
            return finalArray;

        }


}
