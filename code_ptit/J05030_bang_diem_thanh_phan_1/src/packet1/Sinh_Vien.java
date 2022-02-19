package packet1;

public class Sinh_Vien implements Comparable<Sinh_Vien> {
     private String ma_sv , ten  , lop ; 
     private float d1,d2,d3 ; 
     public Sinh_Vien(String ma_sv , String ten ,String lop ,float d1 ,float d2 ,float d3 ){
         this.ma_sv = ma_sv ; 
         this.ten = ten ; 
         this.lop = lop ; 
         this.d1 = d1 ; 
         this.d2 = d2 ; 
         this.d3 = d3 ; 
     }
     public String toString(){
         return ma_sv + " " + ten + " " + lop + " " + String.format("%.1f", d1) + " " + String.format("%.1f", d2) + " "+ String.format("%.1f", d3) ;
     }
    public int compareTo(Sinh_Vien o){
        // return this.ma_sv.compareTo(o.ma_sv) ; 
        return this.ten.compareTo(o.ten) ; 
    }
}
