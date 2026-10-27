// Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.

// Input:
// str = 1abc23
// Output: 24

public class _26SumOfNumInStr {
    public static void main(String[] args) {
        String s = "1abc23";
        System.out.println(findSum(s));
    }

    static int findSum(String s) {
        int totalSum = 0;
        String currentNum = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                currentNum += ch;
            } else {
                if (!currentNum.isEmpty()) {
                    totalSum += Integer.parseInt(currentNum);
                    currentNum = "";
                }
            }
        }
        if (!currentNum.isEmpty()) {
            totalSum += Integer.parseInt(currentNum);
        }
        return totalSum;
    }
}