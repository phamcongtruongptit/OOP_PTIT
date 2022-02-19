
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        DaySoThuc d=new DaySoThuc();
        XuLyXau x=null;
        HaiMTVuong mt=new HaiMTVuong();
        while(true){
            System.out.println("---------MENU-------");
            System.out.println("1. nhap day so");
            System.out.println("2. Tong");
            System.out.println("3. day sap xep");
            
            System.out.println("4. Nhap vao 1 xau");
            System.out.println("5. do dai");
            System.out.println("6. Cac tu");
            
            System.out.println("7. nhap 2 mt");
            System.out.println("8. Tong");
            
            
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
                case 1:d.nhapDS();
                    break;
                case 2:d.tongDS();
                    break;
                case 3:d.sapxep();
                    break;
                case 4:x=new XuLyXau();
                    break;
                case 5:x.dodai();
                    break;
                case 6:x.tachTu();
                    break;
                case 7:mt.setA();
                       mt.setB();
                       mt.vietA();
                       mt.vietB();
                    break;
                case 8:mt.tong();
                    break;    
                default:
                    System.out.println("chi chon 0->4");
                    //break;
                            
            }
            
        }
        
    }
    
}
