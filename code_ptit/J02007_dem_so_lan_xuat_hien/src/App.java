import java.util.Scanner;

import packet1.mang;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t  = scanner.nextInt() ; 
        int test =1 ; 
        while(test <= t){
            mang X  = new mang() ; 
            X.input(scanner);
            System.out.printf("Test %d:\n " , test );
            X.output();
            test++ ; 
        }
    }
}
