package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Danh_Sach_Nguoi_Choi {
    private ArrayList<Nguoi_Choi> M = new ArrayList<Nguoi_Choi>();
    

    public void input(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine() ;  
        for(int i = 0; i < n; i++){ 
            Nguoi_Choi T = new Nguoi_Choi(scanner.nextLine() , scanner.nextLine() , scanner.nextLine() , scanner.nextLine());
            M.add(T) ; 
        }
    }
    public void sort(){
        for(int i = 0 ; i<M.size()-1 ; i++){ 
            for(int j = i+1 ; j<M.size() ; j++){
                if(M.get(i).compareTo(M.get(j)) < 0 ){
                    Collections.swap(M, i, j);
                }
            }
        }
    }
    public void output(){
        for (Nguoi_Choi nguoi_Choi : M) {
            System.out.println(nguoi_Choi);
            
        }
    }

    
}
