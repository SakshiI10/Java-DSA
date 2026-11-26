// Given an array of integers, return all the elements such that both the positive and negative values of a number exist in the array. The order of elements in the output should be based on the order of first appearance of any element in a pair in input. For example, in a pair (x, y) if any of x or y appear first in the input array, then the whole pair will appear first.

// Note : If no such pair exists, simply return an empty array, also multiple pairs of the same number could exist and you need to put each of them in the array. 

// Input: arr[] = [1, -3, 2, 3, 6, -1, -3, 3]
// Output: [1, -1, -3, 3, 3, -3]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _80PairsWthPosNegValues {
    public static void main(String[] args) {
        int[] arr = { 1, -3, 2, 3, 6, -1, -3, 3 };
        System.out.println(posNegPair(arr));
    }

    public static List<Integer> posNegPair(int[] arr) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            // getOrDefault(key, defaultValue) returns the value associated with the key if it exists; otherwise, it returns the default value.
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (num != 0 && freq.getOrDefault(num, 0) > 0 && freq.getOrDefault(-num, 0) > 0){
                res.add(num);
                res.add(-num);

                freq.put(num, freq.get(num) - 1);
                freq.put(-num, freq.get(-num) - 1);
            }
        }
        return res;
    }
}
