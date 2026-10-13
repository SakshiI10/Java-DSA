// You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

// Input: arr[] = [1, 2, 3, 5]
// Output: 4

import java.util.Arrays;

public class _57MissingInArr {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNum(arr));
    }

    static int missingNum(int arr[]) {
        Arrays.sort(arr);
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return n + 1;
    }
}
