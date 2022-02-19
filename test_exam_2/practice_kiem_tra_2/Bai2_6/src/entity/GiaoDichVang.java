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
public class GiaoDichVang extends GiaoDich implements TinhTien{
    private String loaiVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(String loaiVang, String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, double thanhTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong, thanhTien);
        this.loaiVang = loaiVang;
    }

  
    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public double tinhTien() {
        return getSoLuong()*getDonGia();
    }
    
    public String toString(){
        return getMaGiaoDich()+"\t"+getNgayGiaoDich()+"\t"+getDonGia()+"\t"+getSoLuong()+"\t"+loaiVang+"\t"+getThanhTien();
    }
    
}

