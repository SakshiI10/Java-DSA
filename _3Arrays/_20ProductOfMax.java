// Given two arrays of A and B respectively of sizes N1 and N2, the task is to calculate the product of the maximum element of the first array and minimum element of the second array.

// Input : A[] = {5, 7, 9, 3, 6, 2}, 
//         B[] = {1, 2, 6, -1, 0, 9}
// Output : -9

import java.util.Arrays;

public class _20ProductOfMax {
    public static void main(String[] args){
        int A[]={5,7,9,3,6,2};
        int B[]={1,2,6,-1,0,9};
        System.out.println(findMultiplication(A,B));
    }
    static int findMultiplication(int[] A, int[] B){
        Arrays.sort(A);
        Arrays.sort(B);
        int n=A.length;
        int product=A[n-1]*B[0];
        return product;
    }
}
