import java.util.Scanner;

import packet1.Bcnn;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            int  n  = scanner.nextInt();
            Bcnn T = new Bcnn() ; 
            System.out.println(T.BCNNcuaN(n));
        }
    }
}
