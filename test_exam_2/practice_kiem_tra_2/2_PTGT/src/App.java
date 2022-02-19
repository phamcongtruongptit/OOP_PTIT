import java.util.Scanner;

import packet1.QuanLyGiaoThong;

public class App {
    public static void main(String[] args){
        QuanLyGiaoThong q = new QuanLyGiaoThong();

        while(true){
            System.out.println("1.Nhap Oto");
            System.out.println("2.Nhap Xe May");
            System.out.println("3.Viet Danh Sach: ");
            System.out.println("4.Xoa");
            System.out.println("5.Sua");
            System.out.println("6.Sua Xe May");
            System.out.println("------------------");
            System.out.println("7.TIm theo MA");
            System.out.println("8.Tim theo hang");
            System.out.println("9.TIm theo mau");
            System.out.println("10.Tim theo nam");
            System.out.println("11.Tim theo cho");
            System.out.println("------------------");
            System.out.println("12:Sap xep theo ma");
            System.out.println("13:Sap xep theo hang");
            System.out.println("14:Sap xep theo nam");
            System.out.println("15:Sap xep theo gia giam dam");
            System.out.println("16:Thong ke theo mau");
            System.out.println("------------------");
            System.out.println("0. Thoat Chuong Trinh ! ");
            System.out.println("------------------");
            System.out.print("Moi Ban Chon: ");
            Scanner scanner = new Scanner(System.in)  ; 
            int chon  = Integer.parseInt(scanner.nextLine().trim()) ; 
            switch(chon){
                case 0: System.out.println("BYE!");
                    System.exit(0);
                    break ;  
                case 1: q.nhapOto(); 
                    break ;  
                case 2: q.nhapXeMay();
                    break ;  
                case 3: q.vietDS();
                    break ;  
                case 4: q.xoa();
                    break ;  
                case 5: q.sua();
                    break ;  
                case 6: q.suaXeMay();
                    break ;  
                case 7: q.timTheoMa();
                    break ;  
                case 8: q.timTheoHang();
                    break ;  
                case 9: q.timTheoMau();
                    break ;  
                case 10: q.timTheoNam();
                    break ;  
                case 11: q.tim_theo_cho();
                    break ;  
                case 12: q.sapxepTheoMa();
                    break ;  
                case 13: q.sapxepTheoHang();
                    break ;  
                case 14: q.sapxepTheoNam();
                    break ;  
                case 15: q.sapxepGiaGiamDan();
                    break ;  
                case 16: q.thongke();
                    break ;  
                default:
                    System.out.println("Nhap Lai ! ");
            }
        }
    }
}
