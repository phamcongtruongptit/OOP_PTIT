package packet1;

public class Sinh_Vien {
    private int  stt ; 
    private String msv , ho_ten , lop , email , doanh_Nghiep ; 

    public Sinh_Vien(int stt , String msv , String ho_ten , String lop , String email , String doanh_Nghiep ){
        this.stt = stt ; 
        this.msv = msv ; 
        this.ho_ten = ho_ten ; 
        this.lop = lop  ; 
        this.email = email ;  
        this.doanh_Nghiep = doanh_Nghiep ; 
    }

    public String getDoanh_Nghiep(){
        return doanh_Nghiep ; 
    }
    public String getHo_ten(){
        return ho_ten ; 
    }
    public String toString(){
        return stt  + " " + msv + " " + ho_ten + " " + lop  + " " + email + " " + doanh_Nghiep  ; 
    }
    
}
