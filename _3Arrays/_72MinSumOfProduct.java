// Given two arrays a[] and b[] of size n containing positive integers. Rearrange the elements of both arrays so that the value of: a[0] * b[0] + a[1] * b[1] + ... + a[n-1] * b[n-1] becomes minimum. Each element of a[] and b[] must be used exactly once.

// Input: a[] = [3, 1, 1], b[] = [6, 5, 4]
// Output: 23

import java.util.Arrays;

class _72MinSumOfProduct {
    public static void main(String[] args) {
        int[] a = { 3, 1, 1 };
        int[] b = { 6, 5, 4 };

        System.out.println(minProductSum(a, b));
    }

    public static int minProductSum(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int product = 0;

        for (int i = 0; i < a.length; i++) {
            product += a[i] * b[b.length - 1 - i];
        }

        return product;
    }

}