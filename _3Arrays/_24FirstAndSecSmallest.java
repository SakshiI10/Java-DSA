// Given an array, arr of integers, your task is to return the smallest and second smallest element in the array. If the smallest and second smallest do not exist, return -1.

// Input: arr[] = [2, 4, 3, 5, 6]
// Output: 2 3

import java.util.Arrays;
import java.util.ArrayList;

public class _24FirstAndSecSmallest {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 5, 6 };
        System.out.print(minAnd2ndMin(arr));
    }

    public static ArrayList<Integer> minAnd2ndMin(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        if (n < 2) {
            result.add(-1);
            return result;
        }

        result.add(arr[0]);

        for(int i=1; i<n; i++){
            if(arr[i] != arr[0]){
                result.add(arr[i]);
                return result;
            }
        }
        result.clear();
        result.add(-1);
        
        return result;

    }
}
