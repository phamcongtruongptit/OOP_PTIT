package packet1;
import java.util.ArrayList;
import java.util.Scanner;

public class Danh_Sach_Sinh_Vien {
    public ArrayList<Sinh_Vien> M = new ArrayList<Sinh_Vien>();
    
    public void them_sinh_vien(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ;
        scanner.nextLine();
        int i =1 ; 
        while(i<=n){
            String ten , lop , ngay_sinh  ;
            double gpa  ;
            ten = scanner.nextLine();
            lop = scanner.nextLine();
            ngay_sinh = scanner.nextLine() ;
            gpa = scanner.nextDouble();
            scanner.nextLine();
            Sinh_Vien T = new Sinh_Vien(i , ten , lop , ngay_sinh ,gpa) ; 
            M.add(T) ; 
            i++;
        }
    }
    
    public void in_danh_sach(){
        for (Sinh_Vien sinh_Vien : M) {
            System.out.println(sinh_Vien);
        }
    }
}
