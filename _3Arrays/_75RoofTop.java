// Given and array arr[] representing the heights of n consecutive buildings. You can move from the roof of a building to the roof of the next adjacent building. You need to find the maximum number of consecutive steps you can put forward such that every step is to a higher building than the previous one. 

// Input: arr[] = [1, 2, 2, 3, 2] 
// Output: 1 

public class _75RoofTop {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 25, 50 };
        System.out.println(maxStep(arr));
    }

    public static int maxStep(int[] arr) {
        int n=arr.length;
        int count=0;
        int maxCount=0;
        
        for(int i=0; i<n-1; i++){
            if (arr[i]<arr[i+1]){
                count++;
                maxCount=Math.max(count, maxCount);
            } else {
                count=0;
            }
        }
        return maxCount;
    }
}
