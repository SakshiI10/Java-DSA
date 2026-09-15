public class _10Recursion_PrintNames {
    static void rec(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("xyz");
        rec(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        rec(n);
    }
}
