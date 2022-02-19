import java.util.Scanner;

import packet1.Hinh_chu_nhat;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double a , b  ; 
        String c ; 
        a = scanner.nextDouble() ; 
        b = scanner.nextDouble() ; 
        c = scanner.next() ; 
        if(a<=0 || b<= 0){
            System.out.println("INVALID");
        } else {
                Hinh_chu_nhat T = new Hinh_chu_nhat(a,b, c) ; 
                System.out.println(T);
        }
    }
}
