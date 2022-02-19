package model;

import java.io.Serializable;

/**
 *
 * @author phamc
 */
public class LoaiVe implements  Serializable{
    
    //ma, loai , dongia 
    private int ma ; 
    private String loai ; 
    private  int dongia ; 
    private static int sma = 10000; 
    public LoaiVe() {
    }

    public LoaiVe( String loai, int dongia) {
        this.ma = sma++ ; 
        this.loai = loai;
        this.dongia = dongia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        LoaiVe.sma = sma;
    }
     public  Object[] toObject(){
        return new Object[]{
            ma ,loai , dongia
        } ;
}
}
