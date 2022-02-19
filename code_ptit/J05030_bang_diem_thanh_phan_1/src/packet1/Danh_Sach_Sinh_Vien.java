package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Danh_Sach_Sinh_Vien {
    private ArrayList<Sinh_Vien> M = new ArrayList<Sinh_Vien> () ;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt() ;
        scanner.nextLine() ; 
        for(int i = 0 ; i < n ; i++){
            Sinh_Vien x = new Sinh_Vien(scanner.nextLine() , scanner.nextLine() , scanner.nextLine() , scanner.nextFloat() , scanner.nextFloat() , scanner.nextFloat());
            M.add(x) ; 
            scanner.nextLine() ; 
        }
    }

    public void output(){
        Collections.sort(M) ; 
        for (int i =0 ; i<M.size() ; i++) {
            System.out.println(i+1+ " " + M.get(i));
        }
    }
}
