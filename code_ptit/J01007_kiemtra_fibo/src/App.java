// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner scanner = new Scanner(System.in);
//         int t = scanner.nextInt() ;
//         while(t-- > 0) {
//             long n = scanner.nextLong() ;
//             int a = 
//         }
//     }
// }
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        long M[] = new long[2000] ;
        M[1] = 1 ; M[2] = 1  ; 
        for(int  i=3 ; i<2000 ; i++){
            M[i] = M[i-1] + M[i-2] ;  
        } 
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        while(t-- > 0) {
            int check = 0 ; 
            long n = scanner.nextLong() ;
            if(n<=1){
                System.out.println("YES");
                
            }
            else {

                for(int i=1 ; i<2000 ; i++){
                    if(M[i] == n){
                        check =1 ;  
                        System.out.println("YES");
                        break ; 
                    }
                }
                if(check == 0) System.out.println("NO");
            }
            
        }
    }
}
