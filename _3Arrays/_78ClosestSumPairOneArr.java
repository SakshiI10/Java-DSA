// Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a ≤ b whose sum is closest to target.

// Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

// Input: arr[] = [10, 30, 20, 5], target = 25
// Output: [5, 20]

import java.util.ArrayList;
import java.util.Arrays;

public class _78ClosestSumPairOneArr {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 20, 5 };
        int target = 25;
        System.out.println(sumClosest(arr, target));
    }

    public static ArrayList<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        if (n < 2) {
            return res;
        }

        int i = 0;
        int j = n - 1;

        int minDiff = Integer.MAX_VALUE;
        int maxPairDiff = 0;

        while (i < j) {
            int sum = arr[i] + arr[j];
            int diff = Math.abs(sum - target);
            int pairDiff = arr[j] - arr[i];

            if (diff < minDiff || (diff == minDiff && pairDiff > maxPairDiff)) {
                minDiff = diff;
                maxPairDiff = pairDiff;

                res.clear();
                res.add(arr[i]);
                res.add(arr[j]);
            }
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}