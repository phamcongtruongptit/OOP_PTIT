package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLGD  implements IChucNang{
    Scanner scanner = new Scanner(System.in);
    ArrayList<GiaoDich> list ;
    public QLGD() {
        list = new ArrayList<GiaoDich>();
        list.add( new GDVang("V12"   ,3, 8, 2021, 10, 30, "18K") ) ; 
        list.add( new GDVang("V16"   ,5, 23, 2021, 15, 45, "9999") ) ; 
        list.add( new GDVang("V15"   ,21, 6, 2020, 12, 50, "16K") ) ; 
        list.add( new GDVang("V15"   ,11, 6, 2017, 20, 32, "16K") ) ; 
        list.add(new GDTien("T12", 17, 2, 2015, 10, 14, "VN") )  ; 
        list.add(new GDTien("T13", 16, 12, 2014, 18, 104, "VN") )  ; 
        list.add(new GDTien("T14", 16, 11, 2025, 30, 154, "VN") )  ; 
        list.add(new GDTien("T16", 12, 6, 2012, 45, 112, "VN") )  ; 
    }
    private int ton_tai(String ma){
        for(int i = 0 ; i<list.size() ; i++){
            if(ma.equalsIgnoreCase(list.get(i).getMa()) ) return i ; 
        }
        return -1; 

    }
    private GiaoDich nhap(){
        int  ngay , thang , nam , soluong , dongia; 
        String ma ; 
        while(true) {
            System.out.print("Nhap ma: ");
             ma = scanner.nextLine();  
            if(ton_tai(ma)== -1) break ; 
            else {
                System.out.println("Ma trung !");
            }
        }
        
        while(true) {
            System.out.print("Nhap ngay: ");
            ngay = Integer.parseInt(scanner.nextLine()) ; 
            if(ngay>=1 && ngay <= 31) break ; 
            else {
                System.out.println("Nhap Lai !");
            }
        }
        while(true) {
            System.out.print("Nhap thang: ");
            thang = Integer.parseInt(scanner.nextLine()) ; 
            if(thang>=1 && thang <= 12) break ; 
            else {
                System.out.println("Nhap Lai !");
            }
        }
        while(true) {
            System.out.print("Nhap nam: ");
            nam = Integer.parseInt(scanner.nextLine()) ; 
            if(nam>=1000 && nam <= 9999) break ; 
            else {
                System.out.println("Nhap Lai !");
            }
        }
        System.out.print("Nhap so luong: ");
        soluong = Integer.parseInt(scanner.nextLine()) ;
        System.out.print("Nhap don gia: ");
        dongia = Integer.parseInt(scanner.nextLine()) ;
        return new GiaoDich(ma, ngay, thang, nam, soluong, dongia) ; 
    }

    @Override
    public void nhapGDTien() {
        GiaoDich K = nhap() ; 
        System.out.println("Nhap Loai tien:"); 
        String loai ; 
        while(true){
            loai = scanner.nextLine().toUpperCase();
            if(loai.equals("VN") ||loai.equals("USD") ||loai.equals("UERO") ) break; 
            else {
                System.out.println("Nhap lai");
            }
        }
        list.add(new GDTien(K.getMa(), K.getNgay() , K.getThang(), K.getNam(), K.getSo_luong(), K.getDon_gia(), loai)) ; 
    }
    @Override
    public void nhapGDVang() {
        GiaoDich K = nhap() ; 
        System.out.println("Nhap Loai Vang :"); 
        String loai ; 
        while(true){
            loai = scanner.nextLine().toUpperCase();
            if(loai.equals("9999") ||loai.equals("18K") ||loai.equals("16K") ) break; 
            else {
                System.out.println("Nhap lai");
            }
        }
        list.add(new GDVang(K.getMa(), K.getNgay() , K.getThang(), K.getNam(), K.getSo_luong(), K.getDon_gia(), loai)) ; 
    }

    @Override
    public void sap_xep_vang_theo_tien() {
        ArrayList<GDVang> va = new ArrayList<GDVang>() ; 
        for (GiaoDich gd: list) {
            if(gd instanceof GDVang) {
                va.add((GDVang)gd) ; 
            }
        }
        Collections.sort(va , new Comparator<GDVang>(){

            @Override
            public int compare(GDVang o1, GDVang o2) {
                return Double.compare(o1.getTien(), o2.getTien()) ;
            }
        }) ; 
        System.out.println("Giao dich vang sau sap xep:");
        for (GDVang gdVang : va) {
            System.out.println(gdVang);
        }
    }
    @Override
    public void suaGDTien() {
        ArrayList<GDTien> gdtien = new ArrayList<GDTien>() ; 
        for (GiaoDich gd: list) {
            if(gd instanceof GDTien) {
                gdtien.add((GDTien)gd) ; 
            }
        }
        int check = 0 ;
        System.out.print("Nhap ma:");
        String ma = scanner.nextLine() ; 
        for (int i = 0 ; i<gdtien.size() ; i++) {
            if(gdtien.get(i).getMa().equalsIgnoreCase(ma)){
                check = 1  ; 
                int ngay , thang , nam  , dongia ; 
                while(true) {
                    System.out.print("Nhap ngay: ");
                    ngay = Integer.parseInt(scanner.nextLine()) ; 
                    if(ngay>=1 && ngay <= 31) break ; 
                    else {
                        System.out.println("Nhap Lai !");
                    }
                }
                while(true) {
                    System.out.print("Nhap thang: ");
                    thang = Integer.parseInt(scanner.nextLine()) ; 
                    if(thang>=1 && thang <= 12) break ; 
                    else {
                        System.out.println("Nhap Lai !");
                    }
                }
                while(true) {
                    System.out.print("Nhap nam: ");
                    nam = Integer.parseInt(scanner.nextLine()) ; 
                    if(nam>=1000 && nam <= 9999) break ; 
                    else {
                        System.out.println("Nhap Lai !");
                    }
                }
           
                System.out.print("Nhap don gia: ");
                dongia = Integer.parseInt(scanner.nextLine()) ;
                System.out.println("Nhap Loai tien:"); 
                String loai ; 
                 while(true){
                      loai = scanner.nextLine().toUpperCase();
                       if(loai.equals("VN") ||loai.equals("USD") ||loai.equals("UERO") ) break; 
            else {
                System.out.println("Nhap lai");
            }
        }
                gdtien.get(i).setNam(nam); gdtien.get(i).setNgay(ngay); gdtien.get(i).setThang(thang); gdtien.get(i).setDon_gia(dongia);
                gdtien.get(i).setLoai_tien(loai);
                System.out.println("Sua thanh cong");
            }
            if(check == 0 ) System.out.println("Khong co ma !");
        }
    }
    @Override
    public void thong_ke_tien() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void vietDS() {
        int v =  0 , t = 0   ; 
        System.out.println("Giao Dich Vang:");
        for (GiaoDich giaoDich : list) {
            if(giaoDich instanceof GDVang) {
                System.out.println(giaoDich);
                v++ ; 
            }
        }
        System.out.printf("Co %d Giao Dich Vang.\n" , v);
        System.out.println("Giao Dich Vang:");
        for (GiaoDich giaoDich : list) {
            if(giaoDich instanceof GDTien) {
                System.out.println(giaoDich);
                t++ ; 
            }
        }
        System.out.printf("Co %d Giao Dich Tien.\n" , t);
    } 

}
