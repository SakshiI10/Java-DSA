// Given a string S, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values in the string.

// Input:
// S = "#GeeKs01fOr@gEEks07"
// Output:
// 5
// 8
// 4
// 2

package String;

public class _4CountTypeOfChar {
    public static void main(String[] args) {
        String s = "#GeeKs01fOr@gEEks07";
        countCharacters(s);
    }

    public static void countCharacters(String s) {
        int upper_count = 0;
        int lower_count = 0;
        int special_count = 0;
        int digit_count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                lower_count++;
            } else if (ch >= 'A' && ch <= 'Z') {
                upper_count++;
            } else if (ch >= '0' && ch <= '9') {
                digit_count++;
            } else {
                special_count++;
            }
        }

        System.out.println(upper_count);
        System.out.println(lower_count);
        System.out.println(special_count);
        System.out.println(digit_count);
    }
}
