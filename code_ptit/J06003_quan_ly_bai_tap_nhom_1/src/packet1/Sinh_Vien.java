package packet1;

public class Sinh_Vien {
    private String msv , ho_ten , sdt; 
    private int nhom  ; 

    public Sinh_Vien(String msv , String ho_ten , String sdt , int nhom ){
        this.msv = msv;
        this.ho_ten = ho_ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public int getNhom(){
        return nhom  ; 
    }
    public String toString() {
        return msv   + " " + ho_ten + " " + sdt ; 
    }
}
