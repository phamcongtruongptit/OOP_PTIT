package acket1;

public class hoa_Don {
    private String mahd;
    private KhachHang nguoimua ; 
    private matHang sanphan ; 
    private int soluong ;
    public hoa_Don(KhachHang nguoimua, matHang sanphan, int soluong) {
        this.nguoimua = nguoimua;
        this.sanphan = sanphan;
        this.soluong = soluong;
    }
    @Override
    public String toString() {
        return mahd+ " " + nguoimua + " " + sanphan + " ";
    } 
    
    
}
