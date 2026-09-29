// Given an array arr, rotate the array by one position in clock-wise direction.
// Input: arr = [1, 2, 3, 4, 5]
// Output: [5, 1, 2, 3, 4]

public class _26Rotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotate(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] arr) {
        int n = arr.length;
        int k = 1 % n;
        for (int j = 0; j < k; j++) {
            int last = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
    }
}