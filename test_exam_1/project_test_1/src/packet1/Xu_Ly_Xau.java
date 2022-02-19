package packet1;

import java.util.Scanner;

public class Xu_Ly_Xau {
    private String s ; 
    public void nhap(){
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Nhap vao 1 xau: "); 
        s = scanner.nextLine() ; 
        System.out.println("Xau vua nhap la: " + s);
    }

    public void Tach_Tu(){
        nhap();
        String []M = s.split("\\s+") ; 
        System.out.println("Cac tu trong xau: " );
        for (String string : M) {
            System.out.println(string);
        }
    }

    public void dem_tu_va_xuation(){
        nhap();
        s = s.trim() ;
        String []M = s.split("\\s+" ) ; // đúng
         System.out.println("So tu trong xau: " +  M.length);
    }
    

    public void check_MSV(){
        String res = "B\\d{2}[A-Z]{4}\\d{3}"; 
        Scanner scanner = new Scanner(System.in) ; 
        System.out.print("Nhap Ma SV: ");
        String check = scanner.next() ; 
        check = check.toUpperCase() ; 
        if(!check.matches(res)) {
            System.out.println("KHONG DUNG MSV !");
        }
        else {
            System.out.println("DUNG Msv");
        }
    }

}
