package packet1;

public class Sinh_Vien {
    private String ma_sv , ho_ten , lop  , email ; 

    public Sinh_Vien (String ma_sv ,String ho_ten , String lop ,String email){
        this.ma_sv = ma_sv;
        this.ho_ten = ho_ten;
        this.email = email;
        this.lop = lop;
    }
    public String getNganh(){
        return ma_sv.substring(3,7) ; 
    }//b19DCCN012
    public String getHeDaoTao(){
        return lop.substring(0,1) ; 
    }

    public String toString(){
        return ma_sv + " " + ho_ten  + " " + lop + " " + email ; 
    }

}


