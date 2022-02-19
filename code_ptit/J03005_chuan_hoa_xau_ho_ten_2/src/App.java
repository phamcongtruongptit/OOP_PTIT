import java.util.Scanner;

import packer1.Chuan_Hoa_2;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t  = scanner.nextInt() ;
        scanner.nextLine() ;
        while(t-->0){
            Chuan_Hoa_2 T = new Chuan_Hoa_2() ;
            T.input(scanner);
            System.out.println(T.chuan_hoa_2());
        }
    }
}
