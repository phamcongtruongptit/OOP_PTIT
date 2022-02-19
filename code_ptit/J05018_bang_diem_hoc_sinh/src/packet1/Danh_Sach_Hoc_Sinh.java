package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Danh_Sach_Hoc_Sinh {
    public ArrayList<Hoc_Sinh> M = new ArrayList<Hoc_Sinh>();

    public void input(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ; 
        scanner.nextLine();
        for(int i = 1; i<=n ; i++){
            String ten  = scanner.nextLine() ;
            String []diem = scanner.nextLine().split("\\s+") ; 
            Hoc_Sinh t = new Hoc_Sinh(i , ten , diem); 
            M.add(t) ; 
        }
    }
    public void sort(){
        for(int  i = 0 ; i< M.size()-1 ; i++){
            for(int j = i+1 ; j < M.size() ; j++){
                if(M.get(i).getDiem_tb() < M.get(j).getDiem_tb()){
                    Collections.swap(M, i, j);
                } else if(M.get(i).getDiem_tb() == M.get(j).getDiem_tb()) {
                    if(M.get(i).getMa_hs().compareToIgnoreCase(M.get(j).getMa_hs()) < 0) {
                    Collections.swap(M, i, j);
                    }
                }
            }
        }
    }

    public void output(){
        Collections.sort(M);
        for (Hoc_Sinh hoc_Sinh : M) {
            System.out.println(hoc_Sinh);
        }
    }
    
}
