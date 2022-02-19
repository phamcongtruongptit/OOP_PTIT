import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static boolean[] isPrime = new boolean [2000005];
    private static int [] arrayPrime = new int [200002] ; 
    private static void sang(){
        Arrays.fill(isPrime , true);
        isPrime[0] = false;
        isPrime[1] = false;
        int index = 0 ;
        for(int i = 2; i<=Math.sqrt(2000005) ; i++){
            if(isPrime[i] == true){
                arrayPrime[index++] = i;
                for(int j=i*i ; j<2000005 ; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt() ;
        sang();
        long SUM  = 0 ; 
        while(n-->0){

            int k = scanner.nextInt() ;
            
            if(isPrime[k] == true) SUM+=k ; 
            else {
                int index = 0 ; 
                while(k!=1){
                    while(k%arrayPrime[index] == 0){
                        SUM+=arrayPrime[index];
                        k/=arrayPrime[index]; 
                    }
                    if(isPrime[k] == true){
                        SUM+=k; 
                        break ;
                    }
                    index++ ; 
                }
            }
        }
        System.out.println(SUM);
        scanner.close();

    }
}
