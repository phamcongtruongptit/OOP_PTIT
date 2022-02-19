package packet1;

import java.util.ArrayList;
import java.util.Scanner;
public class Danh_Sach_Nhan_Vien {
    private ArrayList<Nhan_Vien> M = new ArrayList<Nhan_Vien>();
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ;
        scanner.nextLine();
        for(int i = 1 ; i <= n ; i++){
            Nhan_Vien T = new Nhan_Vien(i,scanner.nextLine() , scanner.nextLine() , scanner.nextLine() , scanner.nextLine() , scanner.nextLine() , scanner.nextLine() ) ;
            M.add(T);
        }
    }


    public void output(){
        for (Nhan_Vien nhan_Vien : M) {
            System.out.println(nhan_Vien);
        }
    }
}
