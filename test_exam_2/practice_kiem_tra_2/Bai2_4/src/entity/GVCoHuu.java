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
public class GVCoHuu extends GiangVien implements TinhLuong{
    private double soGioDinhMuc;
    
    public GVCoHuu (String ma, String hoTen, String hocVi, double soGioDinhMuc) {
        super(ma, hoTen, hocVi);
        this.soGioDinhMuc =soGioDinhMuc;
    }

    public double getSoGioDinhMuc() {
        return soGioDinhMuc;
    }

    public void setSoGioDinhMuc(double soGioDinhMuc) {
        this.soGioDinhMuc = soGioDinhMuc;
    }
    
    @Override
    public double getTienLinh() {
        if (super.getHocVi().equalsIgnoreCase("Dai Hoc"))
            return soGioDinhMuc * 140;
        else if (super.getHocVi().equalsIgnoreCase("Thac Sy"))
            return soGioDinhMuc * 1.2 * 140;
        return soGioDinhMuc * 1.5 * 140;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\t" + soGioDinhMuc + "\t" + getTienLinh();
    }
    
}

