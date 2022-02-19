package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Danh_Sach_Sinh_Vien {
    private ArrayList<Sinh_Vien> M = new ArrayList<Sinh_Vien>() ; 
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
                Sinh_Vien x = new Sinh_Vien(scanner.nextLine() ,scanner.nextLine() ,scanner.nextLine() ,scanner.nextLine() ) ; 
                M.add(x) ; 
            
        }
    }

    public void sort(){
        for(int i = 0 ; i<M.size() -1 ; i++){
            for(int j = i+1 ; j<M.size() ; j++){
                if(Sinh_Vien.compare(M.get(i), M.get(j)) < 0) Collections.swap(M, i, j);
            }
        }
    }

    public void output(){
        for (Sinh_Vien sinh_Vien : M) {
            System.out.println(sinh_Vien);
        }
    }
}
