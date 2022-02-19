import java.util.Scanner;

import packet1.GiaiPT;

public class App {
    public static void main(String[] args)  {
        int a , b ; 
        Scanner scanner = new Scanner(System.in) ; 
        a = scanner.nextInt() ;
        b = scanner.nextInt() ;
        GiaiPT bai1 = new GiaiPT() ; 
        bai1.input(a, b);
        bai1.giai_pt();

    }
}
