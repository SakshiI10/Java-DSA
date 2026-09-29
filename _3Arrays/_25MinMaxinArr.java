// Given an array arr. Your task is to find the minimum and maximum elements in the array.

// Input: arr = [3, 2, 1, 56, 10000, 167]
// Output: 1 10000

// Input: arr = [56789]
// Output: 56789 56789

import java.util.ArrayList;
import java.util.Arrays;

public class _25MinMaxinArr {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 5, 8, 6 };
        System.out.print(getMinMax(arr));
    }

    public static ArrayList<Integer> getMinMax(int[] arr) {
       Arrays.sort(arr);
       ArrayList<Integer> result = new ArrayList<>();
       int n=arr.length;
       result.add(arr[0]);
       result.add(arr[n-1]);
       return result; 
    }
}
