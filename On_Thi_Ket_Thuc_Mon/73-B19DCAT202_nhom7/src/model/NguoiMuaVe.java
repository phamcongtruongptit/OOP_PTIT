package model;

import control.TrongException;
import java.io.Serializable;

/**
 *
 * @author phamc
 */
public class NguoiMuaVe implements  Serializable{
    // ma, ho ten, dia chi, loai
    private  int ma ;
    private String hoten , diachi , loai ; 
    private static  int sma = 10000  ; 

    public NguoiMuaVe() {
    }

    public NguoiMuaVe( String hoten, String diachi, String loai) throws TrongException {
        if(hoten.isEmpty() || diachi.isEmpty()) throw new TrongException() ; 
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.loai = loai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NguoiMuaVe.sma = sma;
    }
        public  Object[] toObject(){
        return new Object[]{
            ma ,hoten ,diachi ,loai
        } ;
}
}
