package packet1;
import java.text.DecimalFormat;

public class Hoc_Sinh implements Comparable<Hoc_Sinh>{
    private String ma_hs , ten , xep_loai ; 
    private double diem_tb ; 

    private String chuan_hoa_ma_hs(int n){
        DecimalFormat fomat = new DecimalFormat("00") ; 
        return "HS" + fomat.format(n) ;
    }

    private double tinh_diem_tb(String diem[]){
        double sum = 0; 
        for(int i = 0 ; i<10 ; i++){
            if(i==0 || i==1) sum += (Double.parseDouble(diem[i])*2);
            else sum+= Double.parseDouble(diem[i]);  
        }
        return  Math.round((sum/(diem.length+2))*10.0)/10.0 ; 
    }

    private String tim_xep_loai(double n){
        if(n>=9.0) return "XUAT SAC" ; 
        else if(n>=8.0 ) return "GIOI" ; 
        else if(n>=7.0 ) return "KHA" ; 
        else if(n>=5.0 ) return "TB" ; 
        else return "YEU" ; 
    }

    public Hoc_Sinh(int n , String ten, String diem[]){
        this.ma_hs = chuan_hoa_ma_hs(n) ; 
        this.ten =  ten ;
        this.diem_tb = tinh_diem_tb(diem);
        this.xep_loai = tim_xep_loai(this.diem_tb) ; 
    }

    public String toString(){
        return ma_hs + " " + ten  + " " + String.format("%.1f",diem_tb) + " "  +xep_loai ; 
    }

    public double getDiem_tb(){
        return diem_tb ; 
    }
    public String getMa_hs(){
        return ma_hs ; 
    }
    public int compareTo(Hoc_Sinh o) {
        if(this.diem_tb < o.diem_tb) return 1;
        if(this.diem_tb > o.diem_tb) return -1;
        else return
        this.ma_hs.compareTo(o.ma_hs);
    }
}
