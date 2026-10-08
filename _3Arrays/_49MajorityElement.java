// Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.
// Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

// Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
// Output: 1

import java.util.HashMap;

public class _49MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 1, 3, 5, 1 };
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            // map.containsKey(num): This checks whether the number already exists as a key in the map.
            // map.put(num, value): adds a key-value pair to the map, or updates the value if the key already exists.
            // get(): retrieves the value associated with a key.
            // map.keySet(): Give all the keys that are currently stored in the HashMap.
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            if (map.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }
}
