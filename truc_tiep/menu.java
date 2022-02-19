import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        while(true){
            System.out.println("Lua chon 1: ");
            System.out.println("Lua chon 2: ");
            System.out.println("Lua chon 3: ");
            System.out.println("Lua chon 4: ");
            System.out.println("0: Thoat ! ");
            System.out.println("Moi Ban Chon: ");
            int chon;
            Scanner scanner = new Scanner(System.in)  ; 
            chon  = scanner.nextInt() ;
            switch( chon ){
                case 0:
                    System.out.println("BYE!"); 
                    System.exit(0);
                    break ;  
                case 1: System.out.println("Chon 1: ");
                    break ;  
                case 2: System.out.println("Chon 2: ");
                    break ;  
                case 3: System.out.println("Chon 3: ");
                    break ;  
                case 4: System.out.println("Chon 4: ");
                    break ;  
                default: 
                    System.out.println("Nhap Lai: ");
            }
        }
    }
}
