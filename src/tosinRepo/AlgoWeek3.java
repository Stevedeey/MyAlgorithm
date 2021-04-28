package tosinRepo;

import java.util.*;

public class AlgoWeek3 {
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

    public static int findL(List<String> ls) {
        int longestWorld = 0;
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).length() > longestWorld) {
                longestWorld = ls.get(i).length();
            }

        }
        return longestWorld;
    }

    public static  void highestString()
    {

        List<String> listCities = Arrays.asList("London", "Paris", "New York",
                "Washington", "Tokyo", "Rio De Janero", "Bangalore");

        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        String max = Collections.max(listCities, comparator);

        System.out.println("Most-letter city name: " + max);
    }

    public static void main(String[] args) {
//       highestString();
        System.out.println(packArray(List.of(1,3,45,6,6)));


    }

}
