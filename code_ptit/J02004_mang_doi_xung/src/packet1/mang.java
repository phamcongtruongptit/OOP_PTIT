package packet1;

import java.util.Scanner;

public class mang {

    public int M[] = new int[1005] ;
    public int n ;  


    public void input(Scanner scanner){
        n = scanner.nextInt() ; 
        for(int i=1 ;i<=n ; i++){
            M[i] = scanner.nextInt(); 
        }
    }

    public boolean check(){
        for(int i = 1 ; i<= n/2 ; i++){
            if(M[i] != M[n-i+1]) return false ;
        }
        return true ;
    }

}
