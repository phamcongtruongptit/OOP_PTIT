
package ktra1;
import java.util.Scanner;

public class XuLyXau {
    private String xau;

    public XuLyXau() {
        Scanner in=new Scanner(System.in);
        System.out.print("Xau:");
        xau=in.nextLine();
    }
    public void dodai(){
        System.out.println("Do dai:"+xau.length());
    }
    public void soCau(){
        String[] cau=xau.split("[\\.\\?\\!]");
        System.out.println("So cau:"+cau.length);
    }
        
}
