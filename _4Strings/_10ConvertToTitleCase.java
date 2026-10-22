// Given a string str, convert the first letter of each word in the string to uppercase. 

// Input:
// str = "i love programming"
// Output: "I Love Programming

public class _10ConvertToTitleCase {
    public static void main(String[] args) {
        String s = "i love programming";
        System.out.println(to_upper(s));
    }

    public static String to_upper(String s) {
        String res = "";
        boolean capitalize = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                res = res + ch;
                capitalize = true;
            } else if (capitalize) {
                res = res + Character.toUpperCase(ch);
                capitalize = false;
            } else {
                res = res + ch;
            }
        }

        return res;
    }
}