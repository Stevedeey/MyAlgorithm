package New;

public class _PeakElement {
    public static void main(String[] args) {
        int [] arr = {5,5,3,66,4,3,6,4,5,3};
        var g = peakElement(arr);
        System.out.println(">>>>"+g);


    }

    private static Integer peakElement(int[] arr){

        if(arr.length==0 || arr == null){
            return null;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + end / 2;
            if(mid==0 || arr[mid] >= arr[mid - 1] && mid==arr.length-1 || arr[mid] >= arr[mid+1]){
                return arr[mid];
            }
            else if (arr[mid] < arr[mid-1]){
                end = arr[mid -1];
            }
            else start = arr[mid + 1];
        }
        return null;
    }
}
