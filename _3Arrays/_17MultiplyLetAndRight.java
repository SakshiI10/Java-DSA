// Pitsy needs help with the given task by her teacher. The task is to divide an array into two sub-array (left and right) containing n/2 elements each and do the sum of the subarrays and then multiply both the subarrays.
// Note: If the length of the array is odd then the right half will contain one element more than the left half.

// Input : arr[ ] = {1, 2, 3, 4}
// Output : 21

public class _17MultiplyLetAndRight {
    public static void main(String[] args)   {
        int arr[]={1, 2, 3, 4};
        System.out.print(multiply(arr));
    }

    static int multiply(int[] arr){
        int n=arr.length;
        int sum1=0;
        int sum2=0;
        for(int i=0; i<n/2; i++){
           sum1 += arr[i] ;
        }
        for(int i=n/2; i<n; i++){
           sum2 += arr[i] ;
        }
        int res=sum1*sum2;
        return res;
    }
}
