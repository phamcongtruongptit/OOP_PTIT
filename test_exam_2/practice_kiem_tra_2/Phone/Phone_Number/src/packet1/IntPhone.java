package packet1;

public class IntPhone extends Phone implements IViet {

    private String ma_quoc_gia;

    public IntPhone( String ma_quoc_gia  ,String ma_vung, String sdt) {
        super(ma_vung, sdt);
        this.ma_quoc_gia = ma_quoc_gia;
    }

    @Override
    public void out() {
        System.out.println(ma_quoc_gia + " - "+ super.getMa_vung() + " - " + super.getSdt()) ;
    } 
}
