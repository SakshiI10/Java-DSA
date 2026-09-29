// Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

// Input:
// N = 5
// Arr[] = {15, 2, 45, 12, 7}
// Output: 2

public class _7Array_equal2_index {
    public static void main(String[] args) {
        int arr[] = { 15, 2, 45, 12, 7 };
        int n = 5;
        System.out.println(valueEqualToIndex(arr, n));
    }

    static int valueEqualToIndex(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) {
                return arr[i];
            }
        }
        return 0;
    }
}