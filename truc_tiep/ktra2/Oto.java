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
public class Oto extends PTGT implements TinhGia{
    private String kieu;
    private int socho;

    public Oto() {
    }

    public Oto( String ma, String hang, int nam, double gia, String mau,
            String kieu, int socho) {
        super(ma, hang, nam, gia, mau);
        this.kieu = kieu;
        this.socho = socho;
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }
    
    @Override
    public double getGia() {
        if((2021-super.getNam())>=2)
            return (0.85*super.getGia());
        else
            return super.getGia();
    }
    public void nhap(){
        super.nhap();
        Scanner in=new Scanner(System.in);
        System.out.print("nhap kieu:");
        kieu=in.nextLine();
        System.out.print("nhap so cho:");
        socho=Integer.parseInt(in.nextLine());
    }
    public String toString(){
        return getMa()+"\t"+getHang()+"\t"+getNam()+"\t"+
                getGia()+"\t"+getMau()+"\t"+socho;
    }
    
}
