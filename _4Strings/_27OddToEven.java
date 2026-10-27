// Given an odd number in the form of string, the task is to make largest even number possible from the given number provided one is allowed to do exactly only one swap operation, if no such number is possible then return the input string itself.

// Input:
// s = 4543
// Output: 4534

public class _27OddToEven {
    public static void main(String[] args) {
        System.out.println(makeEven("4543"));
        System.out.println(makeEven("1539"));
    }

    static String makeEven(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();

        for(int i=n-2; i>=0; i--){
            if (arr[i] % 2 == 0){
                char temp=arr[i];
                arr[i]=arr[n-1];
                arr[n-1]=temp;
                return new String(arr);
            }
        }
        return s;
    }
}