// Given a string, remove the vowels from the string.

// Input: S = "welcome to geeksforgeeks"
// Output: wlcm t gksfrgks

public class _7RemoveVowels {
    public static void main(String[] args) {
        String s = "welcome to geeksforgeeks";
        System.out.println(removeVowels(s));
    }

    public static String removeVowels(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {

                res = res + ch;
            }
        }
        return res;
    }
}