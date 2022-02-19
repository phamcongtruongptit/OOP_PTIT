import java.util.Scanner;

public class App {
    private static boolean cauhinhccuoi = false   ; 
    private static int []M = new int[20] ; 
    private static int n , k ; 

    private static void FirstCauHinh(){ 
        for(int  i =1 ; i<= k ; i++){ 
            M[i] = i ; 
        }
    }

    private static void output() { 
        for(int  i =1 ; i<=k ; i++){ 
            System.out.print(M[i]+ " ") ; 
        }
        System.out.println();
    }

    private static void sinhcauhinh(){ 
        int i = k ; 
        while(M[i] == n-k+i && i>0 ) {
            i--  ; 
        }
        if(i<1) {
            cauhinhccuoi = true ; return ; 
        }
        M[i]+=1 ; 
        for(int  j = i+1 ; j<=k ; j++){
            M[j] = M[i] + j - i ; 
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt() ;
        k = scanner.nextInt() ;
        int count  = 0;
        FirstCauHinh() ; 
        while(cauhinhccuoi == false){
            count++ ; 
            output();
            sinhcauhinh() ; 
        }
        System.out.printf("Tong cong co %d to hop" , count);
    }
}
