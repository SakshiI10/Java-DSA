// Given an array arr[], determine whether it represents the level-order traversal of a valid max heap. Return true if it does; otherwise, return false.

// Input: arr[] = [90, 15, 10, 7, 12, 2]
// Output: true

public class _74ArrIsMaxHeap {
    public static void main(String[] args) {
        int[] arr = { 90, 15, 10, 7, 12, 2 };
        System.out.println(isMaxHeap(arr));
    }

    public static boolean isMaxHeap(int[] arr) {
        int n = arr.length;

        for (int i = 0; i <= (n - 2) / 2; i++) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n && arr[i] < arr[left]) {
                return false;
            }

            if (right < n && arr[i] < arr[right]) {
                return false;
            }
        }

        return true;
    }
}