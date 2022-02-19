import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine() ;
        while(t-->0){
            String s = scanner.nextLine();
            String []M = s.split("\\s+");
            for(int i = 0 ; i<M.length ; i++){
                StringBuilder X = new StringBuilder(M[i]);
                System.out.print(X.reverse() + " ");
            }
            System.out.println();
        }
    }
}
