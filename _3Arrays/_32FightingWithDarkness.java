// Geek is at a book fair. There are total N kinds of books. He has to choose a book of a particular kind and read it loudly as many times as he can in the given time and earn points. Geek knows that reading a book of kind i once needs Ai minutes and it will give him Bi points. Geek has K minutes for reading books. During this time, he can only read a book of a particular kind as many times as he can so as to maximize his points. But he can not pick books of different kinds, he has to read the same book again and again. Find the maximum points Geek can get. 

// Input: 
// N = 3, K = 10
// A = {3, 4, 5}
// B = {4, 4, 5}
// Output: 12

public class _32FightingWithDarkness {
    public static void main(String[] args) {
        int n = 3;
        int k = 10;
        int[] A = { 3, 4, 5 };
        int[] B = { 4, 4, 5 };
        System.out.println(maxPoint(n, k, A, B));
    }

    public static int maxPoint(int n, int k, int[] A, int[] B){
        int maxPoints=0;

        for(int i=0; i<A.length; i++){
            int maxReads=k/A[i];
            int points=maxReads*B[i];
            if(maxPoints<points){
                maxPoints=points;
            }
        }
        return maxPoints;
    }
}
