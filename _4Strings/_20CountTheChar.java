// Given a string S. Count the characters that have N chber of occurrences. If a character appears consecutively it is counted as 1 occurrence.

// Input: S = "abc", N = 1
// Output: 3

import java.util.HashMap;

public class _20CountTheChar {
    public static void main(String[] args) {
        String s = "abc";
        int N = 1;
        System.out.println(countCharacters(s, N));
    }

    public static int countCharacters(String s, int N) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int count = 0;

        for (char ch : map.keySet()) {
            if (map.get(ch) == N) {
                count++;
            }
        }

        return count;
    }
}
