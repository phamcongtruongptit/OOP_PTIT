package packet1;

public class GiaoDich {
    private String ma ; 
    private int ngay , thang , nam  , so_luong , don_gia ; 
    private double tien ;
    public GiaoDich(String ma, int ngay, int thang, int nam, int so_luong, int don_gia) {
        this.ma = ma;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.so_luong = so_luong;
        this.don_gia = don_gia;
    }
    public String getMa() {
        return ma;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
    public int getNgay() {
        return ngay;
    }
    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    public int getThang() {
        return thang;
    }
    public void setThang(int thang) {
        this.thang = thang;
    }
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
    public int getSo_luong() {
        return so_luong;
    }
    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }
    public int getDon_gia() {
        return don_gia;
    }
    public void setDon_gia(int don_gia) {
        this.don_gia = don_gia;
    }
    public double getTien() {
        return tien;
    }
    public void setTien(double tien) {
        this.tien = tien;
    } 
    
}
