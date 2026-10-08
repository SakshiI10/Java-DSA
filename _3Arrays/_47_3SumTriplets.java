import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _47_3SumTriplets {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(triplets(arr));
    }

    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<String> triplets = new HashSet<>();

        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int remaining = -arr[i];
            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int required = remaining - arr[j];

                if (set.contains(required)) {
                    int a = arr[i];
                    int b = Math.min(required, arr[j]);
                    int c = Math.max(required, arr[j]);

                    String key = a + "," + b + "," + c;

                    if (!triplets.contains(key)) {
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(a);
                        triplet.add(b);
                        triplet.add(c);
                        result.add(triplet);
                        triplets.add(key);
                    }
                }
                set.add(arr[j]);
            }
        }
        Collections.sort(result, (a, b) -> {
            for (int i = 0; i < 3; i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        return result;
    }
}