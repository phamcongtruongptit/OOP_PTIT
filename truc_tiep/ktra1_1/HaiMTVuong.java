
import java.util.Scanner;

public class HaiMTVuong {
    private int[][] a,b;
    private Scanner in;
    public HaiMTVuong(){
        in=new Scanner(System.in);
    }
    public int[][] nhap(){
        int[][] x;
        System.out.print("Kich thuoc:");
        int n=in.nextInt();
        //nhap ma tran
        x=new int[n][n];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print("phan tu "+i+","+j+": ");
                x[i][j]=in.nextInt();
            }
            System.out.println();
        }
        return x;
    }  

    public int[][] getA() {
        return a;
    }

    

    public int[][] getB() {
        return b;
    }

    public void setB() {
       this.b=nhap();
    }
    public void setA() {
       this.a=nhap();
    }
    public void vietA(){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void vietB(){
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void tong(){
        int[][] c=new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
}
