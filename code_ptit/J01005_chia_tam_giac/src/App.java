import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n , H ; 
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            n    = scanner.nextInt();
          H = scanner.nextInt();
          for(int i =1 ;  i< n ; i++){
              System.out.printf("%.6f " , H*Math.sqrt((double)i / n)) ; 
          }
          System.out.println();
        }
    }
}
