import java.util.ArrayList;
import java.util.HashSet;

public class _54Duplicates {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 3 };
        System.out.print(findDuplicates(arr));
    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                res.add(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        return res;
    }
}
