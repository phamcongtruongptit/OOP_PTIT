package packet1;

import java.util.Scanner;

public class KiemTraSoDep1 {
    private String S  ; 
    
    public void input(Scanner scanner){
        S  = scanner.nextLine()  ;  
    }

    private boolean kiem_tra(){
        int len  = S.length();
        for(int i = 0 ; i<= len/2; i++){
            if( S.charAt(i) != S.charAt(len - i -1 ) ) return false ;

            if(S.charAt(i) == '1' || S.charAt(i) == '3' || S.charAt(i) == '5' || S.charAt(i) == '7'|| S.charAt(i) == '9' || S.charAt(len - i -1) == '1' || S.charAt(len - i -1) == '3' || S.charAt(len - i -1) == '5' || S.charAt(len - i -1) == '7'|| S.charAt(len - i -1) == '9') {
                return false ; 
            }
        }
        return true ;
    }

    public String KQ(){
        if(kiem_tra() ) return "YES" ; 
        else return "NO" ; 
    }
}
