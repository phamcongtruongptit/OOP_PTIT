import java.util.Scanner;

public class App {
    private static boolean check(long n){
        while(n>10){
            long i = n%10 ; 
            n/=10 ; 
            if(Math.abs(i - (n%10))!=1) return false ; 
        }
        return true ;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        while(t-->0){
            Long n = scanner.nextLong() ;
            if(check(n)) System.out.println("YES");
            else System.out.println("NO") ; 
        }
    }
}
