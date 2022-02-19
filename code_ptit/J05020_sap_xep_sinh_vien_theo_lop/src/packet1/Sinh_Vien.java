package packet1;

public class Sinh_Vien {
    private String ma_sv , ho_ten , lop  , email ; 

    public Sinh_Vien (String ma_sv ,String ho_ten , String lop ,String email){
        this.ma_sv = ma_sv;
        this.ho_ten = ho_ten;
        this.email = email;
        this.lop = lop;
    }

    public static int compare(Sinh_Vien a , Sinh_Vien b ){
        if(a.lop.compareTo(b.lop) > 0) return -1 ; 
        else  if(a.lop.compareTo(b.lop) < 0) return 1 ; 
        else  if(a.lop.compareTo(b.lop) == 0) {
            if(a.ma_sv.compareTo(b.ma_sv) > 0) return -1 ; 
            else  if(a.ma_sv.compareTo(b.ma_sv) < 0) return 1 ; 
        }
        return 0 ; 
    }

    public String toString(){
        return ma_sv + " " + ho_ten  + " " + lop + " " + email ; 
    }

}
