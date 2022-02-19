import java.util.Scanner;
import java.util.Vector;

public class App {
    private static long uocSoMin(long n){
        long  i = 2 ; 
       Vector<Long> VT = new Vector<Long>() ;

       for( i = 2 ; i<=Math.sqrt(n); i++){
           while(n%i == 0){
               n/=i ; 
               VT.add(i);
               
           }
       }
       if(n!=1) VT.add(n);
       return VT.get(VT.size() - 1) ; 

    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ; 
        while(t-->0){
            long n = scanner.nextLong();
            System.out.println(uocSoMin(n));
        }

    }
}
