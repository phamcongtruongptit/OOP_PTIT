package packet1;

import java.util.Scanner;

public class Sinh_Vien {
    private String name;
    private String lop; 
    private String birthday ; 
    private float gpa  ; 

    public void input(){
        Scanner scanner = new Scanner(System.in); 
        name = scanner.nextLine() ; 
        lop = scanner.nextLine() ; 
        birthday = scanner.nextLine() ; 
        gpa = scanner.nextFloat() ; 
    }

    public Sinh_Vien(){
        this.name = "";
        this.lop ="" ; 
        this.birthday ="" ; 
        this.gpa = 0 ; 
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
    
    public void output(){
        System.out.printf("B20DCCN001 %s %s %s %.2f\n" , name, lop , chuan_hoa_birthday(birthday) , gpa);
    }

}
