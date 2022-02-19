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
public class OTo extends PTGT implements Display{
    private String kieuDongCo;
    private int soChoNgoi;
    
    public OTo(String ma, String hangSX, String mau, int namSX, double giaBan, String kieuDongCo, int soChoNgoi) {
        super(ma, hangSX, mau, namSX, giaBan);
        this.kieuDongCo = kieuDongCo;
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\t" + this.kieuDongCo + "\t" + this.soChoNgoi;
    }
    
    
}

