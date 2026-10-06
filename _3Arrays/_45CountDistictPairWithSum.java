import java.util.HashSet;

public class _44CountDistictPairWithSum {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 5, 7, 7, 8 };
        int target = 13;
        System.out.println(countDistinctPairs(arr, target));
    }

    static int countDistinctPairs(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<String> pairs = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);

                pairs.add(a + "," + b);
            }

            set.add(num);
        }

        return pairs.size();
    }
}