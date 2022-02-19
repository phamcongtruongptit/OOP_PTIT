package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author phamc
 */
public class DangKy implements  Serializable{
    private MonHoc monhoc  ; 
    private  GiangVien giangvien ; 
    private int solop ; 
    private String ngaydangki ; 

    public DangKy(MonHoc monhoc, GiangVien giangvien, int solop, String ngaydangki) {
        this.monhoc = monhoc;
        this.giangvien = giangvien;
        this.solop = solop;
        this.ngaydangki = ngaydangki;
    }

    public MonHoc getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(MonHoc monhoc) {
        this.monhoc = monhoc;
    }

    public GiangVien getGiangvien() {
        return giangvien;
    }

    public void setGiangvien(GiangVien giangvien) {
        this.giangvien = giangvien;
    }

    public int getSolop() {
        return solop;
    }

    public void setSolop(int solop) {
        this.solop = solop;
    }

    public String getNgaydangki() {
        return ngaydangki;
    }

    public void setNgaydangki(String ngaydangki) {
        this.ngaydangki = ngaydangki;
    }
    public Object[] tobObject(){ // copy duoc
        return new  Object[]{
            monhoc.getMamh() , monhoc.getTenmh() ,  giangvien.getMagv() ,giangvien.getHoten() ,solop , ngaydangki
        } ; 
    }
    public int getnamdangky(){
        String []l = ngaydangki.split("/") ; 
        return Integer.parseInt(l[l.length-1]) ; 
    }
}
