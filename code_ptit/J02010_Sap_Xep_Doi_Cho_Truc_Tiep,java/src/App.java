import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ; 
        int M[] = new int[n+5] ; 
        for(int i=0 ; i<n ; i++){
            M[i] = scanner.nextInt() ; 
        }

        for(int i=0 ; i<n-1 ; i++){
            for(int j= i+1 ; j<n ; j++){
                if(M[i] > M[j]){
                    int tmp = M[i]  ;
                    M[i] = M[j] ; 
                    M[j] = tmp ; 
                }
            }
            System.out.printf("Buoc %d: " , i+1);
            for(int s = 0 ; s< n; s++) {
                System.out.print(M[s] + " ");
            }
            System.out.println();
        }
    }
}
