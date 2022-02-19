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
public class GVTGiang extends GiangVien implements TinhLuong {
    private double soGioGiang;
    
    public GVTGiang (String ma, String hoTen, String hocVi, double soGioGiang) {
        super(ma, hoTen, hocVi);
        this.soGioGiang = soGioGiang;
    }

    public double getSoGioGiang() {
        return soGioGiang;
    }

    public void setSoGioGiang(double soGioGiang) {
        this.soGioGiang = soGioGiang;
    }
    
    @Override
    public double getTienLinh() {
        if (super.getHocVi().equalsIgnoreCase("Dai Hoc"))
            return soGioGiang * 60;
        else if (super.getHocVi().equalsIgnoreCase("Thac Sy"))
            return soGioGiang * 1.2 * 60;
        return soGioGiang * 1.5 * 60;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\t" + soGioGiang + "\t" + getTienLinh();
    }
    
    

}
