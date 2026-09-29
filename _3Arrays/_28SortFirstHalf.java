// Given an array arr of n integers, sort the first half of the array in ascending order and second half in descending order.

// Input:
// n = 4
// arr[] = {10, 20, 30, 40}
// Output: 10 20 40 30

import java.util.ArrayList;
import java.util.Arrays;

public class _28SortFirstHalf {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 2, 3, 8, 9, 7 };
        System.out.println(customSort(arr));
    }

    public static ArrayList<Integer> customSort(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);

        ArrayList<Integer> result = new ArrayList<>();

        // First half
        for (int i = 0; i < mid; i++) {
            result.add(arr[i]);
        }

        // Second half in reverse order
        for (int i = n - 1; i >= mid; i--) {
            result.add(arr[i]);
        }

        return result;
    }
}
