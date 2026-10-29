// Given an array arr[], the task is to find the maximum distance between two occurrences of an element. If no element has two occurrences, then return 0.

// Input: arr[] = [1, 1, 2, 2, 2, 1]
// Output: 5

import java.util.HashMap;

public class _82MaxDistBetweenSame {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2 };
        System.out.println(maxDistance(arr));
    }

    public static int maxDistance(int[] arr) {
        int n=arr.length;
        int diff=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                diff = Math.max(diff, i - map.get(arr[i]));
            } else {
                map.put(arr[i], i);
            }
        }

        return diff;
    }
}
