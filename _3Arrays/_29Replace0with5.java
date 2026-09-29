// You are given an integer n. You need to convert all zeroes of n to 5.

// Input: n = 1004
// Output: 1554

public class _29Replace0with5 {
    public static void main(String[] args) {
        int n = 1004;
        System.out.println(convertFive(n));
    }

    public static int convertFive(int n) {
        String str=String.valueOf(n);
        str=str.replace('0', '5');
        return Integer.parseInt(str);
    }
}
