import java.util.HashSet;

public class _44_3Sum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;
        System.out.println(hasTripletSum(arr, target));
    }

    public static boolean hasTripletSum(int arr[], int target) {
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            int remaining=target-arr[i];
            HashSet<Integer> set=new HashSet<>();
            
            for(int j=i+1; j<n; j++){
                int required=remaining-arr[j];
                if (set.contains(required)) {
                    return true;
                }

                set.add(arr[j]);
            }
        }
        return false;
        
    }
}
