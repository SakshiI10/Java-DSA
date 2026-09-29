// Find largest element

import java.util.Arrays;

public class _12Largest {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 5, 3, 7, 5 };
        System.out.print(largest(arr));
    }

    static int largest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n - 1];
    }
}
