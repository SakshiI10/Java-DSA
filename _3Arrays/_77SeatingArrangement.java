// Given an integer k representing the number of people to be seated and an array seats[], where 0 denotes an empty seat and 1 denotes an occupied seat.

// Determine whether it is possible to seat all k people such that no two occupied seats are adjacent (including newly seated people).

// Input: k = 2, seats[] = [0, 0, 1, 0, 0, 0, 1]
// Output: true

public class _84SeatingArrangement {
    public static void main(String[] args) {
        int[] seats = { 0, 0, 1, 0, 0, 0, 1 };
        int k = 2;
        System.out.println(canSeatAllPeople(k, seats));
    }

    public static boolean canSeatAllPeople(int k, int[] seats) {
        int n = seats.length;

        for (int i = 0; i < n - 1; i++) {
            if (seats[i] == 1 && seats[i + 1] == 1) {
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            if (seats[i] == 0 &&
                    (i == 0 || seats[i - 1] == 0) &&
                    (i == n - 1 || seats[i + 1] == 0)) {

                seats[i] = 1;
                k--;
            }
        }
        return k <= 0;
    }
}
