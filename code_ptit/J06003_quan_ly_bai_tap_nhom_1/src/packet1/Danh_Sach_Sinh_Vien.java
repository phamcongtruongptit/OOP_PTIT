package packet1;

import java.util.ArrayList;
import java.util.Scanner;

public class Danh_Sach_Sinh_Vien {
    private ArrayList<Sinh_Vien> SV = new ArrayList<Sinh_Vien>();
    private ArrayList<Integer> Q = new ArrayList<Integer>();
    private ArrayList<Nhom> NO = new ArrayList<Nhom>();
    private int n , m ,q ; 
    
    public void inout(){
        Scanner scanner  = new Scanner(System.in);
        n  = scanner.nextInt() ;
        m = scanner.nextInt() ;
        scanner.nextLine() ; 
        while(n-->0){
            Sinh_Vien X = new Sinh_Vien(scanner.nextLine() , scanner.nextLine() , scanner.nextLine() , Integer.parseInt(scanner.nextLine())) ; 
            SV.add(X) ; 
        }
        for(int i = 1 ; i<=m ; i++){
            Nhom K = new Nhom(i , scanner.nextLine()) ; 
            NO.add(K) ; 
        }
        q = scanner.nextInt() ;
        while(q-->0){
            Q.add(scanner.nextInt()) ; 
        }
    }

    public void output(){
        for(int i = 0 ; i<q ; i++){
            System.out.printf("DANH SACH NHOM %d:\n" , Q.get(i));
            for(int  j = 0 ; j<SV.size() ; j++){
                if(SV.get(j).getNhom() == Q.get(i)) System.out.println(SV.get(j));
            }
            System.out.printf("Bai tap dang ky: %s\n" , );
        }
    }

}
