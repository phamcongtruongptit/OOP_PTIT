package ktra2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLPTGT q=new QLPTGT();
        
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. nhap Oto ");
            System.out.println("2. Nhap xe may");
            System.out.println("3. Viet ra ds");
            
            System.out.println("4. Xoa");
            System.out.println("5. Tim theo ma");
            System.out.println("6. tim theo hang");
            
            System.out.println("7. Tim theo pt dat do");
            System.out.println("8. tim theo nam");
            
            System.out.println("9. sua");
            
            System.out.println("10. Sap xep theo ma");
            System.out.println("11. Sap xep theo nam giam dan");
            System.out.println("12. Sap xep theo gia tang dan");
            System.out.println("13. Sap xep oto theo so cho va mau");
            System.out.println("14. Tim theo ma");
            
            System.out.println("15. Dem theo nam");
            System.out.println("16. Dem theo Mau");
            System.out.println("17. sum theo Mau");
            System.out.println("18. gia cao nhat");
            System.out.println("19. Max theo mau");
            
            
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->10):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:Oto o=new Oto();
                       o.nhap();
                       q.nhap(o);
                       break;
                case 2:XeMay x=new XeMay();
                         x.nhap();
                         q.nhap(x);
                       break;
                case 3:q.vietDS();
                       break;
                case 4:q.xoa();
                       break; 
                case 5:q.timThemMa();
                       break; 
                case 6:q.timTheoHang();
                break;
                case 7:q.timPTDatDo();
                break;
                case 8:q.timTheoNam();
                break;
                case 9:q.sua();
                break;
                case 10:q.sapxepTheoMa();
                        q.vietDS();
                    break;
                case 11:q.sapxepTheoNam();
                        q.vietDS();
                    break;
                case 12:q.sapxepTheoGia();
                        q.vietDS();
                    break;
                case 13:q.sapxepTheoSCvaMau(); 
                    break;    
                case 14:q.tim("HN999");
                   break;
                case 15:q.countTheoNam();
                   break; 
                case 16:q.countTheoMau();
                   break; 
                   case 17:q.sumTheoMau();
                   break; 
                   case 18:q.maxGia();
                   break; 
                   case 19:q.maxByGiaGroupbyMau();
                   break; 
                default:System.out.println("chi chon 0->9");
                      break; 
            }
        }
        
    }
    
}
