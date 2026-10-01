// Given two unsorted arrays a[] and b[] each consisting of distinct elements , the task is to return the of elements in the union of the two arrays in sorted order.

// Input: a[] = [89, 24, 75, 11, 23], b[] = [89, 2, 4]
// Output: [2, 4, 11, 23,  24, 75, 89]

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _40UnionOf2Sorted {
    public static void main(String[] arg) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 6, 7 };
        System.out.print(findUnion(a, b));
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            set.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }
}
