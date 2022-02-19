package dienthoai;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        DSDT ds=null;
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. Nhap So luong loai dien thoai");
            System.out.println("2. Nhap 1 dien thoai");
            System.out.println("3. Hien thi ds dien thoai");
            
            System.out.println("4. Sap xep theo ma");
            System.out.println("5. lua chon 5");
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->4):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:ds=new DSDT();
                       break;
                case 2:ds.nhap();
                       break;
                case 3:ds.viet();
                       break;
                case 4:ds.sapxepTheoMa();
                       break;       
                default:System.out.println("chi chon 0->4");
                      break; 
            }
        }
        
    }
    
}
