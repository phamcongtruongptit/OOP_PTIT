
package ktra2;

import java.util.Scanner;

public class PTGT implements Comparable<PTGT>{
    //mã, hãng sản xuất, năm sản xuất, giá bán, màu
    private String ma,hang;
    private int nam;
    private double gia;
    private String mau;

    public PTGT() {
    }

    public PTGT(String ma, String hang, int nam, double gia, String mau) {
        this.ma = ma;
        this.hang = hang;
        this.nam = nam;
        this.gia = gia;
        this.mau = mau;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau.toLowerCase();
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    public void nhap(){
        Scanner in=new Scanner(System.in);
        String reg="^HN\\d{3}";
        while(true){
            System.out.print("Nhap ma:");
            ma=in.nextLine().toUpperCase();
            if(ma.matches(reg))
                break;
            System.err.println("Khong dung dinh dang!!!!");
        }
        System.out.print("nhap hang:");
        hang=in.nextLine();
        System.out.print("nhap nam:");
        nam=Integer.parseInt(in.nextLine());
        System.out.print("nhap gia:");
        gia=Double.parseDouble(in.nextLine());
        System.out.print("nhap mau:");
        mau=in.nextLine();
    }

    @Override
    public int compareTo(PTGT o) {
        //sap xep theo xau
        // ma
        //return ma.compareTo(o.ma);//tang dan
        return (o.ma).compareTo(ma);//giam dan
        
        //sap xep theo gia  double
        //return Double.compare(gia, o.gia);
        //sap xep theo so nguyen
        //return nam-o.nam;
        
        
    }
}
