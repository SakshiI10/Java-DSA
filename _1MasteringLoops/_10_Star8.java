// *****
// *   *
// *   *
// *   *
// *****

public class _10_Star8 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int k = 0; k < n - 2; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}