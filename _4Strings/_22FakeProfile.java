// There is a hacker named "Vijay" who has developed a method to check whether an id at some social networking site is fake or real using its username.

// His method includes: if the number of distinct consonent characters in one's user name is odd, then the user is a male, otherwise a female. You are given the string that denotes the user name, please help Vijay to determine the gender of this user by his method. Ignore the vowels.
// Note: The input only contains lowercase English alphabets.

// Input: a = "jpmztf"
// Output: SHE!

public class _22FakeProfile {
    public static void main(String[] args) {
        String s = "jpmztf";
        solve(s);
    }

    public static void solve(String s) {
        int count=0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                    count++;
            }
        }
        if(count%2==0){
            System.out.println("SHE!");
        } else {
            System.out.println("HE!");
        }
    }

}