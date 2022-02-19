import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            BigInteger a = scanner.nextBigInteger() ; 
            BigInteger b = scanner.nextBigInteger() ; 
            BigInteger c = a.gcd(b) ; 
            System.out.println(c);
        }
    }
}
