// For a given string S, comprising of only lowercase English alphabets, eliminate the vowels from the string that occur between two consonants(sandwiched between two immediately adjacent consonants). Print the updated string on a new line.

// Input : S = "bab"
// Output : bb

public class _15SandwichVowels {
    public static void main(String[] args) {
        String s = "bab";
        System.out.println(Sandwiched_Vowel(s));
    }

    public static String Sandwiched_Vowel(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i > 0 && i < s.length() - 1 && isVowel(ch) && !isVowel(s.charAt(i - 1)) && !isVowel(s.charAt(i + 1))) {
                continue;
            }
            res = res + ch;
        }
        return res;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}