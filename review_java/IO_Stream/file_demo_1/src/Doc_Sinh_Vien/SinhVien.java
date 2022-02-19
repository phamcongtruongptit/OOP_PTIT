public class SinhVien {
    private int ma ; 
    private String hoTen ;
    public SinhVien(int ma, String hoTen) {
        this.ma = ma;
        this.hoTen = hoTen;
    }
    @Override
    public String toString() {
        return ma + ", "+ hoTen;
    }
    
    
}
