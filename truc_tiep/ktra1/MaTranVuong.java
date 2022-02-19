package ktra1;
import java.util.Scanner;

public class MaTranVuong {
    private double[][] a;

    public MaTranVuong() {
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap kich thuoc ma tran:");
        int n=Integer.parseInt(in.nextLine());
        a=new double[n][n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("nhap hang "+i+": ");
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=Double.parseDouble(in.next());
            }
        }
    }
    public void viet(){
        System.out.println("Ma tran");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void tongHang(){
        for (int i = 0; i < a.length; i++) {
            double t=0;
            for (int j = 0; j < a[0].length; j++) {
                t+=a[i][j];
            }
            System.out.println("Tong hang "+i+": "+t);
        }
        System.out.println();
    } 
    public void tinhDinhThuc(){
        
    }
        
}
