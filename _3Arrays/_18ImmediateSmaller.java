// Given an integer array arr of size n. For each element in the array, check whether the right adjacent element (on the next immediate position) of the array is smaller. If next element is smaller, update the current index to that element. If not, then  -1.

// Input:
// n = 5, arr[] = {4, 2, 1, 5, 3}
// Output: 2 1 -1 3 -1

public class _18ImmediateSmaller {
    public static void main(String[] args)   {
        int arr[]={4, 2, 1, 5, 3};
        immediateSmaller(arr);
    }
    static void immediateSmaller(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }
        arr[n - 1] = -1;
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
