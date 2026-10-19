// Convert String to Char

package String;
import java.util.Arrays;

public class _2StrToChar {
    public static void main(String[] args) {
        String s = "qwerty";
        char[] result = strtochar(s);
        System.out.println(Arrays.toString(result));
    }

    public static char[] strtochar(String s) {
        return s.toCharArray();
    }
}