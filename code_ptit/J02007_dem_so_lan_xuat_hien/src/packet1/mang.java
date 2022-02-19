package packet1;

import java.util.Scanner;

public class mang {
    private int  n; 
    private int tmp[] = new int[10005];
    private int M[] = new int[105] ; 

    public void input(Scanner scanner){
        n  = scanner.nextInt() ; 
        for(int i = 1 ; i<10005 ; i++) tmp[i] = 0 ; 
        for(int i=1 ; i<=n ; i++) {
            M[i] = scanner.nextInt() ; 
        }
    }

    public void output(){
        for(int i=1 ; i<=n ; i++){
            if(tmp[M[i]] == 0){
                tmp[M[i]] = 1  ; 
                int count  = 0 ; 
                for(int j = 1; j<=n ; j++){
                    if(M[j] == M[i]) count ++ ;  
                }
                System.out.printf("%d xuat hien %d lan\n" , M[i], count);
            }
        }
    }

}
