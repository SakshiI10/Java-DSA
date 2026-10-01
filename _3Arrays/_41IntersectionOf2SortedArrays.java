// Given two sorted arrays arr1[] and arr2[]. Your task is to return the intersection of both arrays.
// Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not count duplicate elements.

// Input: arr1[] = [1, 2, 3, 4], arr2[] = [2, 4, 6, 7, 8]
// Output: [2, 4]

import java.util.ArrayList;
public class _41IntersectionOf2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 4 };
        int[] arr2 = { 2, 2, 4, 6, 7, 8 };
        System.out.print(intersection(arr1, arr2));
    }

    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                arr.add(arr1[i]);
                int value = arr1[i];
                while (i < arr1.length && arr1[i] == value) {
                    i++;
                }
                while (j < arr2.length && arr2[j] == value) {
                    j++;
                }
            }
        }
        return arr;
    }
}
