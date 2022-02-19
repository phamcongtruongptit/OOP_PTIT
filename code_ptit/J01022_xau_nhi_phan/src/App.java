import java.util.Scanner;

public class App {
    private static long []Fibo = new long[93];
    private static void tinh(){
        Fibo[1]  = 1 ; 
        Fibo[2] = 1 ; 
        for(int i = 3 ; i<93 ; i++){
            Fibo[i] = Fibo[i-1] + Fibo[i-2] ; 
        }
    }
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        tinh();
        while(t-->0){
            int n = scanner.nextInt();
            long  k = scanner.nextLong();
            while(n>2){
                if(k>Fibo[n-2]){
                    k-=Fibo[n-2] ;
                    n-=1 ;
                } else {
                    n-=2 ; 
                }
            }
            if(n==1) System.out.println("0");
            else System.out.println("1");
        }

        
    }
}
