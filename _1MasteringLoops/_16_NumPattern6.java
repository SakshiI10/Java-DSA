// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

public class _16_NumPattern6 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += 1;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
