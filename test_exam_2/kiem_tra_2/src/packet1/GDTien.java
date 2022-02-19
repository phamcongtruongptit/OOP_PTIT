package packet1;

public class GDTien extends  GiaoDich implements ITinh_tien {
    private String loai_tien ; 
    public GDTien(String ma, int ngay, int thang, int nam, int so_luong, int don_gia , String loai_tien) {
        super(ma, ngay, thang, nam, so_luong, don_gia);
        this.loai_tien = loai_tien;
    }

    @Override
    public double getTien() {
        if(loai_tien.equalsIgnoreCase("USD")) return super.getDon_gia() * super.getSo_luong() * 23 ; 
        if(loai_tien.equalsIgnoreCase("EURO")) return super.getDon_gia() * super.getSo_luong()* 26 ; 
        return super.getDon_gia() * super.getSo_luong() ;
    }
 

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getNgay()+"/"+super.getThang()+"/"+super.getNam()+ "\t" +  super.getSo_luong() + "\t" + super.getDon_gia()+ "\t"  + loai_tien + "\t"  + getTien(); 
    }

    public String getLoai_tien() {
        return loai_tien;
    }

    public void setLoai_tien(String loai_tien) {
        this.loai_tien = loai_tien;
    }

  
}
