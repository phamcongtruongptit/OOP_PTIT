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
public class XeMay extends PTGT implements Display {
    private double congSuat;
    
    public XeMay(String ma, String hangSX, String mau, int namSX, double giaBan, double congSuat) {
        super(ma, hangSX, mau, namSX, giaBan);
        this.congSuat = congSuat;
    }
    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    
    @Override
    public String  toString() {
        return super.toString() + "\t" + this.congSuat;
    }
}
