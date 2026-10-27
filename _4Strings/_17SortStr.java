// Given a string consisting of lowercase letters, arrange all its letters in ascending order. 

// Input:
// S = "edcab"
// Output: "abcde

import java.util.Arrays;

public class _17SortStr {
    public static void main(String[] args) {
        String s = "edcab";
        System.out.println(sortString(s));
    }

    public static String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
