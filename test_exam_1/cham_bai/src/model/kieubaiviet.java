/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.trongexception;
import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class kieubaiviet implements Serializable{
    private int ma;
    private String tenkb;
    private double gia;
    private static int sma=100;

    public kieubaiviet() {
    }

    public kieubaiviet(String tenkb, double gia) throws trongexception{
        if (tenkb.isEmpty()) {
            throw new trongexception();
        }
        this.ma = sma++;
        this.tenkb = tenkb;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenkb() {
        return tenkb;
    }

    public void setTenkb(String tenkb) {
        this.tenkb = tenkb;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        kieubaiviet.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma,tenkb,gia
        };
    }
}
