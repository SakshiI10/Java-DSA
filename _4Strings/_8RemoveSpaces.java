// Given a string, remove spaces from it. 

// Input:
// S = "geeks  for geeks"
// Output: geeksforgeeks
// Explanation: All the spaces have been removed.

public class _8RemoveSpaces {
    public static void main(String[] args) {
        String s = "geeks  for geeks";
        System.out.println(modify(s));
    }

    public static String modify(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {

                res = res + ch;
            }
        }
        return res;
    }
}
