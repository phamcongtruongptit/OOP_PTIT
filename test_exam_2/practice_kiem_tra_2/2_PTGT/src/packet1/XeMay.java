package packet1;

import java.util.Calendar;

public class XeMay extends PTGT implements TinhGia{
    private double CongSuat ;

    public XeMay(String ma, String hang, int nam, double gia, String mau , double CongSuat) {
        super(ma, hang, nam, gia, mau);
        this.CongSuat = CongSuat ; 
    }

    public XeMay() {
    }

    public double getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(double congSuat) {
        CongSuat = congSuat;
    }
    public double getGia() {
        Calendar cal = Calendar.getInstance(); // tra ve thoi gian hien thoi
        int year = cal.get(Calendar.YEAR) ; // lay nam
        if(year - super.getNam() >= 2) {
            return super.getGia() * 0.95 ; 
        } 
        else return super.getGia();
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getHang() + "\t" + super.getNam() + "\t" + getGia()+ "\t" + super.getMau() + "\t" +CongSuat;
    }
}
