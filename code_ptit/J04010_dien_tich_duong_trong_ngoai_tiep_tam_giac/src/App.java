import java.util.Scanner;

import packet1.Point;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        while(t-->0){
            double a , b ,c, d , e , f ; 
            a = scanner.nextDouble() ;
            b = scanner.nextDouble() ; 
            c = scanner.nextDouble() ;
            d = scanner.nextDouble() ;
            e = scanner.nextDouble() ;
            f = scanner.nextDouble() ; 
            Point t1 = new Point(a ,b ) ; 
            Point t2 = new Point(c , d) ; 
            Point t3 = new Point(e ,f) ; 
            double x = Point.distance(t1 ,t2 );
            double y = Point.distance(t1 ,t3) ; 
            double z = Point.distance(t2 ,t3) ; 
            if(x == 0 || y==0 ||z == 0|| (x+y)<=z||(y+z)<=x || (x+z)<=y ){
                System.out.println("INVALID");
            } else {
                double S = 0.25 * Math.sqrt((x+y+z)*(x+y-z)*(y+z-x)*(x+z-y)) ; 
                double ans = (x*y*z) / (S*4) ; 
                System.out.printf("%.3f\n" , Math.PI * ans*ans);
            }
            
        }
}
}
