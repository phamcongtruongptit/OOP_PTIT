package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Danh_Sach_Doanh_Nghiep {
    private ArrayList<Doanh_Nghiep> M = new ArrayList<Doanh_Nghiep>();
    private Scanner scanner = new Scanner(System.in);
    
    public void input(){
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1 ; i<=n ; i++){
            Doanh_Nghiep x = new Doanh_Nghiep(scanner.nextLine(), scanner.nextLine() , scanner.nextInt() ) ; 
            scanner.nextLine() ; 
            M.add(x) ; 
        }
    }

    
    
    public void out(){
        int n = scanner.nextInt();
        scanner.nextLine();
        String tv[] = new String[n] ; 
        for(int i = 0 ; i < n ; i++){
            tv[i] = scanner.nextLine();
        } 
        Collections.sort(M);

        for(int  i = 0 ; i<n ; i++){
            String []lim = tv[i].split("\\s+") ; 
            int a = Integer.parseInt(lim[0]) ; 
            int b = Integer.parseInt(lim[1]) ; 
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",a,b);
            for (Doanh_Nghiep dn : M) {
                if(dn.getSo_luong()>=a && dn.getSo_luong()<=b) System.out.println(dn);
            }
        }
        
    }
}
