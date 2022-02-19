import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static boolean check(int []M ,int n){
        Arrays.sort(M);
        for(int i = 0; i < n-2; i++){
            for(int j = i+1 ; j<n-1; j++){
                for(int k=j+1 ; k<n ; k++){
                    if((M[i]*M[i] + M[j]*M[j]) == M[k]*M[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        while(t-->0){
            int  n = scanner.nextInt() ;
            int []M = new int[n] ; 
            for(int i  = 0 ; i < n ; i++){
                M[i] = scanner.nextInt() ; 
            }
            if(check(M, n)) System.out.println("YES");
            else System.out.println("NO") ;
        }
    }
}
