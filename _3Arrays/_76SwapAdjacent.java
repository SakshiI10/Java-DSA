// Given an array arr[] of positive integers, swap the ith element with the (i + 2)th element for every valid i, starting from i = 0 and moving from left to right. Return the resulting array. A swap is possible only when the (i + 2)th element exists.

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: [3, 4, 5, 2, 1]

import java.util.Arrays;

public class _76SwapAdjacent {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        swapElements(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swapElements(int[] arr) {
        int n = arr.length;

        for (int i = 0; i + 2 < n; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        }
    }
}