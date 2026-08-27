// *********
//  *******
//   *****
//    ***
//     *

public class _9_Star7 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<n-i; k++){
                System.out.print("*");
            }
            for(int l=0; l<n-i-1; l++){
                System.out.print("*");
            }
            for(int m=0; m<i; m++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
