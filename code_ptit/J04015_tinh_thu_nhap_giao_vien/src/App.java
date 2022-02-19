import java.util.Scanner;

import packet.Giao_Vien;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Giao_Vien T = new Giao_Vien(scanner.nextLine() , scanner.nextLine() , scanner.nextInt());
        System.out.println(T);
    }
}
/* 
HP04
Tran Quoc Huy
1578000
*/