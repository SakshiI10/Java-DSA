// Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].
// Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
// Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].

// Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
// Output: 6, 8

import java.util.Arrays;

public class _56FloorAndCeilInUnsorted {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 8, 9, 6, 5, 5, 6 };
        int x = 7;

        int[] result = getFloorAndCeil(x, arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getFloorAndCeil(int x, int[] arr) {
        int n = arr.length;
        int floor = 0;
        int floorMax = -1;
        int ceil = 0;
        int ceilMax = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                floor = arr[i];
                floorMax = Math.max(floor, floorMax);
            }

            if (arr[i] >= x) {
                ceil = arr[i];
                ceilMax = Math.min(ceil, ceilMax);
            }
        }

        if (ceilMax == Integer.MAX_VALUE) {
            ceilMax = -1;
        }

        return new int[] { floorMax, ceilMax };
    }
}