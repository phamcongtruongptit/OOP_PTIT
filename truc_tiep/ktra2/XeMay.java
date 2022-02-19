/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class XeMay extends PTGT implements TinhGia{
    private double trongtai;

    public XeMay() {
    }

    public XeMay( String ma, String hang, int nam, 
            double gia, String mau,double trongtai) {
        super(ma, hang, nam, gia, mau);
        this.trongtai = trongtai;
    }

    public double getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(double trongtai) {
        this.trongtai = trongtai;
    }
    
    @Override
    public double getGia() {
        if((2021-super.getNam())>=2)
            return (0.95*super.getGia());
        else
            return super.getGia();
    }
    public void nhap(){
        super.nhap();
        Scanner in=new Scanner(System.in);
        System.out.print("nhap trong tai:");
        trongtai=Double.parseDouble(in.nextLine());
    }
    public String toString(){
        return getMa()+"\t"+getHang()+"\t"+getNam()+"\t"+
                getGia()+"\t"+getMau()+"\t"+trongtai;
    }
}
