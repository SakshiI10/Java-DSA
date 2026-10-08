import java.util.ArrayList;
import java.util.Collections;

public class _53ArrLeader {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        System.out.println(leaders(arr));
    }

    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int maxEle = arr[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= maxEle) {
                maxEle = arr[i];
                res.add(maxEle);
            }
        }

        Collections.reverse(res);
        return res;
    }
}
