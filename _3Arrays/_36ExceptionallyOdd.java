// Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.

// Input: N = 7
// Arr[] = {1, 2, 3, 2, 3, 1, 3}
// Output: 3

import java.util.HashMap;
public class _36ExceptionallyOdd{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        System.out.print(getOddOccurrence(arr));
    }

    static int getOddOccurrence(int[] arr) {
        int n=arr.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int i=0; i<n; i++){
            Integer count=freq.get(arr[i]);
            if(count==null){
                freq.put(arr[i], 1);
            } else {
                freq.put(arr[i], count+1);
            }
        }
        
        for (Integer num : freq.keySet()) {
            Integer count = freq.get(num);
            if (count % 2 != 0) {
                return num;
            }
        }
        return -1;
    }
}