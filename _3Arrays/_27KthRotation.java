// Given an increasing sorted rotated array arr[] of distinct integers. The array is right-rotated k times. Find the value of k.
// Let's suppose we have an array arr[] = [2, 4, 6, 9], if we rotate it by 2 times it will look like this:
// After 1st Rotation : [9, 2, 4, 6]
// After 2nd Rotation : [6, 9, 2, 4]

// Input: arr[] = [5, 1, 2, 3, 4]
// Output: 1

public class _27KthRotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(findKRotation(arr));
    }

    public static int findKRotation(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }
}
