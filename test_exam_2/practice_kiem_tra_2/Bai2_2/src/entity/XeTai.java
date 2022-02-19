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
public class XeTai extends PTGT implements Display {
    private double trongTai;
    
    public XeTai(String ma, String hangSX, String mau, int namSX, double giaBan, double trongTai) {
        super(ma, hangSX, mau, namSX, giaBan);
        this.trongTai = trongTai;
    }

  

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\t" + this.trongTai;
    }
}