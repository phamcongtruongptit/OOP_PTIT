import java.util.Scanner;

import packet1.Nhan_Vien;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String gioi_tinh = scanner.nextLine();
        String ngay_sinh = scanner.nextLine();
        String dia_chi = scanner.nextLine();
        String ma_so_thue = scanner.nextLine();
        String Ngay = scanner.nextLine();
        Nhan_Vien T = new Nhan_Vien(name, gioi_tinh , ngay_sinh , dia_chi , ma_so_thue , Ngay) ; 
        System.out.println(T);
    }
}
