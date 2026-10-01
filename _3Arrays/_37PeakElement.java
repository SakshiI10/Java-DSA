// Given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist). If there are multiple peak elements, return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".

// Examples:
// Input: arr = [1, 2, 4, 5, 7, 8, 3]
// Output: true

public class _37PeakElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 3, 1, 3 };
        System.out.print(peakElement(arr));
    }

    public static int peakElement(int[] arr) {
        int n = arr.length;
        // Only one element
        if (n == 1) {
            return 0;
        }
        // Two elements
        if (arr[0] > arr[1]) {
            return 0;
        }
        // Middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        // Last element
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }
        return -1;
    }
}