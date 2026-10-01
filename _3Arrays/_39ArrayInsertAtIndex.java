// You are given an array arr(0-based index) and two positive integer index and val. You need to insert an val at given index.

// Examples:

// Input: arr[] = [1, 2, 3, 4, 5], index = 5, val = 90
// Output: 1 2 3 4 5 90

import java.util.ArrayList;
import java.util.Arrays;

public class _39ArrayInsertAtIndex {
    public static void main(String[] arg) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int index = 2;
        int val = 90;
        insertAtIndex(arr, index, val);
        System.out.print(arr);
    }

    public static void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        arr.add(index, val);
    }
}
