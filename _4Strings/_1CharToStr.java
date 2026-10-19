// Convert Character to String

// String result = "":	Start with an empty, immutable string
// StringBuilder result = new StringBuilder():	Start with an empty, mutable character StringBuilder

package String;

public class _1CharToStr {
    public static void main(String[] args) {
        char[] arr = { 'q', 'w', 'e', 'r', 't', 'y' };
        System.out.println(chartostr(arr));
    }

    public static String chartostr(char[] arr) {
        int n = arr.length;
        String result = "";

        for (int i = 0; i < n; i++) {
            result += arr[i];
        }

        return result;
    }
}
