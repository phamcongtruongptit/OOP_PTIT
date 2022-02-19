/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Scanner;
import model.QLTT;

public class menu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        QLTT q = new QLTT();
        while (true) {
            System.out.println("MENU");
            System.out.println("0. Thoat");
            System.out.println("1. Nhap xe may");
            System.out.println("2. Nhap o to");
            System.out.println("3. Nhap xe tai");
            System.out.println("4. In danh sach PTGT");
            System.out.println("5. Sua gia ban");
            System.out.println("6. Xoa");
            System.out.println("7. Tim kiem (theo ma)");
            System.out.println("8. Tim kiem (theo hang san xuat)");
            System.out.println("9. Tim kiem (tu nam ... den nam ...");
            System.out.println("10. Sap xep (theo gia ban)");
            //System.out.println();
            
            System.out.print("Nhap lua chon: ");
            int key = Integer.parseInt(sc.nextLine());
            switch (key) {
                case 0:
                    System.exit(0);
                    break;
                case 1: 
                    System.out.println("Nhap thong tin xe may: ");
                    q.nhap_xeMay();
                    break;  
                case 2: 
                    System.out.println("Nhap thong tin o to: ");
                    q.nhap_oto();
                    break;
                case 3: 
                    System.out.println("Nhap thong tin xe tai: ");
                    q.nhap_xeTai();
                    break;
                case 4:
                    System.out.println("Danh sach PTGT ");
                    q.inDS();
                    break;
                case 5:
                    System.out.println("Sua gia ban theo ma ");
                    System.out.print("Nhap ma:  ");
                    String ma = sc.nextLine();
                    q.editGiaBan(ma);
                    break;
                case 6:
                    System.out.println("Xoa phuong tien theo ma ");
                    System.out.print("Nhap ma: ");
                    String ma1 = sc.nextLine();
                    q.xoa(ma1);
                    break;
                case 7:
                    System.out.println("Tim kiem theo ma ");
                    System.out.print("Nhap ma: ");
                    String ma2 = sc.nextLine();
                    q.timKiemTheoMa(ma2);
                    break;
                case 8:
                    System.out.println("Tim kiem theo hang san xuat ");
                    System.out.print("Nhap ma: ");
                    String hangSX = sc.nextLine();
                    q.timKiemTheoHangSX(hangSX);
                    break;
                case 9:
                    System.out.println("Tim kiem theo khoang nam san xuat ");
                    System.out.print("Tu ");
                    int nam1 = Integer.parseInt(sc.nextLine());
                    System.out.print("Den ");
                    int nam2 = Integer.parseInt(sc.nextLine());
                    q.timKiemKhoang(nam1, nam2);
                    break;
                case 10:
                    System.out.println("Sap xep theo gia ");
                    q.sapxep();
                    break;
                default:System.out.println("Nhap 0 >> 10");
                    break;
            }
        }
    }

}
