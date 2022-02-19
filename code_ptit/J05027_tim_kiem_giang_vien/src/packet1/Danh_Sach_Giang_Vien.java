package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Danh_Sach_Giang_Vien {
    private ArrayList<Giang_Vien> M = new ArrayList<Giang_Vien>();
    private Scanner scanner = new Scanner(System.in);

    public void input(){
        int t = scanner.nextInt()  ; 
        scanner.nextLine() ;
        for(int i = 1  ; i<=t ; i++){
            Giang_Vien x = new Giang_Vien(i , scanner.nextLine() , scanner.nextLine()) ; 
            M.add(x) ; 
        }
    }

    public void output(){
        int n = scanner.nextInt() ;
        scanner.nextLine() ; 
        String []tv = new String[n] ; 
        for(int i = 0 ; i < n ; i++){
            tv[i] = scanner.nextLine() ;
        }
        for(int  i = 0 ; i < n ; i++){
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n" , tv[i]);
            for(int j = 0 ; j<M.size() ; j++){
                if(M.get(j).getTen().toLowerCase().contains(tv[i].toLowerCase())){
                    System.out.println(M.get(j));
                }
            }
        }

    }
}
