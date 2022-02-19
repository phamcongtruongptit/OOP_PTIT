package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Danh_Sach_Nhan_Vien {
    private ArrayList<Nhan_Vien> M = new ArrayList<Nhan_Vien>();
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ;
        scanner.nextLine();
        for(int i = 1 ; i <= n ; i++){
            String a ,b, c, d,e,f ; 
            a = scanner.nextLine();
            b = scanner.nextLine() ;
            c = scanner.nextLine() ;
            d = scanner.nextLine() ;
            e = scanner.nextLine() ;
            f = scanner.nextLine() ;
            Nhan_Vien T = new Nhan_Vien(i,a,b,c,d,e,f); 
            M.add(T);
        }
    }

    public void sortBirth(){
        for(int i = 0 ; i < M.size()-1 ; i++){
            for(int j = i+1 ; j<M.size() ; j++){
                if(Nhan_Vien.compateBirth(M.get(i), M.get(j)) > 0){
                    Collections.swap(M, i, j);
                }
            }
        }
    }

    public void output(){
        for (Nhan_Vien nhan_Vien : M) {
            System.out.println(nhan_Vien);
        }
    }
}
