public class _9SmallerAndLarger {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 11, 12, 19 };
        int n=7;
        int x=0;
        getMoreAndLess(arr, n, x);
    }

    static void getMoreAndLess(int[] arr, int n, int x){
        int less=0;
        int more=0;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                less=less+1;
            } else {
                more=more+1;
            }
        }
        System.out.print(less + " " + more);
    }
}
