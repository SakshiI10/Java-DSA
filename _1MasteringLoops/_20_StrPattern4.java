//    A
//   ABA
//  ABCBA
// ABCDCBA

public class _20_StrPattern4 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((char)('A' + k));
            }
            for (int l = i-1; l >= 0; l--) {
                System.out.print((char)('A' + l));
            }
            System.out.println();
        }
    }
}

