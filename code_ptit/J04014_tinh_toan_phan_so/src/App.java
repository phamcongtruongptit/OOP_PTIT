import java.util.Scanner;

import packet1.PhanSo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        while(t-->0){
            PhanSo a = new PhanSo(scanner.nextLong() , scanner.nextLong());
            PhanSo b = new PhanSo(scanner.nextLong() , scanner.nextLong());
            System.out.println(PhanSo.tinhC(a, b)+ " " + PhanSo.tinhD(a,b,PhanSo.tinhC(a, b)));
            // a.rut_gon() ; b.rut_gon();
            // System.out.println(a + " " + b);
        }
    }
}
