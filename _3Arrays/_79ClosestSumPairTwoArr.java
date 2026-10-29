// Given two sorted arrays arr1[] and arr2[] of size n and m and a number x, find the pair whose sum is closest to x and the pair has an element from each array. In the case of multiple closest pairs return any one of them.

// Note : In the driver code, the absolute difference between the sum of the closest pair and x is printed.

// Input : arr1[] = [1, 4, 5, 7], arr2[] = [10, 20, 30, 40], x = 32
// Output : [1, 30]

import java.util.ArrayList;

public class _79ClosestSumPairTwoArr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 5, 7 };
        int[] arr2 = { 10, 20, 30, 40 };
        int x = 32;
        System.out.println(findClosestPair(arr1, arr2, x));
    }

    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
		int i = 0;
		int j = arr2.length - 1;
		
		int minDiff = Integer.MAX_VALUE;
		int a = 0, b = 0;
		
		while (i<arr1.length && j >= 0) {
			int sum = arr1[i]+arr2[j];
			int diff = Math.abs(sum - x);
			
			if (diff<minDiff) {
				minDiff = diff;
				a = arr1[i];
				b = arr2[j];
			} else if (sum == x) {
				break;
			} else if (sum<x) {
				i++;
			} else {
				j--;
			}
		}
		
		ArrayList<Integer> res = new ArrayList<>();
		res.add(a);
		res.add(b);
		return res;
	}
}
