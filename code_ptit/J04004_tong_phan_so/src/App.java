import java.util.Scanner;

import packet1.Phan_So;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() ;
        int b = scanner.nextInt() ;
        int c = scanner.nextInt() ;
        int d = scanner.nextInt() ;
        Phan_So p1 = new Phan_So(a ,b ) ; 
        Phan_So p2 = new Phan_So(c , d) ;
        Phan_So ans = p1.add(p2) ; 
        System.out.println(ans) ;
    }
}
