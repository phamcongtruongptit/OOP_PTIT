package model;

import java.io.Serializable;

/**
 *
 * @author phamc
 */
public class MonHoc implements  Serializable{
    private int mamh ; 
   private String tenmh , loaimh ; 
   private int sotiet ; 
   private  static int sma  = 100  ; 

    public MonHoc(int mamh, String tenmh, int sotiet, String loaimh) {
        this.mamh = mamh;
        this.tenmh = tenmh;
        this.loaimh = loaimh;
        this.sotiet = sotiet;
    }

    public int getMamh() {
        return mamh;
    }

    public void setMamh(int mamh) {
        this.mamh = mamh;
    }

    public String getTenmh() {
        return tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

    public String getLoaimh() {
        return loaimh;
    }

    public void setLoaimh(String loaimh) {
        this.loaimh = loaimh;
    }

    public int getSotiet() {
        return sotiet;
    }

    public void setSotiet(int sotiet) {
        this.sotiet = sotiet;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }
    public Object[] tobObject(){
        return new  Object[]{
            mamh , tenmh , sotiet , loaimh
        } ; 
    }
   
   
}
