// Remove all characters except the numeric characters from an alphanumeric string.

// Input: S = "AA1d23cBB4"
// Output: 1234

public class _6RemoveChar {
    public static void main(String[] args) {
        String s = "AA1d23cBB4";
        System.out.println(removeCharacters(s));
    }

    public static String removeCharacters(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                res = res + ch;
            }
        }

        return res;
    }
}