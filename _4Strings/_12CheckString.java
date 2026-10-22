// Given a string, check if all its characters are the same or not.

// Input:
// s = "geeks"
// Output: False

public class _12CheckString {
    public static void main(String[] args) {
        String s = "gg";
        System.out.println(check(s));
    }

    public static boolean check(String s){
        for(int i=0; i<s.length()-1; i++){
            char ch=s.charAt(i);

            if(ch != s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}
