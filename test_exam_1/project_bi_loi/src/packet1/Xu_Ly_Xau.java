package packet1;

import java.util.Scanner;

public class Xu_Ly_Xau {
    private String s  ; 

    public void input(){
        Scanner scanner = new Scanner(System.in) ; 
        System.out.print("Nhap vao mot doan van ban: ");
        s = scanner.nextLine() ;
        System.out.print("Doan van ban vua nhap la: " + s);
        System.out.println();
    }

    public void dua_ra_so_cau(){
        s = s.trim() ;
        String []M = s.split("[\\.\\?\\!]" ) ; // đúng
        for (String string : M) {
            System.out.println(string);
        }
         System.out.println("So cau trong doan van: " +  M.length);

        //     int ans = 0 ; 
        //     for(int i =  0 ; i<s.length() ; i++){
        //         if(s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!') ans++ ; 
        //     }
        // System.out.println("So cau trong doan van: " +  ans);
    }

    public void chuan_hoa(){
        System.out.println("Xau TRUOC khi chuan hoa: "  + s );
        s = s.trim() ;
        s = s.replaceAll("\\s+", " "); 
        s = s.replaceAll("\\s+\\?\\s*", "? "); 
        s = s.replaceAll("\\s+\\.\\s*", ". "); 
        s = s.replaceAll("\\s+\\!\\s*", "! "); 
        System.out.println("Xau SAU khi chuan hoa: "  + s );
    }
    
}
