package model;

import control.TrongException;
import java.io.Serializable;

/**
 *
 * @author phamc
 */
public class DichVu implements Serializable{
    private int ma ; 
    private  String ten , nhom ; 
    private double chiphi , giacuoc ; 
    private  static int sma  = 1000 ; 

    public DichVu() {
    }
    public DichVu( String ten, String nhom, double chipho, double giacuoc) throws TrongException  {
        if(ten.isEmpty()||ten.equals("")) throw  new  TrongException() ; 
        this.ma = sma++ ; 
        this.ten = ten;
        this.nhom = nhom;
        this.chiphi = chipho;
        this.giacuoc = giacuoc;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public double getChipho() {
        return chiphi;
    }

    public void setChipho(double chipho) {
        this.chiphi = chipho;
    }

    public double getGiacuoc() {
        return giacuoc;
    }

    public void setGiacuoc(double giacuoc) {
        this.giacuoc = giacuoc;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DichVu.sma = sma;
    }
    public  Object[] toObject(){
        return new Object[]{
            ma , ten , nhom , chiphi , giacuoc
        } ; 
    }
           
}
