// Given an array arr of size n, swap the kth element from the beginning with kth element from the end.

// Input:
// n = 8
// k = 3
// arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
// Output: {1, 2, 6, 4, 5, 3, 7, 8}

public class _6Swap {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = 8;
        int k = 3;
        swap(arr, n, k);
    }

    static void swap(int[] arr, int n, int k){
        int start=k-1;
        int end=n-k;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
