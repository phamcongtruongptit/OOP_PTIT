package packet1;

public class NguyenTo{
    public static boolean checknto(int n){
        if(n<2) return false ; 
        for(int i = 2 ; i<=Math.sqrt(n) ; i++){
            if(n%i == 0) return false ; 
        }
        return true ; 
    }
    
    
}

