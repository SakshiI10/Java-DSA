public class _1Print {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 5 };
        printArray(arr);
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        if (arr == null || n <= 0)
            return;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
