public class _7Print_Divisor {
    static void printDivisor(int n) {
        System.out.print("Divisors:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" "+i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 36;
        printDivisor(n);
    }
}