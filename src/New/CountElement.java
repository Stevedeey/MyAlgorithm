package New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountElement {


    public static  int[] rotate(int[] arr, int k){
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length-k; i < arr.length; i++) {

            list.add(arr[i]);
        }
        for (int i = 0; i < arr.length-k; i++) {
            list.add(arr[i]);
        }
        return list.stream().mapToInt(i->i).toArray();
    }

    public static  int countElement(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if((arr[i] + 1) == arr[j])
                {
                    result++;
                    break;
                }
            }
        }
        return  result;
    }


    public static  int twoSumLessThanK(int[] A, int K) {

        Arrays.sort(A);

        int temp1 = 0, temp2 = A.length - 1;
        int answer = -1;
        while(temp1 < temp2) {
            if(A[temp1] + A[temp2] < K) {
                answer = Math.max(answer, A[temp1] + A[temp2]);
                temp1++;
            } else {
                temp2--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
       //int count =  twoSumLessThanK(new int[]{34,23,1,24,75,33,54,8}, 60);

     System.out.println("Rotate: "+ Arrays.toString(rotate(new int[]{34,23,1,24,75,33,54,8}, 6)));
    }
}
