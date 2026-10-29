// Given an integer array arr[] and an integer k, perform exactly k operations on the array. In one operation, you can select any element and change its sign: Replace arr[i] with -arr[i].

// The same element can be selected multiple times. Return the maximum possible sum of the array after exactly k operations.

// Input: arr[] = [1, 2, -3, 4, 5], k = 1
// Output: 15

import java.util.Arrays;

public class _81MaxSumAfterKNegations{
    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, 4, 5 };
        int k=1;
        System.out.println(maximizeSum(arr, k));
    }

    public static int maximizeSum(int[] arr, int k) {
        Arrays.sort(arr);
        int sum = 0;

        for (int i = 0; i < arr.length && k > 0; i++) {
            if (arr[i] < 0) {
                arr[i] = -arr[i];
                k--;
            }
        }

        int minValue = Math.abs(arr[0]);

        for (int value : arr) {
            sum += value;
            minValue = Math.min(minValue, Math.abs(value));
        }

        if (k % 2 == 1) {
            sum -= 2 * minValue;
        }

        return sum;
    }
}