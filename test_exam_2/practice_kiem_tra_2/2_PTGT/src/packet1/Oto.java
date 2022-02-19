package packet1;

import java.util.Calendar;

public class Oto extends PTGT implements TinhGia {
    private String kieu  ; 
    private int SoCho ; 
    
    public Oto(String ma, String hang, int nam, double gia, String mau, String kieu, int soCho) {
        super(ma, hang, nam, gia, mau);
        this.kieu = kieu;
        this.SoCho = soCho;
    }

    public Oto(String kieu, int soCho) {
     
    }

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
    }

    public int getSoCho() {
        return SoCho;
    }

    public void setSoCho(int soCho) {
        SoCho = soCho;
    }

    public double getGia() {
        Calendar cal = Calendar.getInstance(); // tra ve thoi gian hien thoi
        int year = cal.get(Calendar.YEAR) ; // lay nam
        if(year - super.getNam() >= 2) {
            return super.getGia() * 0.85 ; 
        } 
        else return super.getGia();
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getHang() + "\t" + super.getNam() + "   " + getGia()+ "   " + super.getMau() + "   " +kieu + "   "+SoCho;
    }
    
}
