import java.util.Scanner;

import packet1.Da_Thuc;
import packet1.Day_So_Thuc;
import packet1.Xu_Ly_Xau;

public class MainClass {
    public static void main(String[] args){
        Day_So_Thuc T = new Day_So_Thuc() ; 
        Xu_Ly_Xau T1 = new Xu_Ly_Xau();
        Da_Thuc T2 = new Da_Thuc() ;
        while(true){
            System.out.println("1.Nhap Vao Day So thuc");
            System.out.println("2.Viet Ra Phan Tu Nho Nhat Cua Day So");
            System.out.println("3.Sap Xep Va Dua Ra Day So Giam Dan");
            System.out.println("------------------");
            System.out.println("4.Nhap Vao 1 Doan Van Ban");
            System.out.println("5.Dua Ra So Cau");
            System.out.println("6.Chuan Hoa Cau");
            System.out.println("------------------");
            System.out.println("7.Nhap Vao Mot Da Thuc P(x)");
            System.out.println("8.Tinh P(x) + Q(x)");
            System.out.println("9.Tinh P(x)/Q(x) Va Da Thuc Du");
            System.out.println("------------------");
            System.out.println("0. Thoat Chuong Trinh ! ");
            System.out.println("------------------");
            System.out.print("Moi Ban Chon: ");
            Scanner scanner = new Scanner(System.in)  ; 
            int chon  = Integer.parseInt(scanner.nextLine().trim()) ; 
            switch(chon){
                case 0:
                    System.out.println("BYE!"); 
                    System.exit(0);
                    break ;  
                case 1:  
                    T.input() ; 
                    break ;  
                case 2: 
                    T.so_nho_nhat();
                    break ;  
                case 3: 
                    T.sap_xep();
                    break ;  
                case 4: 
                    T1.input(); //   Hom nay troi dep lam  .  Di an kem thoi nao   ? di chua ban! di chu.  phai di . 
                    break ;  
                case 5: 
                    T1.dua_ra_so_cau();
                    break ;  
                case 6: 
                    T1.chuan_hoa();
                    break ;  
                case 7: 
                    T2.nhap();
                    break ;  
                case 8: 
                    Da_Thuc X = new Da_Thuc() ;
                    System.out.println("Nhap Da Thuc Thu 2: ");
                    X.nhap();
                    System.out.print("Tong cua 2 da thuc: ");
                    T2.Tong_da_thu(X).output();
                    break ;  
                case 9: 
                    break ;  
                default:
                    System.out.println("Nhap Lai ! ");
            }
        }
    }
}
