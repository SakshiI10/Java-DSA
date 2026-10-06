public class _42MaxConsecutiveBit {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 1, 1 };
        System.out.print(maxConsecBits(arr));
    }

    public static int maxConsecBits(int[] arr) {
        int count = 1;
        int maxCount = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;

    }
}
