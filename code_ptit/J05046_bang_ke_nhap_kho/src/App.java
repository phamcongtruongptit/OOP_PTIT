bang_ke_nhap_kho/DonHang.java
package bang_ke_nhap_kho;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DonHang {
    private String ten;
    private int ma;
    private long sl,gia;

    public DonHang() {
    }

    public DonHang(String ten, long sl, long gia) {
        this.ma = 1;
        this.ten = ten;
        this.sl = sl;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String Ma(){
        String ans = "";
        String [] a = ten.split("\\s+");
        ans = ans +  a[0].charAt(0) + a[1].toUpperCase(Locale.ROOT).charAt(0) + "";
        return ans;
    }

    public String taoMa(){
        return Ma() + String.format("%02d",ma) +"";
    }

    private long chietKhau(){
        double k = 0;
        if(sl > 10) k = 0.05;
        else if(sl <= 10 && sl >= 8) k = 0.02;
        else if(sl >= 5 && sl < 8) k= 0.01;
        else k = 0;
        return (long) (sl*gia*k);
    }

    private long thanhTien(){
        long totalPrice = sl*gia;
        return totalPrice - chietKhau();
    }

    @Override
    public String toString() {
        return taoMa() + " " + ten + " " + chietKhau() + " " + thanhTien();
    }
}

bang_ke_nhap_kho/main_donHang.java
package bang_ke_nhap_kho;

import java.util.*;
import java.util.Collections;

public class main_donHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        ArrayList<DonHang> list  = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        while(n-->0){
            DonHang a = new DonHang(sc.nextLine(),sc.nextLong(),sc.nextLong());
            sc.nextLine();
            if(map.containsKey(a.Ma())){
                int k = map.get(a.Ma()).intValue();
                a.setMa(k+1);
            }
            map.put(a.Ma(),a.getMa());
            list.add(a);
        }
        for(DonHang c : list){
            System.out.println(c);
        }
    }
    /*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
     */
}

