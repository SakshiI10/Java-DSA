// Given a string str containing only lower case alphabets, the task is to sort it in lexicographically-descending order.

// Input: str = "geeks"
// Output: "skgee"

import java.util.Arrays;

public class _18SortDesc {
    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(ReverseSort(s));
    }

    public static String ReverseSort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
 
            left++;
            right--;
        }

        return new String(arr);
    }
}