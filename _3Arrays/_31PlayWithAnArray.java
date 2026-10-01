// Given an unsorted array arr, rearrange the array elements such that the number at the odd index is greater than the number at the previous even index.

// Input: arr[] = [5, 4, 3, 2, 1]
// Output: true

import java.util.Arrays;
public class _31PlayWithAnArray {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 6 };
        System.out.println(formatArray(arr));
    }

    public static boolean formatArray(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        // Array
        int[] temp = new int[n];
        int left = 0;
        int right = (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                temp[i] = arr[left];
                left++;
            } else {
                temp[i] = arr[right];
                right++;
            }
        }
        // Check condition
        for (int i = 0; i < n-1; i += 2) {
            if (temp[i] >= temp[i + 1]) {
                return false;
            }
        }
        return true;
    }
}