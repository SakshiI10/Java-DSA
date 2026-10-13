// Given an array arr[], find the first repeating element position. The element should occur more than once and the position (from left) of its first occurrence should be the smallest.
// Note: The position you return should be according to 1-based indexing. 

// Input: arr[] = [1, 5, 3, 4, 3, 5, 6]
// Output: 2

import java.util.HashMap;

public class _61FirstRepeated {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr));
    }

    public static int firstRepeated(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > 1) {
                return i + 1;
            }
        }
        return -1;
    }
}
