import java.util.Scanner;

public class App {
    // private int  n  ; 
    // private int M[][] = new int[1005][1005] ; 
    public static void main(String[] args) {
        int  n  ; 
        int M[][] = new int[1005][1005] ; 
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int  i =1 ; i<=n ; i++) {
            for(int j =1 ; j<=n ; j++) {
                M[i][j] = scanner.nextInt();
            }
        }
        for(int i =1 ; i<=n ; i++) {
            System.out.print("List("+i+ ") = ");
            for(int  j = 1  ; j<=n ; j++) {
                if(M[i][j] == 1){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        
    }
}
