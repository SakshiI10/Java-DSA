// Given an integer target and an array arr[]. Find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.

// Note:  Pairs should have elements of distinct indexes. 

// Input: arr[] = [-1, 1, 5, 5, 7], target = 6
// Output: 3

import java.util.HashMap;

public class _70CountSumPairsInSorted {
    public static void main(String[] args) {
        int[] arr = { -1, 1, 5, 5, 7 };
        int target = 6;
        System.out.println(countPairs(arr, target));
    }

    static int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                count = count + map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
