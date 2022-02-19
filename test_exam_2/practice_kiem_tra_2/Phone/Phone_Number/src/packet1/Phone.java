package packet1;

public class Phone implements IViet {
    private String ma_vung , sdt ;

    public Phone(String ma_vung, String sdt) {
        this.ma_vung = ma_vung;
        this.sdt = sdt;
    }

    public String getMa_vung() {
        return ma_vung;
    }

    public void setMa_vung(String ma_vung) {
        this.ma_vung = ma_vung;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return ma_vung+ " - "+ sdt;
    }

    @Override
    public void out() {
        System.out.println("0"+ ma_vung+ " - " + sdt);
    } 
    
    
    
}
