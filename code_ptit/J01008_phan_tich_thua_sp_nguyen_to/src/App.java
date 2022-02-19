import java.util.Scanner;

import packet1.PhanTich;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int test = 1; 
        while(test <= t) {
            int n = scanner.nextInt();
            System.out.printf("Test %d: " , test);
            PhanTich.phan_tich(n);
            System.out.println();
            test++ ; 
        }
    }
}
