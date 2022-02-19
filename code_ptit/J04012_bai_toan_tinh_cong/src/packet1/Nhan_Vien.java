package packet1;
public class Nhan_Vien {
    private String ma , ten , chuc_vu ; 
    private double luong_1ngay, so_ngay , thuong ,phu_cap , luong , thu_nhap ; 

    private double tinh_thuong(double so_ngay , double luong){
        if(so_ngay>= 25) return luong*0.2 ; 
        else if(so_ngay>=22 && so_ngay<25) return luong*0.1 ; 
        else return 0 ; 
    }

    private double tinh_phu_cap(String chuc_vu ){
        if(chuc_vu.equals("GD")) return 250000   ; 
        else if(chuc_vu.equals("PGD")) return 200000  ; 
        else if(chuc_vu.equals("TP")) return 180000 ;
        else return 150000 ; 
    }

    public Nhan_Vien(String ten , double luong_1ngay , double so_ngay , String chuc_vu ){
        this.ma = "NV01" ; 
        this.ten =  ten ; 
        this.luong_1ngay = luong_1ngay ; 
        this.luong = luong_1ngay * so_ngay ; 
        this.thuong = tinh_thuong(so_ngay , this.luong) ; 
        this.phu_cap = tinh_phu_cap(chuc_vu); 
        this.thu_nhap = this.luong + this.thuong  + this.phu_cap ; 
        this.chuc_vu  = chuc_vu ;
    }

    public String toString(){
        return ma  + " " + ten  + " " + String.format("%.0f", luong) + " " + String.format("%.0f", thuong) + " " +  String.format("%.0f",phu_cap) + " " +  String.format("%.0f", thu_nhap) ; 
    }
}
