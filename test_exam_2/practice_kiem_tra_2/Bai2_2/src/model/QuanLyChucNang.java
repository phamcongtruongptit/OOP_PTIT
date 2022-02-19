/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Quang Dunh
 */
public interface QuanLyChucNang {
//  System.out.println("1. Nhap xe may");
    public void nhap_xeMay();
//  System.out.println("2. Nhap o to");
    public void nhap_oto();
//  System.out.println("3. Nhap xe tai");
    public void nhap_xeTai();
//  System.out.println("4. In danh sach PTGT");
    public void inDS();
//  System.out.println("5. Sua gia ban");
    public void editGiaBan(String ma);
//  System.out.println("6. Xoa");
    public void xoa(String ma);
//  System.out.println("7. Tim kiem (theo ma)");
    public void timKiemTheoMa(String ma);
//  System.out.println("8. Tim kiem (theo hang san xuat)");
    public void timKiemTheoHangSX(String hangSX);
//  System.out.println("9. Tim kiem (tu nam ... den nam ...");
    public void timKiemKhoang(int nam1, int nam2);
//  System.out.println("10. Sap xep (theo gia ban)");
    public void sapxep();

}
