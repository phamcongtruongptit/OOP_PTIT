package packet1;
public class PhanSo {
    private long tu_so , mau_so ; 
    public PhanSo(long tu_so , long mau_so){
        this.tu_so = tu_so;
        this.mau_so = mau_so;
    }
    private long ucln(long a , long b){
        a = Math.abs(a) ; 
        b = Math.abs(b) ;
        while(b!=0){
            long t = a%b ; 
            a = b ; 
            b = t ; 
        }
        return a  ; 
    }
    private void rut_gon(){
        long x = ucln(this.tu_so , this.mau_so);
        this.tu_so /= x ; 
        this.mau_so /= x ;
    }
    private static PhanSo tinh_tong(PhanSo a , PhanSo b){
        PhanSo ans  = new PhanSo (a.tu_so * b.mau_so + a.mau_so*b.tu_so  ,a.mau_so * b.mau_so ) ; 
        ans.rut_gon(); 
        return ans  ; 
    }
    public static PhanSo tinhC(PhanSo a , PhanSo b){
        long x = tinh_tong(a , b).tu_so * tinh_tong(a , b).tu_so  ; 
        long y = tinh_tong(a , b).mau_so *  tinh_tong(a , b).mau_so  ; 
        PhanSo ans = new PhanSo(x ,y) ; 
        ans.rut_gon(); 
        return ans ; 
    }
    public static PhanSo tinhD(PhanSo a , PhanSo b , PhanSo c) {
        long x  = a.tu_so * b.tu_so * c.tu_so  ; 
        long y = a.mau_so * b.mau_so * c.mau_so ; 
        PhanSo ans = new PhanSo(x ,y) ; 
        ans.rut_gon();
        return ans ; 
    }


    public String toString() {
        return tu_so + "/" + mau_so ; 
    }
    
}

