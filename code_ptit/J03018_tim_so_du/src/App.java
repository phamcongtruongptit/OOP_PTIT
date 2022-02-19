import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int t = scanner.nextInt() ;
       while(t-->-0){
            BigInteger n = scanner.nextBigInteger() ; 
            BigInteger bon  = new BigInteger("4") ; 

            BigInteger mod = n.mod(bon) ;   

            BigInteger zo = new BigInteger("0") ; 
            
            if(mod.compareTo(zo) == 0) System.out.println("4") ;
            else {
                System.out.println("0");
            }

       }
    }
    
}
