package packet1;
import java.util.Scanner;
public class UocSoBoiSo {
    private long a , b ;
    
    public void input(Scanner scanner){
        long i = scanner.nextLong() ;
        long j  = scanner.nextLong() ; 
        a = i ;
        b = j ;
    } 

    public long UCLN(long i  , long j){
        if (i == 0 || j == 0){
            return i + j;
        }
        while(i != j){
            if(i>j) i-=j ; 
            else j-=i ; 
        }
        return i ; 
    }

    public  long BCNN(long i , long j){
        long TMP = i*j ;
        return TMP / UCLN(i , j ) ; 
    }

    public  void output(){
        System.out.println(BCNN(a,b ) + " " + UCLN(a,b));
    }
}
