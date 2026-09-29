// You are given an array Arr of size N. Replace every element with the next greatest element (greatest element on its right side) in the array. Also, since there is no element next to the last element, replace it with -1.

// Input:
// N = 6
// Arr[] = {16, 17, 4, 3, 5, 2}
// Output: 17 5 5 5 2 -1

import java.util.ArrayList;

public class _14GreaterOnRightSide {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(nextGreatest(arr));
    }

    static ArrayList<Integer> nextGreatest(int arr[]) {
        int n = arr.length;
        int greatest = arr[n - 1];
        arr[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            int current = arr[i];
            arr[i] = greatest;
            if (current > greatest) {
                greatest = current;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }
        return result;
    }
}
