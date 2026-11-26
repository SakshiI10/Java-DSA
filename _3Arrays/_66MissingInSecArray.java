// Given two integer arrays a[] and b[], find the elements which are present in the first array a[], but not present in the second array b[].

// Return the elements in the same order in which they appear in a[].

// If there are more occurrences of an element in a[] than in b[], then extra occurrences of this element are NOT considered as missing in b[].

// Input: a[] = [1, 2, 3, 4, 5, 10], b[] = [2, 3, 1, 0, 5]
// Output: [4, 10]

import java.util.ArrayList;
import java.util.HashSet;

public class _73MissingInSecArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 10};
        int[] b = {2, 3, 1, 0, 5};
        System.out.println(findMissing(a, b));
    }

    public static ArrayList<Integer> findMissing(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : b) {
            set.add(x);
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int x : a) {
            if (!set.contains(x)) {
                res.add(x);
            }
        }
        return res;
    }
}