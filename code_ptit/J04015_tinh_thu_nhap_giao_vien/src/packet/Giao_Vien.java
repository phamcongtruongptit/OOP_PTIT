package packet;

public class Giao_Vien {
    private String ma_ngach , ho_ten, chuc_vu ; 
    private int bac_luong , phu_cap , thu_nhap ; 
    public Giao_Vien (String ma_ngach , String ho_ten , int luong_co_ban){
        this.ma_ngach = ma_ngach ; 
        this.ho_ten = ho_ten ; 
        this.bac_luong = Integer.parseInt(ma_ngach.substring(2));
        this.chuc_vu = ma_ngach.substring(0 , 2) ;
        if(chuc_vu.equals("HT")) this.phu_cap  = 2000000 ; 
        else if(chuc_vu.equals("HP")) this.phu_cap = 900000 ; 
        else this.phu_cap = 500000 ; 
        this.thu_nhap  = luong_co_ban * bac_luong + phu_cap ;  
    }


    public String toString() {
        return ma_ngach + " " + ho_ten + " " + bac_luong + " " + phu_cap + " " + thu_nhap  ; 
    }
}
