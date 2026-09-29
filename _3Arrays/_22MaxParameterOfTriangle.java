// Given an Array of non-negative integers. Find out the maximum perimeter of the triangle from the array.

// Input : arr[] = {6, 1, 6, 5, 8, 4}
// Output : 20

import java.util.Arrays;

public class _22MaxParameterOfTriangle {
    public static void main(String[] args){
        int[] arr = {6, 1, 6, 5, 8, 4};
        System.out.println(maxParameter(arr));
    }

    static int maxParameter(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;

        for (int i = n - 1; i >= 2; i--) {
            if (arr[i - 1] + arr[i - 2] > arr[i]) {
                return arr[i] + arr[i - 1] + arr[i - 2];
            }
        }
        return -1;
    }
}