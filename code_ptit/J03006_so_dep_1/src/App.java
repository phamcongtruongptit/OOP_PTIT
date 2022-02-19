import java.math.BigInteger;
import java.util.Scanner;

import packet1.KiemTraSoDep1; 

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in) ;   
        int t = scanner.nextInt() ;
        scanner.nextLine() ; 
        while(t-- >0){
            KiemTraSoDep1 T = new KiemTraSoDep1() ;
            T.input(scanner);
            System.out.println(T.KQ());
        }
    }
}
