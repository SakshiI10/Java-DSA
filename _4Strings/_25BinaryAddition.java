// You are given a binary string s of length n. You have to perform binary addition of the string with '1'.

// Input: n = 4
// s = 1010
// Output: 1011

public class _25BinaryAddition {
    public static String binaryAdd(int n, String s) {
        int num = Integer.parseInt(s, 2);
        num += 1;

        String result = Integer.toBinaryString(num);

        if (result.length() < n) {
            result = "0".repeat(n - result.length()) + result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(binaryAdd(4, "1010"));
        System.out.println(binaryAdd(3, "111"));
    }
}