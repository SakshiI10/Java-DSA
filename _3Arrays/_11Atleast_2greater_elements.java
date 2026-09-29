// Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.

// Input : 
// a[] = {2, 8, 7, 1, 5}
// Output : 1 2 5

import java.util.Arrays;

public class _11Atleast_2greater_elements {
    public static void main(String[] args) {
        int arr[] = { 2, 8, 7, 1, 5 };
        findElements(arr);
    }

    static void findElements(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
