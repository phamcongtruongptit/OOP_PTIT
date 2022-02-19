import java.math.BigInteger;
import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in); 
        BigInteger a = scanner.nextBigInteger() ; 
        BigInteger b = scanner.nextBigInteger() ; 
        if(a.compareTo(b) > 0) {
            System.out.println("A>B");
        } else {
            System.out.println("A<B") ; 
        }
        
    }
}
