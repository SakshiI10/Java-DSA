import java.util.ArrayList;

public class _52LongestIncSubarray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 5, 7, 8, 9, 1, 2};
        System.out.println(longIncSubArr(arr));
    }

    public static ArrayList<Integer> longIncSubArr(int[] arr) {
        int n = arr.length;
        int start = 0, maxLen = 1, currLen = 1, currStart = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currLen++;
            } else {
                currLen = 1;
                currStart = i;
            }

            if (currLen > maxLen) {
                maxLen = currLen;
                start = currStart;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = start; i < start + maxLen; i++)
            res.add(arr[i]);

        return res;
    }
}