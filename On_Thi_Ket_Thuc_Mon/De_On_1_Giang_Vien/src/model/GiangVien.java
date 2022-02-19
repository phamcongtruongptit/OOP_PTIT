package model;

import java.io.Serial;
import java.io.Serializable;

/**
 *
 * @author phamc
 */
public class GiangVien implements  Serializable{
    private int magv ; 
    private  String hoten , sdt , email , khoa ; 
    private static int sma = 10000 ; 

    public GiangVien(int magv, String hoten, String sdt, String email, String khoa) {
        this.magv = magv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
        this.khoa = khoa;
    }

    public int getMagv() {
        return magv;
    }

    public void setMagv(int magv) {
        this.magv = magv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        GiangVien.sma = sma;
    }
    public Object[] tobObject(){ // copy duoc
        return new  Object[]{
            magv , hoten , sdt , email , khoa
        } ; 
    }
}
