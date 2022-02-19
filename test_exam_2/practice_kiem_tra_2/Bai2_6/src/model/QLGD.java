/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.GiaoDich;
import entity.GiaoDichDat;
import entity.GiaoDichTienTe;
import entity.GiaoDichVang;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLGD implements ChucNang {

    private List<GiaoDich> list;
    private Scanner scanner;

    public QLGD() {
        list = new ArrayList<>();
        scanner = new Scanner(System.in);
        list.add(new GiaoDichVang("trang", "GDV1234", "12/03/2003", 1000, 100, 6000));
        list.add(new GiaoDichVang("do", "GDV289", "06/07/2010", 2030, 100, 8008));
        list.add(new GiaoDichVang("den", "GDV198", "12/02/2020", 7080, 100, 5006));
        list.add(new GiaoDichDat(1, "GDD453", "13/04/2010", 2345, 13, 9000));
        list.add(new GiaoDichDat(2, "GDD234", "12/03/2003", 676, 105, 7000));
        list.add(new GiaoDichTienTe("USD", 5.6, "GDT456", "06/07/2010", 678, 200, 8888));
    }

    private int viTri(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaGiaoDich().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    private GiaoDich nhap() {
        String maGiaoDich, ngayGiaoDich;
        double donGia;
        int soLuong;
        while (true) {
            System.out.println("Nhap ma giao dich");
            maGiaoDich = scanner.nextLine().toUpperCase();
            if (maGiaoDich.matches("^[A-Z]{3}\\d{3}$") && viTri(maGiaoDich) == -1) {
                break;
            } else {
                System.err.println("Nhap lai");
            }
        }

        while (true) {
            System.out.println("Nhap ngay giao dich theo dinh dang dd/MM/yyyy");
            ngayGiaoDich = scanner.nextLine();
            if (ngayGiaoDich.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                break;
            } else {
                System.err.println("Nhap lai");
            }
        }
        System.out.println("Nhap don gia");
        donGia = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so luong");
        soLuong = Integer.parseInt(scanner.nextLine());
        return new GiaoDich(maGiaoDich, ngayGiaoDich, donGia, soLuong, 0);
    }

    @Override
    public void themGiaoDichVang() {
        GiaoDich gd = nhap();
        System.out.println("Nhap loai vang");
        String loaiVang = scanner.nextLine();

        GiaoDichVang gdv = new GiaoDichVang(loaiVang, gd.getMaGiaoDich(), gd.getNgayGiaoDich(), gd.getDonGia(), gd.getSoLuong(), 0);
        gdv.setThanhTien(gdv.tinhTien());
        list.add(gdv);
    }

    @Override
    public void themGiaoDichTienTe() {
        GiaoDich gd = nhap();
        String loaiTien = null;
        int x = 0;
        do {
            System.out.println("Chon loai tien theo so");
            System.out.println("1. Viet Nam\t2. USD\t3. Euro");
            System.out.println("Ban chon?");
            x = Integer.parseInt(scanner.nextLine());
            if (x == 1) {
                loaiTien = "Viet Nam";
            } else if (x == 2) {
                loaiTien = "USD";
            } else if (x == 3) {
                loaiTien = "Euro";
            }
        } while (x < 1 || x > 3);
        System.out.println("Nhap ti gia");
        double tiGia = Double.parseDouble(scanner.nextLine());

        GiaoDichTienTe gdtt = new GiaoDichTienTe(loaiTien, tiGia, gd.getMaGiaoDich(), gd.getNgayGiaoDich(), gd.getDonGia(), gd.getSoLuong(), 0);
        gdtt.setThanhTien(gdtt.tinhTien());
        list.add(gdtt);
    }

    @Override
    public void themGiaoDichDat() {
        GiaoDich gd = nhap();
        int loaiDat = 0;
        int x = 0;
        do {
            System.out.println("Chon loai dat theo so");
            System.out.println("1\t2\t3");
            System.out.println("Ban chon?");
            x = Integer.parseInt(scanner.nextLine());
            if (x == 1) {
                loaiDat = 1;
            } else if (x == 2) {
                loaiDat = 2;
            } else if (x == 3) {
                loaiDat = 3;
            }
        } while (x < 1 || x > 3);
        GiaoDichDat gdd = new GiaoDichDat(loaiDat, gd.getMaGiaoDich(), gd.getNgayGiaoDich(), gd.getDonGia(), gd.getSoLuong(), 0);
        gdd.setThanhTien(gdd.tinhTien());
        list.add(gdd);
    }

    @Override
    public void dSGD() {
        for (GiaoDich giaoDich : list) {
            System.out.println(giaoDich);
        }
    }

    @Override
    public void dSGDVang() {
        for (GiaoDich giaoDich : list) {
            if (giaoDich instanceof GiaoDichVang) {
                System.out.println(giaoDich);
            }
        }
    }

    @Override
    public void dSGDTienTe() {
        for (GiaoDich giaoDich : list) {
            if (giaoDich instanceof GiaoDichTienTe) {
                System.out.println(giaoDich);
            }
        }
    }

    @Override
    public void dSGDDat() {
        for (GiaoDich giaoDich : list) {
            if (giaoDich instanceof GiaoDichDat) {
                System.out.println(giaoDich);
            }
        }
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma can sua");
        String ma = scanner.nextLine();
        int index = viTri(ma);
        if (index == -1) {
            System.out.println("Khong co giao dich nay");
        } else {
            String ngayGiaoDich;
            while (true) {
                System.out.println("Nhap ngay giao dich theo dinh dang dd/MM/yyyy");
                ngayGiaoDich = scanner.nextLine();
                if (ngayGiaoDich.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                    break;
                } else {
                    System.err.println("Nhap lai");
                }
            }
            list.get(index).setNgayGiaoDich(ngayGiaoDich);
            System.out.println("Sua thanh cong");
        }
    }

    @Override
    public void xoa() {
        System.out.println("Nhap ma can xoa");
        String ma = scanner.nextLine();
        int index = viTri(ma);
        if (index == -1) {
            System.out.println("Khong co giao dich nay");
        } else {
            list.remove(index);
            System.out.println("Xoa thanh cong");
        }
    }

    @Override
    public void tongSoGiaoDich() {
        System.out.println("So giao dich la " + list.size());
    }

    @Override
    public void dSGiaoDichCoNgay() {
        String ngayGiaoDich;
        while (true) {
            System.out.println("Nhap ngay giao dich theo dinh dang dd/MM/yyyy");
            ngayGiaoDich = scanner.nextLine();
            if (ngayGiaoDich.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                break;
            } else {
                System.err.println("Nhap lai");
            }
        }
        for (GiaoDich giaoDich : list) {
            if (giaoDich.getNgayGiaoDich().equalsIgnoreCase(ngayGiaoDich)) {
                System.out.println(giaoDich);
            }
        }
    }

    @Override
    public void dSGiaoDichTuNamDenNam() {
        System.out.println("Giao dich tu nam");
        int nam1 = Integer.parseInt(scanner.nextLine());
        System.out.println("den nam");
        int nam2 = Integer.parseInt(scanner.nextLine());
        for (GiaoDich giaoDich : list) {
            int nam = Integer.parseInt(giaoDich.getNgayGiaoDich().substring(giaoDich.getNgayGiaoDich().lastIndexOf("/") + 1));
            if (nam >= nam1 && nam <= nam2) {
                System.out.println(giaoDich);
            }
        }
    }

}