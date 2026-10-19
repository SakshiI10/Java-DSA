// Given a non-negative integer(without leading zeroes) represented as an array arr. Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.

// Input: arr[] = [5, 6, 7, 8]
// Output: [5, 6, 7, 9]

import java.util.ArrayList;

public class _71AddingOneToArr {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8 };
        System.out.println(addOne(arr));
        int[] arr2 = { 9, 9, 9 };
        System.out.println(addOne(arr2));
    }

    public static ArrayList<Integer> addOne(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] = arr[i] + 1;

                for (int d : arr)
                    list.add(d);
                return list;
            }
            arr[i] = 0;
        }

        list.add(1);
        for (int i = 0; i < arr.length; i++)
            list.add(0);

        return list;
    }
}
