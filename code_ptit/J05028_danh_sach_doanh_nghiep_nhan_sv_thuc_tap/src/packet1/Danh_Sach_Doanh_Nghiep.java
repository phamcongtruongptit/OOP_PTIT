package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Danh_Sach_Doanh_Nghiep {
    private ArrayList<Doanh_Nghiep> M = new ArrayList<Doanh_Nghiep>();
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1 ; i<=n ; i++){
            Doanh_Nghiep x = new Doanh_Nghiep(scanner.nextLine(), scanner.nextLine() , scanner.nextInt() ) ; 
            scanner.nextLine() ; 
            M.add(x) ; 
        }
    }

    public void sort(){
        Collections.sort(M);
    }
    public void out(){
        for (Doanh_Nghiep doanh_Nghiep : M) {
            System.out.println(doanh_Nghiep);
        }
    }
}
