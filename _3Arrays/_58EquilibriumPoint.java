// Given an array of integers arr[], the task is to find the first equilibrium point in the array.
// The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists. 

// Input: arr[] = [1, 2, 0, 3]
// Output: 2

public class _58EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3};
        System.out.println(findEquilibrium(arr));
    }

    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int totalSum = 0;
        int leftSum = 0;
        
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }
}
