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
}
