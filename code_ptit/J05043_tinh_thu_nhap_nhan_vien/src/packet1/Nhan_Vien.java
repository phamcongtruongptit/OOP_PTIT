package packet1;

import java.text.DecimalFormat;

public class Nhan_Vien {
    private String ma_nhan_vien , ho_ten , chuc_vu ; 
    private int luong_co_ban , so_ngay , phu_cap , luong_chinh , tam_ung , con_lai ; 

    private String chuan_hoa_ma(int n){
        DecimalFormat F = new DecimalFormat("00")  ; 
        return "NV" + F.format(n) ;
    }

    public Nhan_Vien(int n , String ho_ten ,String chuc_vu , int luong_co_ban , int so_ngay ){
        this.ma_nhan_vien = chuan_hoa_ma(n) ; 
        this.ho_ten = ho_ten ; 
        this.chuc_vu = chuc_vu ;
        if(chuc_vu.equals("GD")) this.phu_cap = 500 ; 
        else if(chuc_vu.equals("PGD")) this.phu_cap = 400 ; 
        else if(chuc_vu.equals("TP")) this.phu_cap = 300 ; 
        else if(chuc_vu.equals("KT")) this.phu_cap = 250 ; 
        else this.phu_cap = 100 ; 

        this.luong_chinh = luong_co_ban * so_ngay ; 

        if(((phu_cap + luong_chinh) * 2/3) < 25000) this.tam_ung = Math.round(((phu_cap + luong_chinh + 500) * 2/3)/1000)*1000 ; 
        else this.tam_ung = 25000; 

        this.con_lai = phu_cap + luong_chinh - tam_ung ; 
    }

    public String toString(){
        return ma_nhan_vien  + " " + ho_ten  + " " + phu_cap + " " + luong_chinh + " " + tam_ung + " " + con_lai;  
    }
}
