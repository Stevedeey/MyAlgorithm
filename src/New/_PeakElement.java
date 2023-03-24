package New;

import selfpractice.Array;

import java.util.Arrays;
import java.util.Locale;

public class _PeakElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 4, 3, 6, 49, 5, 3};
        var g = peakElement(arr);
        System.out.println(">>>>" + g);

        Locale locale = Locale.ENGLISH;
        String defaultCountry = locale.getDisplayName();
        String targetCountry = locale.getDisplayName(locale);
        System.out.println(defaultCountry);
        System.out.println(targetCountry);


    }

    private static int peakE(int[] arr, int len) {  //return index of the peak
        if(len == 1) return 0;

        if (arr[0] > arr[1]) return 0;

        if (arr[len- 1] > arr[len - 2]) return len - 1;

        for (int i = 1; i < arr.length - 2; i++) {
            if (arr[i] > arr[i - 1] && arr[i + 1] < arr[i]) return i;
        }

        return 0;
    }

    private static Integer peakElement(int[] arr) {

        if (arr.length == 0 || arr == null) {
            return null;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + end / 2;
            if (mid == 0 || arr[mid] >= arr[mid - 1] && mid == arr.length - 1 || arr[mid] >= arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return null;
    }
}
