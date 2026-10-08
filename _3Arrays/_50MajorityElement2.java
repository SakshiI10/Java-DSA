// Given an array arr[] consisting of n integers, find all the array elements which occurs more than floor(n/3) times. Return the resulting array in strictly increasing order. If no such elements exist, return an empty array.

// Input: arr[] = [2, 2, 3, 1, 3, 2, 1, 1]
// Output: [1, 2]

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class _50MajorityElement2 {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 1, 3, 2, 1, 1 };
        System.out.println(findMajority(arr));
    }

    public static ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int num : map.keySet()) {
            if (map.get(num) > n / 3) {
                result.add(num);
            }
        }
        Collections.sort(result);
        return result;
    }
}
