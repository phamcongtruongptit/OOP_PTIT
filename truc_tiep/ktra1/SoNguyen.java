
package ktra1;
import java.util.Scanner;

public class SoNguyen {
   private int n;

    public SoNguyen() {
        Scanner in=new Scanner(System.in);
        System.out.print("n=");
        n=Integer.parseInt(in.nextLine());
    }
    
    public void tinhTong(){
        int t=0;
        for (int i = 1; i <=n; i++) {
            t+=i;
        }
        System.out.println("Tong:"+t);
    }
    private boolean laNT(int n){
        if(n<2) return false;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public void daySoNT(){
        System.out.print("Day so NT:");
        for (int i = 1; i <=n; i++) {
            if(laNT(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
   
}
