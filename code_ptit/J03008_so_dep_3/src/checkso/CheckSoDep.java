package checkso;

import java.util.Scanner;

public class CheckSoDep {
    private String S ; 
    public void input(Scanner scanner){
        S = scanner.nextLine() ; 
    }
    private boolean kiem_tra(){
        int len = S.length() ; 
        for(int i=0 ; i<= len/2 ; i++){
            if(S.charAt(i) != S.charAt(len-1-i)) return false ; 
            if(S.charAt(i) == '1' || S.charAt(i) == '0'|| S.charAt(i) == '4' || S.charAt(i) == '6' || S.charAt(i) == '8' || S.charAt(i) == '9') return false ; 
        }
        return true ; 
    }

    public String ketQua(){
        if(kiem_tra()) return "YES" ; 
        else return "NO" ; 
    }
}
