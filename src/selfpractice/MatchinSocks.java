package selfpractice;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MatchinSocks {
    public static int sockMerchant(int n, List<Integer> ar) {
       int pair = 0;
       Set<Integer> myColorSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(!myColorSet.contains(ar.get(i))){
                myColorSet.add(ar.get(i));
            }
            else {
                pair++;
                myColorSet.remove(ar.get(i));
            }
        }return pair;
  }

    public static void main(String[] args) {
        List<Integer> list =List.of(2,3,4,3,2,4,5,6,7,8,8);
        System.out.println(sockMerchant(11,list));
    }
}
