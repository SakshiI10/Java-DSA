// Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.
// Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs.

// Input: arr = [-1, 0, 1, 2, -1, -4]
// Output: [[-1, 1]]

import java.util.ArrayList;
import java.util.Arrays;

public class _59PairsWith0Sum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        ArrayList<ArrayList<Integer>> result = getPairs(arr);
        System.out.println(result);
    }

    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);

                int a = arr[left];
                int b = arr[right];
                while (left < right && arr[left] == a) {
                    left++;
                }

                while (left < right && arr[right] == b) {
                    right--;
                }
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}