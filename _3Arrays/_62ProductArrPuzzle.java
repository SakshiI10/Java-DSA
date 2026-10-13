// Given an array, arr[], construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].
// Note: Each element is res[] lies inside the 32-bit integer range.

// Input: arr[] = [10, 3, 5, 6, 2]
// Output: [180, 600, 360, 300, 900]

import java.util.Arrays;

public class _62ProductArrPuzzle {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];
        temp[0] = 1;

        for (int i = 1; i < n; i++) {
            temp[i] = temp[i - 1] * arr[i - 1];
        }

        int product = 1;
        for (int i = n - 1; i >= 0; i--) {
            temp[i] *= product;
            product *= arr[i];
        }
        return temp;
    }
}
