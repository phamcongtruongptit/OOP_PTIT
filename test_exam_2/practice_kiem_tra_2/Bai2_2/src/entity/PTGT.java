/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Quang Dunh
 */
public class PTGT {
    private int namSX;
    private double giaBan;
    private String ma, hangSX, mau;
    
    public PTGT() {
    }
    
    public PTGT(String ma, String hangSX, String mau, int namSX, double giaBan) {
        this.ma = ma;
        this.hangSX = hangSX;
        this.mau = mau;
        this.namSX = namSX;
        this.giaBan = giaBan;
    }
    
    public String getMa() {
        return ma;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
    public int getNamSX() {
        return namSX;
    }
    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }
    public double getGiaBan() {
        return giaBan;
    }
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public String getHangSX() {
        return hangSX;
    }
    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }
    public String getMau() {
        return mau;
    }
    public void setMau(String mau) {
        this.mau = mau;
    }
    @Override
    public String toString() {
        return this.ma + "\t" + this.hangSX + "\t" + this.mau + "\t" + this.namSX + "\t" + this.giaBan;
    }
    
    
}

