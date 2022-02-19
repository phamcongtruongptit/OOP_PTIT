package packet1;

public class GDVang extends GiaoDich implements ITinh_tien {
    private String loai_vang; 
    public GDVang(String ma, int ngay, int thang, int nam, int so_luong, int don_gia , String loai_vang) {
        super(ma, ngay, thang, nam, so_luong, don_gia);
        this.loai_vang = loai_vang;
    }

    @Override
    public double getTien() {
        if(loai_vang.equalsIgnoreCase("9999")) return super.getDon_gia() * super.getSo_luong() ; 
        if(loai_vang.equalsIgnoreCase("18K")) return super.getDon_gia() * super.getSo_luong()*0.8 ; 
        return super.getDon_gia() * super.getSo_luong()*0.6 ; //16k
    }

    @Override
    public String toString() {
        return super.getMa() + "\t" + super.getNgay()+"/"+super.getThang()+"/"+super.getNam()+ "\t" +  super.getSo_luong() + "\t" + super.getDon_gia()+ "\t"  + loai_vang + "\t"  + getTien(); 
    }

    
    
    
}
