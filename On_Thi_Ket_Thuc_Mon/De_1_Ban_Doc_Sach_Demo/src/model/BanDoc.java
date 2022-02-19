package model;

public class BanDoc {
    // mã sinh viên, Họ tên, địa chỉ, Số ĐT
    private int ma ; 
    private String hoten , diachi , sodt ; 
    private static  int sma = 10000 ; 
    public BanDoc() {
    }

    public BanDoc(int ma, String hoten, String diachi, String sodt) {
        this.ma = ma;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sodt = sodt;
    }
x                           
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

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BanDoc.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma , hoten , diachi , sodt 
        } ; 
    }
}
