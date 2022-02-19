package model;

import java.io.Serializable;

/**
 *
 * @author phamc
 */
public class QLMS implements Serializable{
    private BanDoc bandoc ; 
    private Sach sach ; 
    private int soluong ; 
    private String tinhtrang ; 

    public QLMS() {
    }

    public QLMS(BanDoc bandoc, Sach sach, int soluong, String tinhtrang) {
        this.bandoc = bandoc;
        this.sach = sach;
        this.soluong = soluong;
        this.tinhtrang = tinhtrang;
    }

    public BanDoc getBandoc() {
        return bandoc;
    }

    public void setBandoc(BanDoc bandoc) {
        this.bandoc = bandoc;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    public Object[] toObject(){
        return new Object[]{
            bandoc.getMa() , bandoc.getHoten() , sach.getMasach() , soluong , tinhtrang
        } ; 
    }
}
