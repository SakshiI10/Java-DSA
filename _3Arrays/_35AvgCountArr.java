//HashMap
// Given an array arr[] and an integer x. You have to calculate the average for each element arr[i] and x and find out whether that number exists in the array. Do it for all the elements of the array and store the count result in another array for each index how many occurrences of average are present in the array.

// Input : arr[] = [2, 4, 8, 6, 2] and x = 2
// Output : [2, 0, 0, 1, 2]

import java.util.Arrays;
import java.util.HashMap;
public class _35AvgCountArr {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 6, 2};
        int x=2;
        System.out.print(Arrays.toString(countArray(arr, x)));
    }
    public static int[] countArray(int[] arr, int x) {
        int n = arr.length;
        // Array
        int[] result = new int[n];
        // HashMap
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Integer count = freq.get(arr[i]);
            if (count == null) {
                freq.put(arr[i], 1);
            } else {
                freq.put(arr[i], count + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            int avg = (arr[i] + x) / 2;
            Integer count = freq.get(avg);
            if (count == null) {
                result[i] = 0;
            } else {
                result[i] = count;
            }
        }
        return result;
    }
}
