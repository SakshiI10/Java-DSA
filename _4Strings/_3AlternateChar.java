package String;

public class _3AlternateChar {
    public static void main(String[] args) {
        System.out.println(delAlternate("Geeks"));
        System.out.println(delAlternate("GeeksforGeeks"));
    }

    public static String delAlternate(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i += 2) {
            result += s.charAt(i);
        }

        return result;
    }
}