package packet1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class QuanLyGiaoThong  implements ChucNang{
    private ArrayList<PTGT> list;
    private Scanner scanner = new Scanner(System.in);

    public QuanLyGiaoThong() {
        list = new ArrayList<PTGT>();
        list.add(new Oto("VN002", "Vinfast", 2015, 400, "den", "Sieu toc", 4)); 
        list.add(new XeMay("VN852", "Honda", 2021, 32, "den", 123));
        list.add(new Oto("VN096", "Vinfast", 2020, 930, "do", "Sang chanh", 6)); 
        list.add(new Oto("VN342", "Toyota", 2010, 230, "xanh", "Xe Cu", 4)); 
        list.add(new XeMay("VN123", "Honda", 2018, 20, "do", 80));
        list.add(new XeMay("VN722", "RSX", 2017, 10, "xanh", 100));
        list.add(new Oto("VN782", "huynhDai", 2017, 500, "den", "cho hang", 8)); 
    }

    // Kiem tra da ton tai Ma hay chua
    private int tontai(String ma){
        for(int i = 0 ; i<list.size() ; i++){
            if(list.get(i).getMa().equalsIgnoreCase(ma)) return i;//ma da ton tai (bi trung)
        }
        return -1 ; // khong tim thay(ma chua co)
    }
    // Nhap lop cha
    private PTGT nhap(){
        String ma , hang , mau ; 
        int nam  ; double gia ; 
        String res = "^VN\\d{3}";
        while(true){
            System.out.print("Nhap Ma: ");
            ma = scanner.nextLine().toUpperCase();
            if(tontai(ma) == -1 && ma.matches(res)) break ;
            else System.out.println("Nhap lai ma: ");
        }
        System.out.print("Nhap Hang: ");
        hang = scanner.nextLine();
        System.out.print("Nhap Nam: ");
        nam = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap Gia: ");
        gia = Double.parseDouble( scanner.nextLine());
        System.out.print("Nhap Mau: ");
        mau = scanner.nextLine();
        return new PTGT(ma, hang, nam, gia, mau) ;
    }




    @Override
    public void nhapOto() {
        PTGT p = nhap() ; 
        System.out.print("Nhap Kieu Oto: ");
        String kieu = scanner.nextLine();
        System.out.print("Nhap So Cho Oto: ");
        int socho = Integer.parseInt(scanner.nextLine());
        list.add(new Oto(p.getMa(), p.getHang(), p.getNam(), p.getGia(), p.getMau(), kieu, socho));
    }

    @Override
    public void nhapXeMay() {
        PTGT p = nhap() ; 
        System.out.print("Nhap Cong Suat: ");
        double cong = Double.parseDouble( scanner.nextLine());
        list.add(new XeMay(p.getMa(), p.getHang(), p.getNam(), p.getGia(), p.getMau(),cong));
        
    }

    public void tim_theo_cho(){
        ArrayList<Oto> O = new ArrayList<>() ; 
        for(PTGT p : list){
            if(p instanceof Oto){
                O.add((Oto) p);
            }
        }
        System.out.print("Nhap so cho: ");
        int n = Integer.parseInt(scanner.nextLine());
        int check = 0 ;
        for (Oto oto : O) {
            if(oto.getSoCho() == n){
                check  = 1 ;
                System.out.println(oto);
            }
        }
        if(check == 0){
            System.out.println("Khong tim thay o to co "+ n+"cho");
        }
    }

    @Override
    public void sapxeoOToTheoGia() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sapxepGiaGiamDan() {
        Collections.sort(list, new Comparator<PTGT>(){

            @Override
            public int compare(PTGT o1, PTGT o2) {
               return Double.compare(o2.getGia(), o1.getGia());
            }

        }) ; 
        vietDS();
    }

    @Override
    public void sapxepTheoHang() {
        Collections.sort( list, new Comparator<PTGT>(){

            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o1.getHang().compareToIgnoreCase(o2.getHang()); // sap xep tang dan theo hang
            }
            
        });
        vietDS();
        
    }

    @Override
    public void sapxepTheoMa() {
        Collections.sort(list);
        vietDS();
    }

    @Override
    public void sapxepTheoMau() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sapxepTheoNam() {
        Collections.sort(list, new Comparator<PTGT>() {

            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o1.getNam() - o2.getNam();
            }
            
        });
    }

    @Override
    public void sua() {
        System.out.print("Nhap ma can Sua: ");
        String ma = scanner.nextLine();
        int pos = tontai(ma);
        if(pos == -1){
            System.out.println("Ma KHONG TON TAI !!!");
        }
        else { // da tim thay
            PTGT p = list.get(pos);
            System.out.print("Nhap Hang: ");
            String hang = scanner.nextLine();
            System.out.print("Nhap Nam: ");
           int nam = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhap Gia: ");
           double gia = Double.parseDouble( scanner.nextLine());
            System.out.print("Nhap Mau: ");
           String mau = scanner.nextLine();
           p.setGia(gia); p.setHang(hang); p.setMau(mau); p.setNam(nam);
           System.out.println("Sua Thanh Cong !!!");
        }
    }
    public void  suaXeMay(){
        ArrayList<XeMay> xm = new ArrayList<XeMay>();
        for(PTGT i: list){
            if(i instanceof XeMay){
                xm.add((XeMay)i);
            }
        }
        System.out.print("Nhap ma xe may can sua: ");
        String ma = scanner.nextLine().toUpperCase();
        int check = 0 ; 
        for(int i = 0 ; i<xm.size() ; i++){
            XeMay p = xm.get(i);
            if(p.getMa().equalsIgnoreCase(ma)){
                check  = 1 ; 
                System.out.print("Nhap Hang: ");
                String hang = scanner.nextLine();
                System.out.print("Nhap Nam: ");
               int nam = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhap Gia: ");
               double gia = Double.parseDouble( scanner.nextLine());
                System.out.print("Nhap Mau: ");
               String mau = scanner.nextLine();
               System.out.print("Nhap cong suat: ");
               double cong = Double.parseDouble( scanner.nextLine());
               p.setGia(gia); p.setHang(hang); p.setMau(mau); p.setNam(nam); p.setCongSuat(cong);
               System.out.println("Sua Thanh Cong xe may co ma: " + ma);
            }
        }
        if(check ==0 ) System.out.println("Ma Khong Ton Tai !!!");
    }


    @Override
    public void thongke() {
        // thong ke theo Mau
        HashMap<String , Integer> map = new HashMap<>() ; 
        for (PTGT ptgt : list) {
            map.put(ptgt.getMau(), 0) ; 
        }
        System.out.println("size: " + map.size());
        for (PTGT ptgt : list) {
            String x = ptgt.getMau(); 
            int check = map.get(x);
            map.put(x, check+1) ; 
        }
        Set<String> set = map.keySet();
        for (String string : set) {
            System.out.println(string + " : " + map.get(string));
        }
        
    }

    @Override
    public void timTheoHang() { // tim gan dung
        System.out.print("Nhap hang can tim: ");
        String hang = scanner.nextLine().toLowerCase();
        int check = 0 ; 
        for (PTGT ptgt : list) {
            if(ptgt.getHang().toLowerCase().contains(hang)) {
                System.out.println(ptgt);
                check  = 1 ; 
            }
        }
        if(check == 0) {
            System.out.println("Khong tim thay phuong tien !");
        }
    }

    @Override
    public void timTheoMa() { // tim chinh xac
        System.out.print("Nhap ma can tim: ");
        int check = 0 ; 
        String ma = scanner.nextLine();
        for(int i = 0 ; i<list.size() ; i++){
            if(list.get(i).getMa().equalsIgnoreCase(ma)){
                check  = 1; 
                System.out.printf("Thong tin Phuong Tien Co Ma %s:",ma.toUpperCase());
                System.out.println(list.get(i));
            } //ma ton tai
        }
        if(check == 0){
            System.out.println("Khong tim thay phuong tien !");
        }
    }

    @Override
    public void timTheoMau() {
        System.out.print("Nhap mau can tim: ");
        String hang = scanner.nextLine().toLowerCase();
        int check = 0 ; 
        for (PTGT ptgt : list) {
            if(ptgt.getMau().equalsIgnoreCase(hang)) {
                System.out.println(ptgt);
                check  = 1 ; 
            }
        }
        if(check == 0) {
            System.out.println("Khong tim thay phuong tien !");
        }
        
    }

    @Override
    public void timTheoNam() {
        System.out.print("Tu nam: ");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Den nam: ");
        int n2 = Integer.parseInt(scanner.nextLine());
        int check = 0 ;
        for (PTGT ptgt : list) {
            if(ptgt.getNam()>=n1 && ptgt.getNam()<=n2 ){
                System.out.println(ptgt);
                check = 1 ; 
            }
        }
        if(check==0) System.out.println("khong tim thay !");
    }

    @Override
    public void vietDS() {
        System.out.println("Danh sach o to: ");
        for(PTGT i:list) {
            if(i instanceof Oto){ // kiem tra i co thuoc O TO hay khong
                System.out.println(i);
            }
        }
        System.out.println("Danh sach xe may: ");
        for(PTGT i:list) {
            if(i instanceof XeMay){
                System.out.println(i);
            }
        }
        System.out.println("___________________");
    }

    @Override
    public void xoa() {
        System.out.print("Nhap ma can xoa: ");
        String ma = scanner.nextLine();
        int pos = tontai(ma);
        if(pos == -1){
            System.out.println("Ma KHONG TON TAI !!!");
        }
        else {
            list.remove(pos);
            System.out.println("Da xoa phuong tien co ma: "+ ma);
        }
        
    }
    
}
