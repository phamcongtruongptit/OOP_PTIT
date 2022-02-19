import java.util.Scanner;

import packet1.MaTran;

public class App {
    public static void main(String[] args) throws Exception {
        int test = 1 ;
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(test <=t){
            MaTran MT = new MaTran() ; 
            MT.input(scanner);
            System.out.printf("Test %d:\n" , test);
            MT.tinh_tich();
            test++ ; 
        }
    }
}
