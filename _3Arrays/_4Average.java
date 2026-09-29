public  class _4Average {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(avg(arr));
    }

    static int avg(int[] arr) {
        int n = arr.length;
        if (arr == null || n <= 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int avg=sum/n;
        return avg;
    }
}
