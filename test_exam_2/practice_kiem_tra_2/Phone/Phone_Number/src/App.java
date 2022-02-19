import java.util.Scanner;

public class App {
    public static void main(String[] args){
        PhoneBook X = new PhoneBook() ; 

        while(true){
            System.out.println("1.Nhap noi hat");
            System.out.println("2.Nhap quoc te");
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
                case 1: X.them_noi_hat();
                    break ;  
                case 2: X.them_qt();
                    break ;  
                case 3: X.in_ds();
                    break ;  
                case 4: X.sua_noi_hat();
                    break ;  
                case 5:
                    break ;  
                case 6:
                    break ;  
                case 7: 
                    break ;  
                case 8: 
                    break ;  
                case 9:
                    break ;  
                case 10:
                    break ;  
                case 11: 
                    break ;  
                case 12: 
                    break ;  
                case 13: 
                    break ;  
                case 14: 
                    break ;  
                case 15: 
                    break ;  
                case 16: 
                    break ;  
                default:
                    System.out.println("Nhap Lai ! ");
            }
        }
    }
}
