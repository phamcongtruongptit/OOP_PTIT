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
public class GiaoDichDat extends GiaoDich implements TinhTien{
    private int loaiDat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(int loaiDat, String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, double thanhTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong, thanhTien);
        this.loaiDat = loaiDat;
    }

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public double tinhTien() {
        if(loaiDat==1) return 200*getSoLuong()*getDonGia();
        else if(loaiDat==2) return 400*getSoLuong()*getDonGia();
        return 800*getSoLuong()*getDonGia();
    }
    public String toString(){
        return getMaGiaoDich()+"\t"+getNgayGiaoDich()+"\t"+getDonGia()+"\t"+getSoLuong()+"\t"+loaiDat+"\t"+getThanhTien();
    }
    
    

}
