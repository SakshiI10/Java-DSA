public class _4PalindromeNumInArr {
    public boolean isPalinArray(int[] arr){
        for(int num : arr){
            if(!isPalindrome(num)){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int num){
        int original = num;
        int reverse = 0;
        while(num>0){
            int digit=num%10;
            reverse=(reverse*10)+digit;
            num=num/10;
        }
        return original==reverse;
    }
    
    public static void main(String[] args) {
        _4PalindromeNumInArr sol = new _4PalindromeNumInArr();
        int[] arr = { 111, 222, 333, 444, 555 };
        System.out.println(sol.isPalinArray(arr));
    }
}