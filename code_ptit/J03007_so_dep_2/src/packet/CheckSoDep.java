package packet;

import java.util.Scanner;

public class CheckSoDep {
    private String S ; 
    public void input(Scanner scanner){
        S = scanner.nextLine() ; 
    }
    private boolean kiem_tra(){
        int len = S.length() ; 
        if(S.charAt(len-1) != '8' || S.charAt(0) != '8') return false ; 
        int sum = 0 ; 
        for(int i=0 ; i<len; i++){
            sum+= ((int)S.charAt(i) -48 ) ; 
        }
        if(sum % 10 !=0 ) return false ; 

        for(int i=0 ; i<= len/2 ; i++){
            if(S.charAt(i) != S.charAt(len-1-i)) return false ; 
        }
        return true ; 
    }

    public String ketQua(){
        if(kiem_tra()) return "YES" ; 
        else return "NO" ; 
    }
    
}
