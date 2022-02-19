package packet1;

public class Bcnn {
    private long UCLN(long a , long b){
        long tmp ; 
        while(b!=0){
            tmp = a%b ; 
            a = b ;
            b = tmp ; 
        }
        return a ; 
    }
    private long BCNN(long a , long b){
        return (a*b) / UCLN(a,b) ; 
    }
    public long BCNNcuaN(int n){
        long tmp = 1 ; 
        for(int i=1; i<=n-1 ; i++){
            tmp = BCNN(tmp , i+1 ) ; 
        }
        return tmp ; 
    }
}
