// Given a string s. The task is to convert characters of string to lowercase.

// Input: 
// s = "ABCddE"
// Output: "abcdde

public class _9ConvertToLowercase {
    public static void main(String[] args) {
        String s = "ABCddE";
        System.out.println(toLower(s));
    }

    public static String toLower(String s) {
        return s.toLowerCase();
        // return s.toUpperCase();
    }
}