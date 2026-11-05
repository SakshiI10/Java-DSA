// Given a string of length N, made up of only uppercase characters 'R' and 'G', where 'R' stands for Red and 'G' stands for Green. Find out the minimum number of characters you need to change to make the whole string of the same colour.

// Input: N=5
// S="RGRGR"
// Output: 2

public class _28RedOrGreen {
    public static void main(String[] args) {
        String s = "RGRGR";
        System.out.println(redOrGreen(s));
    }

    public static int redOrGreen(String s) {
        int redCount = 0;
        int greenCount = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == 'R') {
                redCount++;
            } else if (ch == 'G') {
                greenCount++;
            }
        }
        return Math.min(greenCount, redCount);
    }
}
