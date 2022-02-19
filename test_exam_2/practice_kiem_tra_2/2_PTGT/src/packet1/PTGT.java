package packet1;

import java.util.Comparator;

public class PTGT implements Comparable<PTGT> {
    private String ma,hang , mau ;
    private int nam ;
    private double gia ; 

    public PTGT(String ma , String hang , int nam , double gia , String mau){
        this.ma = ma;
        this.hang = hang;
        this.nam = nam;
        this.gia = gia;
        this.mau = mau;
    }
    public PTGT(){
        
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
    public String getMau() {
        return mau;
    }
    public void setMau(String mau) {
        this.mau = mau;
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
    @Override
    public int compareTo(PTGT o) {
     return ma.compareToIgnoreCase(o.ma); // sap xep theo tang dan
     //   return o.ma.compareToIgnoreCase(ma); // sap xep theo giam dan
      //  return nam - o.nam; // sap xep TANG DAN theo nam (int). int thi su dung dau tru chu khong su dung compareToIgnoreCase
   //   return Double.compare(gia, o.gia) ; // sap xep tang dan theo gia (Double)  
   // so sanh gia o day thi moi chi so sanh lop cha, chua chua so sanh o lop con
    }

  
    
}
