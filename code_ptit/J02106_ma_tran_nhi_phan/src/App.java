import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int [][]M = new int[n][3] ; 
        int  count = 0 ; 
        for(int i = 0 ; i<n; i++){
            int check  = 0  ; 
            for(int j  = 0 ; j<3 ; j++){
                M[i][j] = scanner.nextInt() ; 
                if(M[i][j] == 1) check++ ; 
            }
            if(check  > (3-check)) count++; 
        }
        System.out.println(count) ; 
    }
}
