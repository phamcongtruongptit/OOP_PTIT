package model;

import java.io.Serializable;

/**
 *
 * @author phamc
 */
public class Sach implements Serializable {
    // mã sách, Tên sách, Tác giả, Chuyên ngành,so luong
    private int masach ;
    private String tensach,tacgia,chuyennganh ; 
    private int soluong  ;
    private static int sma = 10000 ; 

    public Sach(int masach, String tensachString, String tacgia, String chuyennganh, int soluong) {
        this.masach = masach;
        this.tensach = tensachString;
        this.tacgia = tacgia;
        this.chuyennganh = chuyennganh;
        this.soluong = soluong;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }
    public Object[] toObject(){
        return  new Object[]{
            masach , tensach , tacgia , chuyennganh , soluong 
        } ; 
    }
    
}
