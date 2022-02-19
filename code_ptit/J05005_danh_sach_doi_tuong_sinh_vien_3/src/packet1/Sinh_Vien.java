package packet1;
import java.text.DecimalFormat;
public class Sinh_Vien {
    private String id , name , grade ;
    private String birthday;
    private double gpa ; 

    private String chuan_hoa_name(String s){
        s = s.trim();
        s = s.toLowerCase() ;  
        s = s.replaceAll("\\s+" , " ");
        String []M = s.split(" ");
        String ans = "" ;
        for(int i = 0 ; i<M.length ; i++){
            ans+= Character.toUpperCase(M[i].charAt(0))+ M[i].substring(1) + " " ;  
        }
        return ans.trim();
    }

    private String chuan_hoa_birthday(String s){
        String ngay  = s.substring( 0 , s.indexOf("/")) ; 
        String thang = s.substring( s.indexOf("/")+1 , s.lastIndexOf("/")) ; 
        String nam = s.substring(s.lastIndexOf("/") +1 ) ; 
        String ans = "" ;
        if(ngay.length()<2){
            for(int  i =1 ; i<=(2-ngay.length()) ; i++){
                ans+="0"  ; 
            }
            ans+= ngay  ; 
        } else if(ngay.length()>2) {
            ans+=ngay.substring(ngay.length()-2) ; 
        } else{
            ans+= ngay ; 
        }
        ans+="/" ; 
        if(thang.length()<2){
            for(int  i =1 ; i<=(2-thang.length()) ; i++){
                ans+="0"  ; 
            }
            ans+= thang  ; 
        } else if(thang.length()>2) {
            ans+=thang.substring(thang.length()-2) ; 
        } else{
            ans+= thang ; 
        }
        ans+="/" ; 
        if(nam.length()<4){
            for(int  i =1 ; i<=(4-nam.length()) ; i++){
                ans+="0"  ; 
            }
            ans+= nam  ; 
        } else if(nam.length()>4) {
            ans+=nam.substring(nam.length()-4) ; 
        } else{
            ans+= nam; 
        }
        return ans; 
    }
    private String chuan_hoa_ma(int n){
        DecimalFormat fomat = new DecimalFormat("000")  ; 
        return "B20DCCN" + fomat.format(n) ; 
    }

    public Sinh_Vien(){
        this.id = "" ; this.name = "" ; this.grade = ""  ; this.gpa = 0; this.birthday = "" ; 
    }
    public Sinh_Vien(int n , String name , String grade , String birthday , double gpa ){
        // this.id = "B20DCCN" + String.format("%.3d", n) ; 
        this.id = chuan_hoa_ma(n) ; 
        this.name = chuan_hoa_name(name) ;
        this.grade = grade ;
        this.birthday  = chuan_hoa_birthday(birthday);
        this.gpa = gpa ; 
    }
    public static int compareGPA(Sinh_Vien a , Sinh_Vien b ){
        if(a.gpa < b.gpa) return -1 ;
        else  return 1 ; 
    }
    public String toString(){
        return id + " " + name +" " + grade + " " + birthday + " "+ String.format("%.2f", gpa) ; 
    }
    
}
