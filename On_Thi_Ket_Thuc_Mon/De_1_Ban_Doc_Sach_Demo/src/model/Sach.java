package model;
import java.io.Serializable;

public class Sach implements  Serializable{
    private int ma_sach ; 
    private String tensach , tacgia , chuyennganh ; 
    private  int soluong ; 
    private static int sma = 10000 ;

    public Sach() {
        ma_sach  = sma++ ; 
    }

    public Sach(int ma_sach, String tensach, String tacgia, String chuyennganh, int soluong) {
        this.ma_sach = ma_sach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.chuyennganh = chuyennganh;
        this.soluong = soluong;
    }

    public int getMa_sach() {
        return ma_sach;
    }

    public void setMa_sach(int ma_sach) {
        this.ma_sach = ma_sach;
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
    
    public Object[] toObject(){ //  de dien vao o
        return new Object[] {
            ma_sach , tensach , tacgia , chuyennganh , soluong 
        } ; 
    }
    public void inh(String s){
        String []t = new String[23] ; 
    }
}
