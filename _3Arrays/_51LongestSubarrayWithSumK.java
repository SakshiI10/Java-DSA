import java.util.HashMap;

public class _51LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, -10 };
        int k=15;
        System.out.println(longestSubarray(arr, k));
    }

    public static int longestSubarray(int[] arr, int k) {
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);

        long sum = 0;
        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k))
                length = Math.max(length, i - map.get(sum - k));

            map.putIfAbsent(sum, i);
        }

        return length;
    }
}