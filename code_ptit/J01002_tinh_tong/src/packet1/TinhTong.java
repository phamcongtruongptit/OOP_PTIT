package packet1;

public class TinhTong {
    private long n ; 
    public void setN(int n){
        this.n = n ;
    }
    private long tinhTong(long n){
        return n*(n+1)/2 ; 
    }
    public long getKq(){
        return tinhTong(this.n) ; 
    }
    
}