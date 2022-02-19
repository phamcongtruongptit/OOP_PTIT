package packet1;

public class Noi_Thanh extends Tuyen_Xe {
   
    private String so_hieu   ; 
    private int so_tuyen_di_duoc ;
    public Noi_Thanh(String ma, String hoten, int doanhthu, String so_hieu, int so_tuyen_di_duoc) {
        super(ma, hoten, doanhthu);
        this.so_hieu = so_hieu;
        this.so_tuyen_di_duoc = so_tuyen_di_duoc;
    }
    @Override
    public String toString() {
        return super.getMa() + " " + super.getHoten() + " " + super.getDoanhthu() + " " +  so_hieu +  " " + so_tuyen_di_duoc;
    }
    public String getSo_hieu() {
        return so_hieu;
    }
    public void setSo_hieu(String so_hieu) {
        this.so_hieu = so_hieu;
    }
    public int getSo_tuyen_di_duoc() {
        return so_tuyen_di_duoc;
    }
    public void setSo_tuyen_di_duoc(int so_tuyen_di_duoc) {
        this.so_tuyen_di_duoc = so_tuyen_di_duoc;
    } 
    
    
}
