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
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import entity.GVCoHuu;
import entity.GiangVien;
import entity.GVTGiang;

public class QLGD implements ChucNang{
    Scanner sc = new Scanner(System.in);
    List<GiangVien> list;
    
    public  QLGD() {
        list = new ArrayList<>();
        list.add(new GVCoHuu("CH5768", "Nguyen Dinh Hien", "Thac Sy", 100));
        list.add(new GVCoHuu("CH3533", "Nguyen Duy Phuong", "Tien Si", 120));
        list.add(new GVCoHuu("CH0505", "Le Ba Long", "Tien Si", 80));
        list.add(new GVTGiang("TG0585", "Tran Van Tu", "Dai Hoc", 50));
        list.add(new GVTGiang("TG8765", "Tran Thi Dung", "Thac Sy", 70));
        
    }
    
    private boolean getGVByMa(String ma) {
        for (GiangVien i : list) {
            if (i.getMa().equalsIgnoreCase(ma))
                return true;
        }
        return false;
    }
    
    private GiangVien nhap() {
        String ma = "";
        while (true) {
            System.out.print("Ma GV: ");
            ma = sc.nextLine().toUpperCase();
            if (ma.matches("[A-Z]{2}\\d{4}") && !getGVByMa(ma))
                break;
            else System.err.println("Nhap lai!");
        }
        System.out.print("Ten GV: ");
        String hoTen = sc.nextLine();
        System.out.print("Hoc vi: ");
        String hocVi = sc.nextLine();
        return new GiangVien(ma, hoTen, hocVi);
    }
    
    @Override
    public void nhapGVCoHuu() {
        GiangVien g = nhap();
        System.out.print("So gio dinh muc: ");
        double soGioDinhMuc = Double.parseDouble(sc.nextLine());
        list.add(new GVCoHuu(g.getMa(), g.getHoTen(), g.getHocVi(), soGioDinhMuc));
    }
    
    @Override
    public void nhapGVTGiang() {
        GiangVien g = nhap();
        System.out.print("So gio giang: ");
        double soGioGiang = Double.parseDouble(sc.nextLine());
        list.add(new GVTGiang(g.getMa(), g.getHoTen(), g.getHocVi(), soGioGiang));
    }
    
    @Override
    public void inDS() {
        for (GiangVien i : list) {
            System.out.println(i.toString());
        }
        System.out.println("Tong: " + list.size());
    }
    
    @Override
    public void sapxep() {
        list.sort(new Comparator<GiangVien>() {
            public int compare(GiangVien g1, GiangVien g2) {
                return (int)(g2.getTienLinh() - g1.getTienLinh());
            }
        });
        inDS();
    }
    
    public int getViTriByMa(String ma) {
        for (int i = 0;  i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    @Override
    public void xoa() {
        System.out.print("Ma GV: ");
        String ma = sc.nextLine();
        if (getGVByMa(ma)) {
            list.remove(getViTriByMa(ma));
            System.out.println("Xoa thanh cong!");
        }
        else System.out.print("Khong tim thay! ");
    }
    
    @Override
    public void sumTienByHocVi() {
        Map<String, Double> sum = list.stream().collect(Collectors.groupingBy(GiangVien::getHocVi, 
                Collectors.summingDouble(GiangVien::getTienLinh)));
        System.out.println(sum);
    }
}
