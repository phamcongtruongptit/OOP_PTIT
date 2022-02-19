package packet1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Danh_Sach_Sinh_Vien {
    public ArrayList<Sinh_Vien> T = new ArrayList<Sinh_Vien>();
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        scanner.nextLine() ;
        int i = 1 ; 
        while(i<=n ){
            String a ,b,c ; double d ; 
            a = scanner.nextLine();
            b = scanner.nextLine();
            c = scanner.nextLine();
            d = scanner.nextDouble();
            scanner.nextLine() ;
            Sinh_Vien x = new Sinh_Vien(i,a,b,c,d) ; 
            // Sinh_Vien x = new Sinh_Vien(i , a, b, c , d ) ;
            T.add(x);
            i++;
        }
    }

    public void sortGpa(){
        for(int i=0 ; i<T.size()-1 ; i++){
            for(int j =i+1 ; j<T.size() ; j++){
                if(Sinh_Vien.compareGPA(T.get(i), T.get(j)) < 0){
                    Collections.swap(T, i, j);
                }
            }
        }
    }

    public void print_Sinh_Vien(){
        for (Sinh_Vien sinh_Vien : T) {
            System.out.println(sinh_Vien);
        }
    }
    
}
