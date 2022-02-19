package packet1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Quanly {
    ArrayList <Tuyen_Xe> list  ; 
    Scanner scanner = new Scanner(System.in);
    public Quanly() {
        list = new ArrayList<Tuyen_Xe>();
        list.add(new Noi_Thanh("HN123", "Truong", 10, "T12", 23)) ; 
        list.add(new Noi_Thanh("HN234", "Vinh", 18, "T14", 35)) ; 
        list.add(new Noi_Thanh("HN003", "Trung", 12, "T15", 14)) ; 
        list.add(new Noi_Thanh("HN125", "quan", 24, "T17", 23)) ; 
        list.add(new Noi_Thanh("HN005", "min", 324, "T17", 256)) ; 
        list.add(new Noi_Thanh("HN446", "habh", 234, "T12", 33)) ; 
        list.add(new Noi_Thanh("HN145", "dyc", 2323, "T15", 89)) ; 
    }

    public void thong_ke(){
        ArrayList<Noi_Thanh> n = new ArrayList<Noi_Thanh>(); 
        for (Tuyen_Xe x : list) {
            if(x instanceof Noi_Thanh) {
                n.add((Noi_Thanh)x) ; 
            }
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>() ; 
        for (Noi_Thanh noi_Thanh : n) {
            map.put(noi_Thanh.getSo_hieu(), 0);
        }
    

        Set<String> s = map.keySet();
        for (String string : s) {
            int value = map.get(string) ; 
            for (Noi_Thanh noi_Thanh : n) {
                if(noi_Thanh.getSo_hieu().equalsIgnoreCase(string)  && noi_Thanh.getSo_tuyen_di_duoc() > value) {
                    map.put(string , noi_Thanh.getSo_tuyen_di_duoc() ) ; 
                }
            }
        }
        for (String string : s) {
            System.out.println("Xe buyt chay duoc nhieu nhat co so hieu: " + string); 
            for (Noi_Thanh noi_Thanh : n) {
                int check = noi_Thanh.getSo_tuyen_di_duoc() ; 
                if(noi_Thanh.getSo_hieu().equalsIgnoreCase(string) &&  check == map.get(string)) {
                    System.out.println(noi_Thanh);
                }
            }
        }
        

    }
    
    
}
