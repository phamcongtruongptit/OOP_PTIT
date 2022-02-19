package run;

import java.util.Scanner;
import model.QLGD;

/**
 *
 * @author CuongPham
 */
public class Menu {

    public static void main(String[] args) {
        int chon;
        QLGD qlgd = new QLGD();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----------------MENU----------------");
            System.out.println("1. Them giao dich vang");
            System.out.println("2. Them giao dich tien te");
            System.out.println("3. Them giao dich dat");
            System.out.println("4. Hien thi danh sach giao dich");
            System.out.println("5. Hien thi danh sach giao dich vang");
            System.out.println("6. Hien thi danh sach giao dich tien te");
            System.out.println("7. Hien thi danh sach giao dich dat");
            System.out.println("8. Sua");
            System.out.println("9. Xoa");
            System.out.println("10. Tong so giao dich");
            System.out.println("11. Danh sach giao dich theo ngay");
            System.out.println("12. Danh sach giao dich tu nam den nam");
            System.out.println("0. Thoat");
            System.out.println("Ban chon?");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    qlgd.themGiaoDichVang();
                    break;
                case 2:
                    qlgd.themGiaoDichTienTe();
                    break;
                case 3:
                    qlgd.themGiaoDichDat();
                    break;
                case 4:
                    qlgd.dSGD();
                    break;
                case 5:
                    qlgd.dSGDVang();
                    break;
                case 6:
                    qlgd.dSGDTienTe();
                    break;
                case 7:
                    qlgd.dSGDDat();
                    break;
                case 8:
                    qlgd.sua();
                    break;
                case 9:
                    qlgd.xoa();
                    break;
                case 10:
                    qlgd.tongSoGiaoDich();
                    break;
                case 11:
                    qlgd.dSGiaoDichCoNgay();
                    break;
                case 12:
                    qlgd.dSGiaoDichTuNamDenNam();
                    break;
                case 0:
                    System.out.println("Bye");
                    return;
                default:
                    System.out.println("Nhap tu 0 den 14");
            }

        }
    }

}
