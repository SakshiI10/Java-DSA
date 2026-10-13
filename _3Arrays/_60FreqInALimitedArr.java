// Given an array arr[] containing positive integers. The elements in the array arr[] range from  1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your have to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).

// Input: arr[] = [2, 3, 2, 3, 5]
// Output: [0, 2, 2, 0, 1]

import java.util.ArrayList;

public class _60FreqInALimitedArr {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        ArrayList<Integer> result = frequencyCount(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            int index = arr[i] - 1;
            freq[index] = freq[index] + 1;
        }
        for (int i = 0; i < n; i++) {
            res.add(freq[i]);
        }
        return res;
    }
}