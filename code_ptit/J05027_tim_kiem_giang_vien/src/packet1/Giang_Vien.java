package packet1;

import java.text.DecimalFormat;

public class Giang_Vien {
    private String ma_gv , ten , bo_mon ; 
    
    private String tinh_bo_mon(String s){
        String []M = s.split("\\s+");
        String ans = "" ; 
        for(int i=0; i<M.length; i++){
            ans += M[i].charAt(0) ; 
        }
        return ans.toUpperCase();
    }

    private String chuan_hoa_magv(int n){
        DecimalFormat fomat = new DecimalFormat("00");
        return "GV" + fomat.format(n) ;
    }

    public Giang_Vien(int n, String ten , String bo_mon ){
        this.ma_gv = chuan_hoa_magv(n);
        this.ten  = ten;
        this.bo_mon = tinh_bo_mon(bo_mon) ;
    }

    public String getTen(){
        return ten;
    }

    public String toString(){
        return ma_gv + " "  + ten+ " "  + bo_mon ; 
    }

}
