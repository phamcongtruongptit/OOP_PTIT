import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        // int t = scanner.nextInt();
        // while(t-- >0){
            BigInteger a = scanner.nextBigInteger() ; 
            BigInteger b = scanner.nextBigInteger() ; 

            BigInteger c  ; 
            int tmp = 0 ; 
            // if(a.compareTo(b) == 1) {
                c = a.subtract(b) ;  
                // tmp = a.toString().length() -  c.toString().length(); 
            // } else{
                // c = b.subtract(a) ; 
                // tmp = b.toString().length() -  c.toString().length(); 
            // }
            // for(int i=1; i<=tmp ; i++) System.out.print("0");
            System.out.println(c);
        // }
    }
}
