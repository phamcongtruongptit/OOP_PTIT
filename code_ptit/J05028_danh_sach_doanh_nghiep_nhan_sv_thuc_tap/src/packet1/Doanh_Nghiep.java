package packet1;

public class Doanh_Nghiep implements Comparable<Doanh_Nghiep> {
    private String ma_dn , ten_dn ; 
    private int so_luong ; 

    public Doanh_Nghiep(String ma_dn , String ten_dn , int so_luong){
        this.ma_dn = ma_dn;
        this.ten_dn = ten_dn ;
        this.so_luong = so_luong ;
    }

    public int compareTo(Doanh_Nghiep o){
        if(this.so_luong > o.so_luong) return -1;
        else if (this.so_luong < o.so_luong) return 1 ; 
        else  return this.ma_dn.compareTo(o.ma_dn) ; 
    }

    public String toString(){
        return ma_dn + " " + ten_dn + " " + so_luong ; 
    }
}