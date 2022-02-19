package packer1;

import java.util.Scanner;

public class Chuan_Hoa_2 {
    private String s  ; 
    
    public void input(Scanner scanner){
        s  = scanner.nextLine();
    }

    private String chuan_hoa_1(String s){
        String ans = "" ; 
        s = s.trim();
        s = s.replaceAll("\\s+" , " ") ; 
        s = s.toLowerCase() ; 
        String []M = s.split(" ") ; 
        for(int i = 0 ; i < M.length ; i++){
            ans += Character.toUpperCase(M[i].charAt(0)) ; 
            if(M[i].length()> 1){
                ans+= M[i].substring(1) + " " ; 
            }
            else {
                ans+=" " ; 
            }
        }
        return ans.trim() ;
    }

    public  String chuan_hoa_2(){
        s = chuan_hoa_1(s) ; 
        String ans = s.substring(s.indexOf(" ")+1) ; 
        ans+=", " ; 
        ans+= s.substring(0, s.indexOf(" ")).toUpperCase() ; 
        return ans ; 
    }
}
