public class _11Recursion2 {
    static void rec1(int i1, int n1) {
        if (i1 > n1) {
            return;
        }
        System.out.print(i1+" ");
        rec1(i1 + 1, n1);
    }
    static void rec2(int i2, int n2) {
        if (i2 < 1) {
            return;
        }
        System.out.print(i2+" ");
        rec2(i2 - 1, n2);
    }

    public static void main(String[] args) {
        int n1 = 5;
        int i1 = 1;
        rec1(i1, n1);

        System.out.println();

        int n2 = 5;
        int i2 = 5;
        rec2(i2, n2);
    }
}