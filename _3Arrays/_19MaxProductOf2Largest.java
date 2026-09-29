// Given an array Arr of size N with all elements greater than or equal to zero. Return the maximum product of two numbers possible.
 
// Input: 
// N = 6
// Arr[] = {1, 4, 3, 6, 7, 0}  
// Output: 42

import java.util.Arrays;

public class _19MaxProductOf2Largest {
    public static void main(String[] args){
        int[] arr={1,4,3,6,7,0};
        System.out.println(maxProduct(arr));
    }

    static int maxProduct(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int product=arr[n-2]*arr[n-1];
        return product;
    }
}
