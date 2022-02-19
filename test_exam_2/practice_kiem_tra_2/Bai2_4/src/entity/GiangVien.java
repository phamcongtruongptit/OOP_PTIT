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
public class GiangVien {
    private String ma, hoTen, hocVi;
    
    public GiangVien(String ma, String hoTen, String hocVi) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.hocVi = hocVi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }
    
    @Override
    public String toString() {
        return ma + "\t" + hoTen + "\t" + hocVi;
    }
    
    public double getTienLinh() {
        return 0;
    }

}
