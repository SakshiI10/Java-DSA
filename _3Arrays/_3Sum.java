public class _3Sum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sum(arr));
    }

    static int sum(int[] arr) {
        int n = arr.length;
        if (arr == null || n <= 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
