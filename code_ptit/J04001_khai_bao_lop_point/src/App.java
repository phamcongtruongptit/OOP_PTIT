import java.util.Scanner;

import pack.Point;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        while(t-->0){
            double a ,b , c ,d ; 
            a = scanner.nextDouble() ;
            b = scanner.nextDouble() ;
            c = scanner.nextDouble() ;
            d = scanner.nextDouble() ;
            Point T1 = new Point(a , b);
            Point T2 = new Point(c , d) ;
            System.out.printf("%.4f\n" , Point.distance(T1, T2));
        }
    }
}
