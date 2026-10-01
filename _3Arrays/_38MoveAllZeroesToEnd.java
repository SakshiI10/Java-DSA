import java.util.Arrays;

public class _38MoveAllZeroesToEnd {
    public static void main(String[] arg) {
        int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        pushZerosToEnd(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < n) {
            arr[index] = 0;
            index++;
        }

    }
}
