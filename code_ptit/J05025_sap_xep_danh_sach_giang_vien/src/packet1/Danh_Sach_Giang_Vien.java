package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Danh_Sach_Giang_Vien {
    ArrayList<Giang_Vien> M = new ArrayList<Giang_Vien>();

    public void input(){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt()  ; 
        scanner.nextLine() ;
        for(int i = 1  ; i<=t ; i++){
            Giang_Vien x = new Giang_Vien(i , scanner.nextLine() , scanner.nextLine()) ; 
            M.add(x) ; 
        }
    }

    public void sort(){
        for(int i = 0 ; i<M.size() - 1 ; i++){
            for(int j = i+1 ; j<M.size() ; j++){
                if(Giang_Vien.cmp(M.get(i), M.get(j)) < 0){
                    Collections.swap(M, i, j);
                }
            }
        }
    }

    public void output(){
        for (Giang_Vien giang_Vien : M) {
            System.out.println(giang_Vien);
        }
    }
}
