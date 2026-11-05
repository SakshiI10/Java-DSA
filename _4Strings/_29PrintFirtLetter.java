// Print first letter of every word in the string
// Difficulty: BasicAccuracy: 71.6%Submissions: 45K+Points: 1
// Given a string S, the task is to create a string with the first letter of every word in the string.

// Input: S = "geeks for geeks"
// Output: gfg

public class _29PrintFirtLetter {
    public static void main(String[] args) {
        String s = "geeks for geeks";
        System.out.println(firstAlphabet(s));
    }

    public static String firstAlphabet(String s) {
        String res="";
        int n=s.length();
        res += s.charAt(0);
        
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);

            if(ch == ' '){
                res += s.charAt(i+1);
            }
        }
        return res;
    }
}
