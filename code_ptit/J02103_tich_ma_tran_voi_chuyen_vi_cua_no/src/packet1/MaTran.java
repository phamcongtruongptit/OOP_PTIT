package packet1;

import java.util.Scanner;

public class MaTran {
    private int hang , cot ;  
     private int M[][] = new int[1005][1005] ; 
     private int C[][] = new int[1005][1005] ; 

    public void input(Scanner scanner){
        hang  = scanner.nextInt() ; 
        cot = scanner.nextInt() ; 
        for(int i =1 ; i<=hang ; i++){
            for( int j=1 ; j<= cot ; j++) {
                M[i][j] = scanner.nextInt() ; 
                C[j][i] = M[i][j] ; 
            }
        }
    }

    public void tinh_tich(){
    
        for(int i =1 ; i<= hang ; i++){

            for(int j=1 ; j<= hang ; j++) {
                int sum  = 0 ; 
                for(int  k =1 ; k<= cot ; k++) {
                    int check = M[i][k]  * C[k][j] ; 
                    sum +=check ; 
                }
                System.out.print(sum+ " ");
            }
            System.out.println();
        }
    }

    
}
