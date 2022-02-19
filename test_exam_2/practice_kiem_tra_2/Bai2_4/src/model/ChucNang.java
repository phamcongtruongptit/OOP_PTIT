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
public interface ChucNang {
//  System.out.println("1. Nhap Giang vien co huu");
    public void nhapGVCoHuu();
//  System.out.println("2. Nhap Giang vien thinh giang");
    public void nhapGVTGiang();
//  System.out.println("3. Danh sach Giang vien");
    public void inDS();
//  System.out.println("4. Sap xep theo tien linh");
    public void sapxep();
//  System.out.println("5. Xoa Giang vien theo ma");
    public void xoa();
//  System.out.println("6. Tong so tien phai tra theo hoc vi");
    public void sumTienByHocVi();
//
}
