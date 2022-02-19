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
public class phongvien implements Serializable{
    private int ma;
    private String tenpv , diachi , loai ;
    private static int sma=10000;

    public phongvien() {
    }

    public phongvien(String tenpv, String diachi, String loai) throws trongexception{
        if(tenpv.isEmpty()) throw new trongexception();
        this.ma = sma++;
        this.tenpv = tenpv;
        this.diachi = diachi;
        this.loai = loai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenpv() {
        return tenpv;
    }

    public void setTenpv(String tenpv) {
        this.tenpv = tenpv;
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
        phongvien.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,tenpv,diachi,loai
        };
    }
}
