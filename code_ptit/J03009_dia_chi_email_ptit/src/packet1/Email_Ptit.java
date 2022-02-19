package packet1;

import java.util.Scanner;

public class Email_Ptit {
    private String s ; 

    public void input(Scanner scanner){
        s = scanner.nextLine();
    }

    private String chuan_hoa_1(String s){
        s = s.trim(); 
        s = s.toLowerCase() ; 
        s = s.replaceAll("\\s+" , " ") ; 
        return s ; 
    }

    public String dia_chi_email(){
        s = chuan_hoa_1(s) ; 
        String []M = s.split(" ") ; 
        String ans = "" ; 
        ans+= M[M.length - 1] ; 
        for(int i = 0 ; i<M.length -1 ; i++){
            ans+= M[i].charAt(0) ;  
        }
        return ans ; 
    }
    
}
