public class _48MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400 };
        int k=2;
        System.out.println(maxSubarraySum(arr, k));
    }

    public static int maxSubarraySum(int[] arr, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
