package packet1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
public class Danh_Sach_Nhan_Vien {
    private ArrayList<Nhan_Vien> M = new ArrayList<Nhan_Vien>();
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine() ; 
        for(int  i = 1 ; i<=n ; i++){
            Nhan_Vien T = new Nhan_Vien(i , scanner.nextLine() , scanner.nextLine() , Integer.parseInt(scanner.nextLine()) , Integer.parseInt(scanner.nextLine()));
            M.add(T);
        }
    }

    public void sort(){
        Collections.sort(M , new Comparator<Nhan_Vien>(){
           public int compare(Nhan_Vien a , Nhan_Vien b ){
               if(a.getThu_Nhap() - b.getThu_Nhap() < 0) return 1 ; 
               else if(a.getThu_Nhap() - b.getThu_Nhap() > 0) return -1 ; 
               else return 0 ; 
            } 
        });
    }


    public void output(){
        for (Nhan_Vien nhan_Vien : M) {
                System.out.println(nhan_Vien);
        }
    }
}
