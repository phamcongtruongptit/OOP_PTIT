package packet1;

public class Nhan_Vien {
    private final String ma_nhan_vien = "00001" ; 
    private String name   ; 
    private String gioi_tinh , ngay_sinh ,dia_chi , ma_so_thue , ngay_ky_hd ;  

    public Nhan_Vien(String name , String gioi_tinh , String ngay_sinh , String dia_chi , String ma_so_thue , String ngay_ky_hd){
        this.name = name  ; 
        this.gioi_tinh = gioi_tinh ;
        this.ngay_sinh = ngay_sinh ; 
        this.ngay_ky_hd = ngay_ky_hd ; 
        this.dia_chi = dia_chi ;
        this.ma_so_thue = ma_so_thue ; 
    }

    public String toString(){
        return ma_nhan_vien+" "+ name+" "+ gioi_tinh+" "+ngay_sinh+" "+dia_chi + " " + ma_so_thue+ " "  + ngay_ky_hd ; 
    }

    
    
}
