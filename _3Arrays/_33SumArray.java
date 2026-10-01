// Given an array arr[] of integers, change the given array such that at any index i it contains the sum of all elements except itself. 
// Simple way arr[i] should be arr[0] + arr[1] ... arr[i-1] + arr[i+1] ... arr[n-1].

// Input: [3, 6, 4, 8, 9]
// Output: [27, 24, 26, 22, 21]

import java.util.Arrays;

public class _33SumArray {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 4, 8, 9 };
        sumArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sumArray(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = sum - arr[i];
        }
    }
}
