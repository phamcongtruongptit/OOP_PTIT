package model;

import control.DienthoaiException;
import control.TrongException;
import java.io.Serializable;

public class NhanVien implements Serializable{
    //Nhân viên bán hàng (mã NV, Họ tên, địa chỉ, Số ĐT)
    private int ma ; 
    private String hoten , diachi ,sdt ;
    private int sma = 1000 ; 

    public NhanVien() {
    }

    public NhanVien( String hoten, String diachi, String sdt) throws TrongException, DienthoaiException {
        if(hoten.isEmpty() || this.diachi.isEmpty()) throw  new TrongException() ; 
        if(!sdt.matches("\\d+")) throw  new DienthoaiException() ; 
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getSma() {
        return sma;
    }

    public void setSma(int sma) {
        this.sma = sma;
    }
    
    
    public  Object[] toObject(){
        return new Object[]{
            ma , hoten , diachi , sdt 
        } ; 
    }
           
}
