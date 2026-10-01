//HashSet
// Geek is given a task to select at most 10 employees for a company project. Each employee is represented by a single-digit ID number which is unique for all the selected employees for the project. Geek has a technical problem in his system which printed ID number multiple times. You are given array arr having all printed IDs. Help him to get rid of the repeated IDs.

// Input: arr[] = [2, 2, 3, 3, 7, 5] 
// Output: [2, 3, 7, 5] 

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class _34RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 7, 5};
        System.out.println(remDuplicate(arr));
    }

    static ArrayList<Integer> remDuplicate(int arr[]) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }
}
