// Given a sorted array A of size N. Find number of elements which are less than or equal to given element X.

// Input:
// N = 6
// A[] = {1, 2, 4, 5, 8, 10}
// X = 9
// Output: 5

public class _5Counter {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 8, 10 };
        int n = 6;
        int x = 9;
        System.out.print(counter(arr, n, x));
    }

    static int counter(int[] arr, int n, int x) {
        if (arr == null || n <= 0)
            return 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
