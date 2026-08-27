// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

public class _22_NumPattern7 {
    public static void main(String[] args){
        int n=4;
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int min=Math.min(Math.min(i,j),Math.min(2 * n - 2 - i, 2 * n - 2 - j));
                System.out.print(n - min + " ");
            }
            System.out.println();
        }
    }
}
