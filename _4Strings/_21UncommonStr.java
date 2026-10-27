// Given two strings A and B consisting of lowercase english characters. Find the characters that are not common in the two strings. 

// A = geeksforgeeks
// B = geeksquiz
// Output: fioqruz

import java.util.Arrays;
import java.util.HashSet;

public class _21UncommonStr {
    public static void main(String[] args) {
        String A = "geeksforgeeks";
        String B = "geeksquiz";
        System.out.println(uncommonChars(A, B));
    }

    public static String uncommonChars(String A, String B) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (int i = 0; i < A.length(); i++) {
            set1.add(A.charAt(i));
        }
        for (int i = 0; i < B.length(); i++) {
            set2.add(B.charAt(i));
        }

        String res = "";

        for (char ch : set1) {
            if (!set2.contains(ch)) {
                res = res + ch;
            }
        }
        for (char ch : set2) {
            if (!set1.contains(ch)) {
                res = res + ch;
            }
        }
        char[] arr=res.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}