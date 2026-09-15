public class _3PalindromicArray {
    public boolean isPalindrome(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _3PalindromicArray sol = new _3PalindromicArray();
        int[] arr = { 1, 2, 3, 2, 1 };
        System.out.println(sol.isPalindrome(arr));
    }
}