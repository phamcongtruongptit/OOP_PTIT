package packet1;
import java.util.ArrayList;
import java.util.Scanner;
public class Danh_Sach_Nhan_Vien {
    private ArrayList<Nhan_Vien> M = new ArrayList<Nhan_Vien>();
    private String liet_ke ; 
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine() ; 
        for(int  i = 1 ; i<=n ; i++){
            Nhan_Vien T = new Nhan_Vien(i , scanner.nextLine() , scanner.nextLine() , Integer.parseInt(scanner.nextLine()) , Integer.parseInt(scanner.nextLine()));
            M.add(T);
        }
        liet_ke = scanner.nextLine() ;
    }
    public void output(){
        for (Nhan_Vien nhan_Vien : M) {
            if(nhan_Vien.getChuc_vu().equals(liet_ke))
                System.out.println(nhan_Vien);
        }
    }
}
