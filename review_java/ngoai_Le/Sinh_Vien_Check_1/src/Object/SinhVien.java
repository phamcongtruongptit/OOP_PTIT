package Object;

import Exception.GpaEx;
import Exception.KhongRongEx;
import Exception.SoDuongEx;

public class SinhVien {
    private String hoten ; 
    private int  ma ; 
    private double gpa ;
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) { 
        this.hoten = hoten;
    }
    public int getMa() {
        return ma;
    }
    public void setMa(int ma) {
        this.ma = ma;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    // public SinhVien(String hoten, int ma, double gpa) throws KhongRongEx, SoDuongEx  , GpaEx{ // cach 1
    //     this.hoten = hoten;
    //     if(hoten.equals("")){
    //         throw new KhongRongEx("ten khong de trong") ; 
    //     }
    //     this.ma = ma;
    //     if(ma<=0)
    //         throw new SoDuongEx("Ma phai duong") ; 
    //     this.gpa = gpa;
    //     if(gpa<=0 || gpa >=4) {
    //         throw new GpaEx("GPA phai nam trong khoang 0 - 4") ; 
    //     }
    // }
    
    @Override
    public String toString() {
        return "SinhVien: " + hoten + " " + ma + " " + gpa;
        
    }
    public SinhVien(String hoten, int ma, double gpa) {
        this.hoten = hoten;
        this.ma = ma;
        this.gpa = gpa;
    }     
    
}
