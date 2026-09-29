// A guy has to reach his home and does not want to be late. He takes train to reach home. He has a mental illness, so he always switches train at every station.
// Input: N = 3
// A[] = {2, 1, 2}
// B[] = {3, 2, 1}
// Output: 5

public class _23TwoArrPermutationCheck{
    public static void main(String[] args){
        int A[]={2, 1, 2};
        int B[]={3, 2, 1};
        System.out.print(minTime(A, B));
    }

    static int minTime(int[] a, int[] b) {
        int timeWithA = 0;
        int timeWithB = 0;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                timeWithA += a[i];
            } else {
                timeWithA += b[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                timeWithB += b[i];
            } else {
                timeWithB += a[i];
            }
        }

        return Math.min(timeWithA, timeWithB);
    }
}