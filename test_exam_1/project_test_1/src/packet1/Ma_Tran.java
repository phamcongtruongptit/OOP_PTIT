package packet1;

import java.util.Scanner;

public class Ma_Tran {
    private int M[][] = new int[1005][1005] ; 
    private int hang , cot ; 
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Hang: ");
        hang = scanner.nextInt() ; 
        System.out.print("Nhap cot: "); 
        cot = scanner.nextInt() ;
        System.out.println("Nhap cac gia tri cua ma tran: ");
        for(int  i =  0 ; i< hang ; i++){
            for(int  j = 0 ; j<cot ; j++){
                M[i][j] = scanner.nextInt() ; 
            }
        }
        System.out.println("Ma tran vua nhap la: ");
        for(int  i =  0 ; i< hang ; i++){
            for(int  j = 0 ; j<cot ; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public void chuyen_vi(){
        System.out.println("Ma tran chuyen vi: ");
        for(int i = 0 ; i<cot ; i++){
            for(int j = 0 ; j<hang ; j++){
                System.out.print(M[j][i] + " ");
            }
            System.out.println();
        }
    }

    // private boolean check_nto(int n){
    //     if(n<=1) return false ; 
    //     for(int  i = 2 ; i<= Math.sqrt(n) ; i++){
    //         if(n%i == 0) return false ; 
    //     }
    //     return true ; 
    // } 

    // public void hang_ngto(){
    //     int check  = 0 ; 
    //     for(int  i =  0 ; i< hang ; i++){
    //         int co = 1 ; 
    //         for(int  j = 0 ; j<cot ; j++){
    //             if(check_nto(M[i][j]) == false ) {
    //                 co = 0 ; break ; 
    //             }
    //         }
    //         if(co == 1){
    //             check = 1 ; 
    //             System.out.print("Hang " + i +": ");
    //             for(int k = 0 ; k<cot ; k++){
    //                 System.out.print(M[i][k] + " ");
    //             }
    //             System.out.println();
    //         }
    //     }
    //     if(check == 0 ) System.out.println("KHONG CO !!!!");
    // }
    
}
