import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static int []M = new int[100] ; 
    private static boolean check[] = new boolean[100];
    private static int n ; 
    private static boolean kiem_tra(){
        for(int  i  =  1 ; i<n ; i++){
            if(Math.abs(M[i]  - M[i+1]) <= 1) return false ; 
        }
        return true ; 
    }
    private static void init(Scanner scanner) {
        n = scanner.nextInt() ;
        for(int i = 1 ; i<=n ; i++){
            M[i] = i ; 
        }
        Arrays.fill(check, true) ; 
    }

    private static void out_put(){
        for(int i = 1 ; i<=n ; i++){
            System.out.print(M[i]); 
        }
        System.out.println();
    }

    private static void hoan_vi(int i){
        for(int j = 1 ; j<=n ; j++){
            if(check[j]) {
                M[i] = j ; 
                check[j] = false ; 
                if(i== n){
                    if(kiem_tra()) out_put() ; 
                } else  hoan_vi(i+1);
                check[j]  = true ; 
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t  = scanner.nextInt() ;
        while(t-->0){

            
            init(scanner);
            hoan_vi(1);
            System.out.println();
        }  
    }
}
