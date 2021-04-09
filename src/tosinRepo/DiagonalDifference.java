package tosinRepo;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        for(int i = 0; i < arr.size(); i++){
            int j1;
            j1 = i;
            int j2 = arr.size()-1-i;

            firstDiagonal += arr.get(i).get(j1);
            secondDiagonal += arr.get(i).get(j2);
        }
        return Math.abs(firstDiagonal - secondDiagonal);
    }
}
