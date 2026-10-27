// Given a string, say S, print it in reverse manner eliminating the repeated characters and spaces.

// Input: S = "GEEKS FOR GEEKS"
// Output: "SKEGROF"

import java.util.HashSet;

public class _19StrReversal {
    public static void main(String[] args) {
        String s = "GEEKS FOR GEEKS";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        String res = "";
        HashSet<Character> set = new HashSet<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ' && !set.contains(ch)) {
                res = res + ch;
                set.add(ch);
            }
        }
        return res;
    }
}
