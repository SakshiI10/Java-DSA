// Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
// NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).

// string1 = "computer"
// string2 = "cat"
// Output: "ompuer"

public class _32RemoveChar {
    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";

        System.out.println(removeChars(string1, string2));
    }

    public static String removeChars(String s1, String s2) {
        String res = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            boolean found=false;

            for (int j = 0; j < s2.length(); j++) {
                if (ch == s2.charAt(j)) {
                    found=true;
                }
            }
            if(!found){
                res += ch;
            }
        }
        return res;
    }
}