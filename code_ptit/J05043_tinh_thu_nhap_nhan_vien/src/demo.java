import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  n = scanner.nextDouble() ;
        System.out.println(Math.round(n*1000.0)/1000.0);
    }
    
}
