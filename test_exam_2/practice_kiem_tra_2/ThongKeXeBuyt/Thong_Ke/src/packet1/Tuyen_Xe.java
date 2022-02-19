package packet1;

public class Tuyen_Xe {
    private String ma , hoten ; 
    private int doanhthu ;
    public String getMa() {
        return ma;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public int getDoanhthu() {
        return doanhthu;
    }
    public void setDoanhthu(int doanhthu) {
        this.doanhthu = doanhthu;
    }
    public Tuyen_Xe(String ma, String hoten, int doanhthu) {
        this.ma = ma;
        this.hoten = hoten;
        this.doanhthu = doanhthu;
    } 
    

}
