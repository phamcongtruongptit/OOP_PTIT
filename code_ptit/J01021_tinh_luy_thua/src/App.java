import java.util.Scanner;

public class App {
    private static long MAX =(long)1000000007  ;

    private static long luyThua(int a , long b){
        if(b==0) return 1 ; 
        long x = luyThua(a , b/2) ; 
        if(b%2 == 0) return ((x%MAX)*(x%MAX)) % MAX ; 
        return  ( (a%MAX) * ( ( (x%MAX) * (x%MAX) ) % MAX ) ) % MAX ; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int a = scanner.nextInt();
            long b = scanner.nextLong();
            if(a == 0 && b == 0){
                break ;  
            } else {
                System.out.println(luyThua(a, b));
            }
        }
    }
}
