// Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.

// Input: S = "geeksforgeeks"
// Output: g

import java.util.HashSet;

public class _23RepeatedChar {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(firstRepChar(s));
    }

    static String firstRepChar(String s) {
        HashSet<Character> set=new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(set.contains(ch)){
                // Because method's return type is String, but ch is a char.
                return String.valueOf(ch);
            }
            set.add(ch);
        }
        return "-1";
    }
}
