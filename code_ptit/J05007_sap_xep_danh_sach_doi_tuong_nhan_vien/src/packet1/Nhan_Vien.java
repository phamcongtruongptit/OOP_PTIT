package packet1;
import java.text.DecimalFormat;
public class Nhan_Vien {
    private String id , name , gender , birthday , address , id_thue , day_signed ;     

    private String chuan_hoa_id(int n){
        DecimalFormat fomat  = new DecimalFormat("00000");
        return fomat.format(n) ; 
    }
    
    public Nhan_Vien(int id ,String name ,String gender ,String birthday ,String address ,String id_thue ,String day_signed ){
        this.id  = chuan_hoa_id(id);
        this.name = name ;
        this.gender = gender ;
        this.birthday = birthday ;
        this.address = address ;
        this.id_thue = id_thue ;
        this.day_signed = day_signed ;
    }

    public String toString(){
        return id + " " + name +" " + gender + " " + birthday + " " + address + " " + id_thue + " " + day_signed;
    }

    public static int compateBirth(Nhan_Vien a , Nhan_Vien b){
        String A = a.birthday ; String B = b.birthday;
        String day_a = A.substring(0 , A.indexOf("/"));
        String day_b = B.substring(0 , B.indexOf("/"));
        String month_a = A.substring(A.indexOf("/"  + 1) , A.lastIndexOf("/"));
        String month_b = B.substring(B.indexOf("/"  + 1) , B.lastIndexOf("/"));
        String year_a = A.substring(A.lastIndexOf("/") + 1) ; 
        String year_b = B.substring(B.lastIndexOf("/") + 1) ; 
             if(year_a.compareTo(year_b)<0) return -1 ; 
        else if(year_a.compareTo(year_b)>0 ) return 1  ; 
        else if(month_a.compareTo(month_b)<0) return -1 ;
        else if(month_a.compareTo(month_b)>0 ) return 1 ;
        else if(day_a.compareTo(day_b)<0) return -1 ; 
        else if(day_a.compareTo(day_b)>0 ) return 1 ;
        else  return 0 ; 
    }

}
