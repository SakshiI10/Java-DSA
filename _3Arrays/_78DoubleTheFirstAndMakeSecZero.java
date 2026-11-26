// Given an array arr[] of size n, modify it such that if two adjacent elements are equal and non-zero, double the first element and replace the second element with 0. After processing the entire array, move all 0s to the end while maintaining the relative order of the non-zero elements. Return the modified array.

// Input: arr[] = [2, 2, 0, 4, 0, 8] 
// Output: [4, 4, 8, 0, 0, 0] 

import java.util.ArrayList;

public class _85DoubleTheFirstAndMakeSecZero {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 0, 4, 0, 8 };
        System.out.println(modifyArray(arr));
    }

    public static ArrayList<Integer> modifyArray(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                res.add(arr[i]);
            }
        }

        while (res.size() < n) {
            res.add(0);
        }

        return res;
    }
}
