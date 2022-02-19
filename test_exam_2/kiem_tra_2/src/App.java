import java.util.Scanner;

import packet1.QLGD;

public class App {
    public static void main(String[] args){
        QLGD q = new QLGD();
        while(true){
            System.out.println("1.Nhap Giao Dichj Vang:");
            System.out.println("2.Nhap giao dich tien");
            System.out.println("3.VietDS");
            System.out.println("4.sua Tien: ");
            System.out.println("5.Sap xep giao dich vang theo tien");
            System.out.println("6.");
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
                case 1: q.nhapGDVang();
                    break ;  
                case 2: q.nhapGDTien();
                    break ;  
                case 3: q.vietDS();
                    break ;  
                case 4: q.suaGDTien();
                    break ;  
                case 5: q.sap_xep_vang_theo_tien();
                    break ;  
                case 6: 
                    break ;  
                case 7: 
                    break ;  
                case 8: 

                default:
                    System.out.println("Nhap Lai ! ");
            }
        }
    }
}
