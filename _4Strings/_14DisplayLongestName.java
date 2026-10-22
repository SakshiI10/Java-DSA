// Given a list of names, display the longest name. If there are multiple names of the longest size then return the first occurring name .

// Input:
// n = 5
// names[] = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" }
// Output: GeeksforGeeks
// Explanation: name "GeeksforGeeks" has maximum length among all names.

public class _14DisplayLongestName {
    public static void main(String[] args) {
        String[] names = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
        System.out.println(longestName(names));
    }

    public static String longestName(String[] names) {
        int n = names.length;
        String longest_name = "";
        int max_length = 0;

        for (int i = 0; i < n; i++) {
            if (names[i].length() > max_length) {
                longest_name = names[i];
                max_length = names[i].length();
            }
        }
        return longest_name;
    }
}
