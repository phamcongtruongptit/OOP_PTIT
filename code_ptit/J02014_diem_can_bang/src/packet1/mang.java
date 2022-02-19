package packet1;

import java.util.Scanner;

public class mang {
    private int n ; 
    private int M[] = new int[100002] ; 

    public void input(Scanner scanner){
        n  = scanner.nextInt() ; 
        for(int i =1 ; i <=n ; i++){
            M[i] = scanner.nextInt() ; 
        }
    }

    private int sum(){
        int sum = 0 ; 
        for(int i = 1; i<=n ; i++) {
            sum+=M[i] ; 
        }
        return sum ;
    }

    public int diemcanbang(){
        int sum = sum() ; 
        int check = 0 ; 
        for(int i=2 ; i<=n-1 ; i++){
            check+=M[i-1] ; 
            if(check == (sum - check - M[i]) ) return i ; 
        }
        return -1 ; 
    }
}
