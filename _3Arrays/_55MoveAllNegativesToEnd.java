// Given an unsorted array arr[ ] having both negative and positive integers. Place all negative elements at the end of the array without changing the order of positive elements and negative elements.
// Note: Don't return any array, just in-place on the array.

// Examples:
// Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
// Output : [1, 3, 2, 11, 6, -1, -7, -5]

import java.util.Arrays;

public class _55MoveAllNegativesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void segregateElements(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}