import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ; 
        int M[] = new int[n+5] ; 
        for(int i=0 ; i<n ; i++){
            M[i] = scanner.nextInt() ; 
        }
        for(int i = n-1 ; i>=0 ; i--) {
            Boolean ok = false ; 
            for(int j=0 ; j<i ; j++){
                if(M[j]>M[j+1]){
                    ok = true ; 
                    int tmp =  M[j] ; 
                    M[j] = M[j+1] ; 
                    M[j+1] = tmp  ; 
                }
            }
            if(ok==false) break ; 
            System.out.print("Buoc "+ (n-i) + ": ");
            for(int k = 0 ; k< n ; k++) System.out.print(M[k]+ " ");
            System.out.println();

        }

    }
    
}
