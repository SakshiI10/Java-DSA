// Given a array of length N, at each step it is reduced by 1 element. In the first step the maximum element would be removed, while in the second step minimum element of the remaining array would be removed, in the third step again the maximum and so on. Continue this till the array contains only 1 element. And find the final element remaining in the array.

// Input:
// N = 7
// A[] = {7, 8, 3, 4, 2, 9, 5}
// Ouput: 5

import java.util.Arrays;

public class _10LeftEle {
    public static void main(String[] args){
        int arr[] = {7, 8, 3, 4, 2, 5, 9};
        int n=7;
        leftElement(arr, n);
    }

    static void leftElement(int[] arr, int n) {
        Arrays.sort(arr);
        // 2 3 4 5 7 8 9
        System.out.print(arr[(n - 1) / 2]);
    }
}
