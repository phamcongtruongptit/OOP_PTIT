/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.util.Scanner;

import model.QLGD;

public class Menu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        QLGD q =  new QLGD();
        while (true) {
            System.out.println("MENU");
            System.out.println("0. Thoat");
            System.out.println("1. Nhap Giang vien co huu");
            System.out.println("2. Nhap Giang vien thinh giang");
            System.out.println("3. Danh sach Giang vien");
            System.out.println("4. Sap xep theo tien linh");
            System.out.println("5. Xoa Giang vien theo ma");
            System.out.println("6. Tong so tien phai tra theo hoc vi");
            System.out.print("Nhap lua chon: ");
            int key = Integer.parseInt(sc.nextLine());
            switch (key) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    q.nhapGVCoHuu();
                    break;
                case 2:
                    q.nhapGVTGiang();
                    break;
                case 3:
                    System.out.println("Danh sach giang vien");
                    q.inDS();
                    break;
                case 4: 
                    q.sapxep();
                    break;
                case 5:
                    System.out.println("Xoa giang vien");
                    q.xoa();
                    break;
                case 6:
                    q.sumTienByHocVi();
                    break;
                default: System.out.println("Nhap 0 >> 6");
                    break;
            }
        }
    }

}
