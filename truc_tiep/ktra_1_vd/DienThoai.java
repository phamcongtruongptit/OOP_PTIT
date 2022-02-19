
package dienthoai;


public class DienThoai {
    //thuoc tính
    private String ma;
    private String ten;
    private double gia;
    private int soLuong;
    private boolean loai;
    
    public DienThoai() {
    }
    
    public DienThoai(String ma, String ten, double gia, 
            int soLuong, boolean loai) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.loai = loai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isLoai() {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }
    
    public String toString(){
        return (ma+"\t"+ten+"\t"+gia+"\t"+soLuong+"\t"+
                (gia*soLuong)+"\t"+(loai?"moi":"cu"));
    }
}
