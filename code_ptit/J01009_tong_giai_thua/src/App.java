import java.util.Scanner;

public class App {
    public static long sum(int n){
        long x = 1 ; 
        for(int  i = 1 ; i<=n ; i++){
            x *= i ; 
        }
        return x ; 
    }
    public static void main(String[] args) throws Exception {
        long ans = 0  ; 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ;
        for(int i = 1 ; i<=n ; i++){
            ans  += sum(i) ; 
        }
        System.out.println(ans);
    }
}
