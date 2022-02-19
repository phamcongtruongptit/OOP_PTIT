/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
    import java.util.Scanner;
import model.QLDT;


/**
 *
 * @author Quang Dunh
 */
public class main {
        public static void main(String[] args) {
        int chon;
        Scanner scanner = new Scanner(System.in);
        QLDT qldt = new QLDT();
        while (true) {
            System.out.println("-------------MENU--------------");
            System.out.println("1. Them so dien thoai trong nuoc");
            System.out.println("2. Them so dien thoai quoc te");
            System.out.println("3. Tim so dien thoai theo ma vung");
            System.out.println("4. Liet ke tat cac so dien thoai");
            System.out.println("5. Liet ke so dien thoai trong nuoc");
            System.out.println("6. Liet ke so dien thoai quoc te");
            System.out.println("7. Tong so dien thoai theo tung vung");
            System.out.println("8. Tim kiem dien thoai co duoi la");
            System.out.println("9. Sap xep so dien thoai theo ma vung, neu ma vung giong nhau thi sap theo noi vung");
            System.out.println("0. Thoat");
            System.out.println("Ban chon?");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    qldt.themDienThoaiTrongNuoc();
                    break;
                case 2:
                    qldt.themDienThoaiQuocTe();
                    break;
                case 3:
                    qldt.timDienThoaiTheoMaVung();
                    break;
                case 4:
                    qldt.lietKeCacSoDienThoai();
                    break;

                case 5:
                    qldt.lietKeCacSoDienThoaiTrongNuoc();
                    break;
                case 6:
                    qldt.lietKeCacSoDienThoaiQuocTe();
                    break;
                case 7:
                    qldt.tongSoDienThoaiTheoTungVung();
                    break;
                case 8:
                    qldt.timDienThoaiTheoDuoi();
                    break;
                case 9:
                    qldt.sapXep();
                    break;

                case 0:
                    System.out.println("Bye!!!");
                    return;
                default:
                    System.out.println("Nhap tu 0 den 8");

            }
        }
    }


}
