class _1Print {
    
    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        _1Print sol = new _1Print();
        
        int n = 4;
        int arr[] = {2, 3, 5, 5};
        
        sol.printArray(arr, n);
    }
}