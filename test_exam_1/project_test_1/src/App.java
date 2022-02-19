import java.util.Scanner;

import packet1.Ma_Tran;
import packet1.So_Thuc;
import packet1.Xu_Ly_Xau;


public class App {
    public static void main(String[] args){
        Xu_Ly_Xau T1 = new Xu_Ly_Xau();
        Ma_Tran T2 = new Ma_Tran();
        So_Thuc T3 = new So_Thuc();
        while(true){
            System.out.println("1.Nhap vao 1 xau");
            System.out.println("2.Kiem tra xem co la Ma SV Khong");
            System.out.println("3.Tach cac tu trong xau");
            System.out.println("4.Dua ra so tu trong xau va so lan xuat hien");
            System.out.println("------------------");
            System.out.println("5.Nhap vao Ma Tran chu nhat A");
            System.out.println("6.Viet ra ma tran chuyen vi cua A");
            System.out.println("7.Dua ra cac hang chi chua so nguyen to");
            System.out.println("------------------");
            System.out.println("8.Nhap vao x va epsilon");
            System.out.println("9.tinh cos(x)");
            System.out.println("------------------");
            System.out.println("0. Thoat Chuong Trinh ! ");
            System.out.println("------------------");
            System.out.print("Moi Ban Chon: ");
            Scanner scanner = new Scanner(System.in)  ; 
            int chon  = Integer.parseInt(scanner.nextLine().trim()) ; 
            switch(chon){
                case 0:
                    System.out.println("BYE BYE!"); 
                    System.exit(0);
                    break ;  
                case 1:  
                    T1.nhap();
                    break ;  
                case 2: 
                    T1.check_MSV();
                    break ;  
                case 3: 
                    T1.Tach_Tu();
                    break ;  
                case 4: 
                    T1.dem_tu_va_xuation();
                    break ;  
                case 5: 
                    T2.nhap();
                    break ;  
                case 6: 
                    T2.chuyen_vi();
                    break ;  
                case 7: 
                    T2.hang_ngto();
                    break ;  
                case 8: 
                    T3.nhap();
                    break ;  
                case 9: 
                    break ;  
                default:
                    System.out.println("Nhap Lai ! ");
            }
        }
    }
}
