package New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.IntStream.of;

public class Leaderboard {
    public static List<Integer> climbingLeaderboard(int[] scores,int[] alice) {

        //Ranki:  100 90 90 80 75 60

        //player score: 50 65 77 90 102

        int[] array = of(scores).distinct().toArray();
        int i = array.length-1;
        for(int score: alice) {
            while(i>=0) {
                if(score>=array[i]) i--;
                else {System.out.println(i+2); break;}
            }
            if(i<0) System.out.println(1);
        }

    return null;
    }

    public static void main(String[] args) {

        int[] scores = {4,6,7,5,5,5};


    }
}
