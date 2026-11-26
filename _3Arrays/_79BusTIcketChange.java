// You are given an array arr[] representing passengers in a queue. Each bus ticket costs 5 coins, and arr[i] denotes the note a passenger uses to pay (which can be 5, 10, or 20). You must serve the passengers in the given order and always provide the correct change so that each passenger effectively pays exactly 5 coins. Your task is to determine whether it is possible to serve all passengers in the queue without ever running out of change.

// Input: arr[] = [5, 5, 5, 10, 20]
// Output: true

public class _79BusTicketChange {
    public static void main(String[] args) {
        int[] arr = { 5, 5, 5, 10, 20 };
        System.out.println(canServe(arr));
    }

    public static  boolean canServe(int[] arr) {
        int n = arr.length;
        int five = 0;
        int ten = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 5) {
                five++;
            } else if (arr[i] == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else if (arr[i] == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
