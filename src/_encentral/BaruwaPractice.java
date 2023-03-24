package _encentral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaruwaPractice {

    public static void main(String[] args) {
//        var list = Arrays.asList(1,2,3,4, 7, 78, 9, 66,64,6);
//        int [] arr = {1,2,3,4, 7, 78, 9, 566,64,6};
////        System.out.println(desMax(arr));
//        var ans = deakElement(list);
//        System.out.println("Answer: " + ans);
        System.out.println(factoriall(5));

    }
    public static int desMax(int[] arr){
        int dax = arr[0];
        int preDax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > dax){
                preDax = dax;
                dax = arr[i];
            }else if(arr[i] > preDax){
                preDax = arr[i];
            }
        }
        return preDax;
    }
    public static int deakElement(List<Integer> arr){
        int deakElement = 0;

        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > arr.get(i - 1) && arr.get(i) > arr.get(i + 1)){
                deakElement = arr.get(i);
            }
        }
        return  deakElement;
    }
    private static Integer peakElement(int[] arr){
        if(arr.length == 0 || arr == null) return null;

        int start = 0, n = arr.length, end = n - 1;
        while (start <= end){
            int mid = start + end / 2;
            if((arr[mid] > arr[mid - 1] || mid == 0) && (arr[mid] > arr[mid + 1] || mid == n -1)){
                return arr[mid];
            }else if(mid > 0 || arr[mid - 1] > arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
            return  null;
        }

        public static void fibbonnaci(int num){

        int n1 = 0, n2 = 1, n3 = 0;
        if (num > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" n3");
            fibbonnaci(num - 1);
        }
        }

        public static int factoriall(int num){
        if(num == 0){
            return 1;

        }else {
            return num  * factoriall(num - 1);
        }
    }

       public static int facto(int num){
           List<Integer> list = new ArrayList<>();
           if(num == 0){
               return 1;
           }else{
//               if(num >= list.size()){
//                   return list.get(num - 1);
//               }
               int ans = num * facto(num - 1);
               list.add(ans);
               System.out.println(ans);
               return ans;

           }

       }



}
