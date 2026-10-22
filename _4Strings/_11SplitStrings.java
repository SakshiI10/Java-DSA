// Given a string S which consists of alphabets , numbers and special characters. You need to write a program to split the strings in three different strings S1, S2 and S3 such that the string S1 will contain all the alphabets present in S , the string S2 will contain all the numbers present in S and S3 will contain all special characters present in S.  The strings S1, S2 and S3 should have characters in same order as they appear in input.

// Input:
// S = geeks01for02geeks03!!!
// Output:
// geeksforgeeks
// 010203
// !!!

public class _11SplitStrings {
    public static void main(String[] args) {
        String s = "geeks01for02geeks03!!!";
        splitString(s);
    }

    public static void splitString(String s) {
        String s1 = "";
        String s2 = "";
        String s3 = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z')) {
                s1 = s1 + ch;
            } else if (ch >= '0' && ch <= '9') {
                s2 = s2 + ch;
            } else {
                s3 = s3 + ch;
            }
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}