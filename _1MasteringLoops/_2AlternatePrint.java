public class _2AlternatePrint {
    
    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i=i+2) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        _2AlternatePrint sol = new _2AlternatePrint();
        
        int n = 4;
        int arr[] = {2, 3, 5, 5};
        
        sol.printArray(arr, n);
    }
}