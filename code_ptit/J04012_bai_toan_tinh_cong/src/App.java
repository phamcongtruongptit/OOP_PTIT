import java.util.Scanner;

import packet1.Nhan_Vien;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Nhan_Vien t = new Nhan_Vien(scanner.nextLine() , scanner.nextDouble() , scanner.nextDouble() , scanner.next());
        System.out.println( t);

    }
}
/* 
Bui Thi Trang
45000
23
PGD
*/