//     *
//    ***
//   *****
//  *******
// *********

public class _8_Star6 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n;i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            for(int l=0; l<i; l++){
                System.out.print("*");
            }
            for(int m=0; m<n-i-1; m++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
