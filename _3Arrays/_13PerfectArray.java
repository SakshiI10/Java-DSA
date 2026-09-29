// Given an array arr of size n and you have to tell whether the arr is perfect or not. An array is said to be perfect if its reverse array matches the original array. If the arr is perfect then return True else return False.

// Input :
// n = 5
// arr = {1, 2, 3, 2, 1}
// Output : PERFECT

public class _13PerfectArray {
    public static void main(String[] args){
        int arr[]={1, 2, 3, 2, 1};
        int n=5;
        isPerfect(arr,n);
    }
    static void isPerfect(int arr[], int n){
        for(int i=0; i<n/2; i++){
            if(arr[i] != arr[n-i-1]){
                System.out.print("NOT PRFECT");;
            }
        }
        System.out.print("PERFECT");
    }
}