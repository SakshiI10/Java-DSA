public class _2Reverse_A_Num {
    static int isReverse(int n) {
        int rev_num = 0;
        while (n > 0) {
            int num = n % 10;
            rev_num = (rev_num * 10) + num;
            n = n / 10;
        }
        return rev_num;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.print(isReverse(n));
    }
}
