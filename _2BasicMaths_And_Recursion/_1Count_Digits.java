public class _1Count_Digits{
    static int count(int n){
        int count=0;
        while(n>0){
            // While there are digits → count one digit → remove one digit.
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args){
        int n=99999;
        System.out.print(count(n));
    }
}
