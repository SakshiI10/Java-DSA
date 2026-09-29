// You are given an array Arr of size N. Find the sum of distinct elements in an array.

// Input:
// N = 5
// Arr[] = {1, 2, 3, 4, 5}
// Output: 15

import java.util.HashSet;

public class _21SumOfDistinctElement {
    public static void main(String[] args){
        int Arr[]={1,2,3,4,4};
        System.out.println(findSum(Arr));
    }
    static int findSum(int[] Arr){
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int num:Arr){
            if(set.add(num)){
                sum += num;
            }
        }
        return sum;
    }
}
