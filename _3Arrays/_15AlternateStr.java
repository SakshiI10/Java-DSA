// Given an array arr[] of N distinct integers, output the array in such a way that the first element is first maximum and the second element is the first minimum, and so on.

// Input: N = 7, arr[] = {7, 1, 2, 3, 4, 5, 6}
// Output: 7 1 6 2 5 3 4

import java.util.ArrayList;
import java.util.Arrays;

public class _15AlternateStr {
    public static void main(String[] arg){
        int arr[]={7, 1, 2, 3, 4, 5, 6};
        alternateSort(arr);
    }

    public static ArrayList<Integer> alternateSort(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> result=new ArrayList();
        int left=0;
        int right=n-1;
        
        for(int i=0; i<n; i++){
            if(i%2==0){
                result.add(arr[right]);
                right=right-1;
            } else {
                result.add(arr[left]);
                left += 1;
            }
        }
        for(int num: result){
            System.out.print(num + " ");
        }
        return result;
    }
}
