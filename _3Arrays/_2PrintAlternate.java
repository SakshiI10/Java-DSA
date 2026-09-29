public class _2PrintAlternate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        printAlternate(arr);
    }

    static void printAlternate(int[] arr) {
        int n = arr.length;
        if (arr == null || n <= 0)
            return;
        for (int i = 0; i < n; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
