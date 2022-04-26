package _encentral;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSwap2 {

    public static int minimumSwaps(ArrayList<Integer> ratings) {
    //converting the arraylist to an array

     var arr1 =   ratings.stream().mapToInt(i->i).toArray();

    //  specifying length of the array
    int n = arr1.length;

    //  creating an array of the Pair class with a length of the size of the list
    Pair[]arr = new Pair[n];

//  iterating through the created array and assigning the values and indices
    for (int i = 0; i < n; i++) {
        arr[i] = new Pair(arr1[i], i);
    }

//  Sorting the array
    Arrays.sort(arr);

    //   final answer
    int ans = 0;

    //  an array of visited indices
    boolean[]vis = new boolean[n];

    for (int i = 0; i < n; i++) {
        if (vis[i] == true || arr[i].idx == i) {
            continue;
        }

        int clen = 0;
        int j = i;
        while (vis[j] == false) {
            vis[j] = true;
            clen++;
            j = arr[j].idx;
        }
        ans += (clen - 1);
    }
    return ans;
}




    //Creating a static pair class to take care of sorting
    private static class Pair implements Comparable< Pair> {

        //     value and index of value
        int val;
        int idx;

        //     constructor
        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        //     since we are sorting in descending order, we have o.val - this.val;,
//     if it is ascending, then we should have this.val - o.val;
        @Override
        public int compareTo(Pair o) {
            return o.val - this.val;
        }
    }


}
