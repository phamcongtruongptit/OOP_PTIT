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
public class GiaoDichTienTe extends GiaoDich implements TinhTien{
    private String loaiTien;
    private double tiGia;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(String loaiTien, double tiGia, String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, double thanhTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong, thanhTien);
        this.loaiTien = loaiTien;
        this.tiGia = tiGia;
    }

   
    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    @Override
    public double tinhTien() {
        if(loaiTien.compareToIgnoreCase("USD")==0||loaiTien.compareToIgnoreCase("Euro")==0) return getSoLuong()*getDonGia()*tiGia;
        return getSoLuong()*getDonGia();
    }
    
     public String toString(){
        return getMaGiaoDich()+"\t"+getNgayGiaoDich()+"\t"+getDonGia()+"\t"+getSoLuong()+"\t"+loaiTien+"\t"+tiGia+"\t"+getThanhTien();
    }
    
}
