package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Danh_Sach_Sinh_Vien {
    private ArrayList<Sinh_Vien> M = new ArrayList<Sinh_Vien>();
    private ArrayList<String> Q = new ArrayList<>();

    public void input(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine() ; 
        for(int i = 1 ; i <=n ; i++){
            Sinh_Vien X = new Sinh_Vien(i , scanner.nextLine() , scanner.nextLine() , scanner.nextLine() , scanner.nextLine() , scanner.nextLine() );
            M.add(X);
        }
        int q = scanner.nextInt() ;
        while(q-->0){
            Q.add(scanner.next());
        }
    }
    public void sort(){
        Collections.sort(M , new Comparator<Sinh_Vien>(){
            public int  compare(Sinh_Vien a, Sinh_Vien b){
                if(a.getMsv().compareTo(b.getMsv()) > 0) return 1 ; 
                else if(a.getMsv().compareTo(b.getMsv()) < 0) return -1 ; 
                else return 0; 
                
            }
    } );
}


    public void output(){
        for(int i  = 0 ; i< Q.size() ; i++){
            for(int j = 0 ; j<M.size() ; j++){
                if(Q.get(i).equals(M.get(j).getDoanh_Nghiep())) System.out.println(M.get(j));
            }
        }
    }
}
