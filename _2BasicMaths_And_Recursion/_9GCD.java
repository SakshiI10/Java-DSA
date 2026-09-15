public class _9GCD {
    static int isGcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        System.out.print(isGcd(a, b));
    }
}
