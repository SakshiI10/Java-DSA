// Given a string S, remove all consonants and print the modified string that contains vowels only.

// Input: S = "abEkipo"
// Output: aEio

public class _16RemoveConsonentsFromStr {
    public static void main(String[] args) {
        String s = "abEkipo";
        System.out.println(removeConsonants(s));
    }

    public static String removeConsonants(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                res = res + ch;
            }
        }
        return res;
    }
}