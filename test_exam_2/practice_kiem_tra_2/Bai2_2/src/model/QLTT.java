/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import entity.PTGT;
import entity.OTo;
import entity.XeMay;
import entity.XeTai;
import java.util.Scanner;

/**
 *
 * @author Quang Dunh
 */
public class QLTT implements QuanLyChucNang{
    Scanner sc  =  new Scanner(System.in);
    List <PTGT> list;
    
    public QLTT() {
        list = new ArrayList<>();
        list.add(new XeMay("XM001", "HONDA", "RED", 2019, 19, 100));
        list.add(new XeMay("XM002", "HONDA", "BLACK", 2010, 40, 200));
        list.add(new OTo("OT001", "TOYOTA", "WHITE", 2018, 400, "XXX", 5));
        list.add(new XeTai("XT001", "HUYNDAI", "BLACK", 2016, 300, 50));
    }
    
    private boolean getPhuongTienTheoMa(String ma) {
        for (PTGT i : list) {
            if (i.getMa().equalsIgnoreCase(ma)) {
                return true;
            }
        }
        return false;
    }
    
    private PTGT nhap() {
        String ma = "";
        while (true) {
            System.out.print("Nhap ma xe: ");
            ma = sc.nextLine();
            ma.toUpperCase();
            if (ma.matches("^[A-Z]{2}\\d{3}") && !getPhuongTienTheoMa(ma))
                break;
            else System.err.println("Nhap lai!");
        }
        System.out.print("Nhap hang SX: ");
        String hangSX = sc.nextLine();
        System.out.print("Nhap mau xe: ");
        String mau = sc.nextLine();
        System.out.print("Nhap nam SX: ");
        int namSX = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gia ban: ");
        double giaBan = Double.parseDouble(sc.nextLine());
        return new PTGT (ma, hangSX, mau, namSX, giaBan);
    }
    
    @Override
    public void nhap_xeMay() {
        PTGT t = nhap();
        System.out.print("Nhap cong suat: ");
        double congSuat = Double.parseDouble(sc.nextLine());
        XeMay x = new XeMay(t.getMa(), t.getHangSX(), t.getMau(), t.getNamSX(), t.getGiaBan(), congSuat);
        list.add(x);
    }
    
    @Override
    public void nhap_oto() {
        PTGT t = nhap();
        System.out.print("Nhap kieu dong co: ");
        String kieuDongCo = sc.nextLine();
        System.out.print("Nhap so cho ngoi: ");
        int soChoNgoi = Integer.parseInt(sc.nextLine());
        OTo x = new OTo(t.getMa(), t.getHangSX(), t.getMau(), t.getNamSX(), t.getGiaBan(), kieuDongCo, soChoNgoi);
        list.add(x);
    }
    
    @Override
    public void nhap_xeTai() {
        PTGT t = nhap();
        System.out.print("Nhap trong tai: ");
        double trongTai = Double.parseDouble(sc.nextLine());
        XeTai x = new XeTai(t.getMa(), t.getHangSX(), t.getMau(), t.getNamSX(), t.getGiaBan(), trongTai);
        list.add(x);
    }
    @Override
    public void inDS() {
        System.out.println("XE MAY");
        System.out.println("Ma xe\tHang SX\tMau\tNam SX\tGia ban\tCong suat");
        for (PTGT i : list) {
            if (i instanceof XeMay) {
                System.out.println(i.toString());
            }
        }
        System.out.println("OTO");
        System.out.println("Ma xe\tHang SX\tMau\tNam SX\tGia ban\tKieu dong co\tSo cho ngoi");
        for (PTGT i : list) {
            if (i instanceof OTo) {
                System.out.println(i.toString());
            }
        }
        System.out.println("XE TAI");
        System.out.println("Ma xe\tHang SX\tMau\tNam SX\tGia ban\tTrong tai");
        for (PTGT i : list) {
            if (i instanceof XeTai) {
                System.out.println(i.toString());
            }
        }
    }
    
    private int getViTriTheoMa(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    
    @Override
    public void editGiaBan(String ma) {
        int vt = getViTriTheoMa(ma);
        if (vt == -1) 
            System.out.println("Khong tim thay!");
        else {
            PTGT o = list.get(vt);
            System.out.println("Nhap gia ban: ");
            double giaBan = Double.parseDouble(sc.nextLine());
            o.setGiaBan(giaBan);
            System.out.println("Sua thanh cong!");
        }
    }
    
    @Override
    public void xoa(String ma) {
        int vt = getViTriTheoMa(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay!");
        }
        else {
            list.remove(vt);
            System.out.println("Xoa thanh cong!");
        }
    }

    @Override
    public void timKiemTheoMa(String ma) {
        int vt = getViTriTheoMa(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay!");
        }
        else {
            if (list.get(vt) instanceof XeMay) {
                System.out.println("XE MAY");
                System.out.println("Ma\tHangSX\tMau\tNamSX\tGiaBan\tCongSuat");
            }
            else if (list.get(vt) instanceof OTo) {
                System.out.println("OTO");
                System.out.println("Ma\tHangSX\tMau\tNamSX\tGiaBan\tKieuDongCo\tSoChoNgoi");
            }
            else {
                System.out.println("XE TAI");
                System.out.println("Ma\tHangSX\tMau\tNamSX\tGiaBan\tTrongTai");
            }
            System.out.println(list.get(vt).toString());
        }
    }

    @Override
    public void timKiemTheoHangSX(String hangSX) {
        for (PTGT i : list) {
            if (i.getHangSX().equalsIgnoreCase(hangSX)) {
                timKiemTheoHangSX(i.getMa());
            }
        }
    }

    @Override
    public void timKiemKhoang(int nam1, int nam2) {
        for (PTGT i : list) {
            if (i.getNamSX() >= nam1 && i.getNamSX() <= nam2) {
                timKiemTheoMa(i.getMa());
            }
        }
    }

    @Override
    public void sapxep() {
        Collections.sort(list, new Comparator<PTGT>() {
            @Override
            public int compare(PTGT p1, PTGT p2) {
                return (int)(p1.getGiaBan() - p2.getGiaBan());
            }
        });
    };
//  
//  
}

