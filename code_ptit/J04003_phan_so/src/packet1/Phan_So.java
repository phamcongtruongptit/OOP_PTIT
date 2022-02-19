package packet1;

public class Phan_So {
    private long tu_so , mau_so ; 
    public Phan_So(long tu_so, long mau_so){
        this.tu_so = tu_so ; 
        this.mau_so = mau_so ; 
    }

    private long gcd( long a, long b ) {
        long tmp;
        while(b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public String toString(){
        long tmp = gcd(tu_so, mau_so) ; 
        tu_so /= tmp ;
        mau_so /=  tmp ;
        return tu_so + "/" + mau_so ; 
    }
    
}
