package packet1;

public class PhanTich {
    public static void phan_tich(int n)  {
        int count = 0; 
        int i = 2; 
        while(n>1){
            while(n%i == 0){
                count++ ; 
                n/=i ; 
            }
            if(count != 0) {
                System.out.printf("%d(%d) " , i , count) ; 
                count = 0 ; 
            }
            i++ ; 
        }
    }  
}
