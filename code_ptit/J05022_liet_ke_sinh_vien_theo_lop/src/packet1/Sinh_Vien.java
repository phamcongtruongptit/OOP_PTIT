package packet1;

public class Sinh_Vien {
    private String ma_sv , ho_ten , lop  , email ; 

    public Sinh_Vien (String ma_sv ,String ho_ten , String lop ,String email){
        this.ma_sv = ma_sv;
        this.ho_ten = ho_ten;
        this.email = email;
        this.lop = lop;
    }
    public String getLop(){
        return lop ; 
    }
    public String toString(){
        return ma_sv + " " + ho_ten  + " " + lop + " " + email ; 
    }

}

