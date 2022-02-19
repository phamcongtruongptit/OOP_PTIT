package packet1;

import java.text.DecimalFormat;

public class Sinh_Vien {
    private String ma , ten , lop , ngay_sinh ;
    private double gpa ;  
    private String chuan_hoa_ma(int n){
        DecimalFormat fomat = new DecimalFormat("000")  ; 
        return "B20DCCN" + fomat.format(n) ; 
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

    public Sinh_Vien(int ma , String ten , String lop , String ngay_sinh , double gpa){
        this.ma = chuan_hoa_ma(ma);
        this.ten = ten ;
        this.lop = lop ;
        this.ngay_sinh = chuan_hoa_birthday(ngay_sinh);
        this.gpa = gpa ; 
    }
    public String toString(){
        return ma + " " + ten + " " + lop + " " + ngay_sinh + " " + String.format("%.2f", gpa) ; 
    }
}
