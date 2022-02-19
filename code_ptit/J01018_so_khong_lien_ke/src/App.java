import java.util.Scanner;

public class App {
    private static boolean check1(long n){
        int sum = 0 ; 
        while(n>0){
            sum+=n%10 ; 
            n/=10 ; 
        }
        if(sum%10 == 0) return true ; 
        else return false ; 
    }
    private static boolean check2(long n){
        while(n>10){
            long x = n%10 ; 
            n/=10 ; 
            if(Math.abs(x - (n%10)) != 2) return false ; 
        }
        return true ; 
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        while(t-->0){

            long n = scanner.nextLong() ;
            if(check1(n) && check2(n)) System.out.println("YES");
            else System.out.println("NO") ; 
        }
    }
}
