// Given an array A of size N. The contents of A are copied into another array B and numbers are shuffled. Also, one element is removed from B. The task is to find the missing element.

// Input : 
// A[] = {4, 8, 1, 3, 7}
// B[] = {7, 4, 3, 1}
// Output : 8

import java.util.Arrays;

public class _16MissingInAnotherShuffledArray {
    public static void main(String[] args){
        int arr1[]= {4, 8, 1, 3, 7};
        int arr2[]={7, 4, 3, 1};
        System.out.println(findMissing(arr1, arr2));
    }
    public static int findMissing(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr2.length;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return arr1[i];
            }
        }
        return arr1[arr1.length - 1];
    }
}
