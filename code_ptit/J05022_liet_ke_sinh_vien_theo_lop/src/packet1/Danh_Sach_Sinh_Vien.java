package packet1;

import java.util.ArrayList;
import java.util.Scanner;

public class Danh_Sach_Sinh_Vien {
    private ArrayList<Sinh_Vien> M = new ArrayList<Sinh_Vien>() ; 
    private ArrayList<String> TV = new ArrayList<String>() ; 
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ; 
        scanner.nextLine() ;
        for(int i = 1; i<=n ; i++){
            Sinh_Vien T = new Sinh_Vien(scanner.nextLine() , scanner.nextLine() , scanner.nextLine() , scanner.nextLine() );
            M.add(T) ; 
        }
        int q = scanner.nextInt() ; 
        scanner.nextLine() ;
        for(int i = 1; i<= q ; i++){
            TV.add(scanner.nextLine()) ; 
        }
    }

    public void output(){
        for(int i = 0 ; i<TV.size() ; i++){
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n" , TV.get(i));
            for(int  j = 0 ; j<M.size() ; j++){
                if(M.get(j).getLop().equals(TV.get(i))) System.out.println(M.get(j));
            }
        }
    }
}