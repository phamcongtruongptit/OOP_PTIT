import java.util.Scanner;

import packet1.Phan_So;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        Phan_So T = new Phan_So(a , b) ;
        System.out.println(T);
    }
}
