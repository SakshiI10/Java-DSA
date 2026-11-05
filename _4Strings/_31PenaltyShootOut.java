// Given a string S contains 0's, 1's, and 2's, the task is to find the number of goals on the penalty.

//  '1' stands for "goal".
//  '0' stands for "no goal".
//  '2' stands for a foul which gives a penalty.

//  Input: S = "1012012112110"
// Output: 2

public class _31PenaltyShootOut {
    public static void main(String[] args) {
        String s = "1012012112110";
        System.out.println(countCoversions(s));
    }

    public static int countCoversions(String s) {
        int n=s.length();
        int count=0;

        for(int i=0; i<n; i++){
            char ch=s.charAt(i);

            if (ch=='2' && s.charAt(i + 1) == '1'){
                count++;
            }
        }
        return count;
    }
}
