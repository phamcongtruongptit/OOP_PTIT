import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so num: ");
        int  n = scanner.nextInt() ; 
        Thread1 t1 = new Thread1(n) ; 
        Thread2 t2 = new Thread2(n)  ; 
        t1.start();
        t2.start();
    }
}
