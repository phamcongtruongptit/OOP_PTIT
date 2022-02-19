
package ktra1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        SoNguyen sn=null;
        XuLyXau xl=null;
        MaTranVuong mt=null;
        //while switch
        while(true){
            System.out.println("---------MENU-------");
            System.out.println("1. Nhap so nguyen n");
            System.out.println("2. Tong");
            System.out.println("3. Day nguyen to");
            
            System.out.println("4. Nhap xau");
            System.out.println("5. Do dai");
            System.out.println("6. So cau");
            
            System.out.println("7. Nhap ma tran");
            System.out.println("8. Tong hang");
            
            System.out.println("0. Thoat");
            System.out.println("--------------------");
            System.out.print("Lua chon (0->4):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 0:System.out.println("bye!!!");
                       System.exit(0);//safe exit
                    //break;
                case 1:sn=new SoNguyen();
                       
                    break;
                case 2:sn.tinhTong();
                    break;
                case 3:sn.daySoNT();
                    break;
                case 4:xl=new XuLyXau();
                    break;
                case 5:xl.dodai();
                    break;
                case 6:xl.soCau();
                    break;
                case 7:mt=new MaTranVuong();
                    break;
                case 8:mt.viet();
                    mt.tongHang();
                    break;    
                default:
                    System.out.println("chi chon 0->4");
                    //break;
                            
            }
            
        }
        
        
    }
}
