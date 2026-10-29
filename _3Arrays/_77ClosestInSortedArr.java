// Given a sorted array arr[] of positive integers. The task is to find the closest value in the array to the given number k. The array may contain duplicate values.

// Note: If the difference with k is the same for two values in the array return the greater value.

// Input:  arr[] = [1, 3, 6, 7], k = 4
// Output: 3

public class _77ClosestInSortedArr {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 7 };
        int k=4;
        System.out.println(findClosest(arr, k));
    }

    public static int findClosest(int[] arr, int k) {
        int n=arr.length;
        int minDiff = Integer.MAX_VALUE;
        int closest = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - k);

            if (diff < minDiff || (diff == minDiff && arr[i] > closest)) {
                minDiff = diff;
                closest = arr[i];
            }
        }

        return closest;
    }
}
