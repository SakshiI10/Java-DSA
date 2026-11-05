// Input:
// str = "geeks"

// Output:
// ....g
// ...ge
// ..gee
// .geek
// geeks

public class _30TriangleGoingDownward {
    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(printTriangleDownwards(s));
    }

    public static String printTriangleDownwards(String s) {
        int n = s.length();
        String res = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                res += ".";
            }
            for (int k = 0; k <= i; k++) {
                res += s.charAt(k);
            }
            res += "\n";
        }
        return res;
    }
}