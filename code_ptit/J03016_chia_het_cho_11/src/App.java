import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            BigInteger a = scanner.nextBigInteger() ; 
            BigInteger check  = new BigInteger("11") ; 

            BigInteger mod = a.mod(check) ; 
            BigInteger mo = new BigInteger("0") ; 
            if( mod.compareTo(mo) == 0 ) System.out.println("1");
            else System.out.println("0") ; 
        }
}
}
