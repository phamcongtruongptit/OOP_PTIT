import java.util.Arrays;
import java.util.Scanner;

public class DaySoThuc {
     private double[] a;
     
     public DaySoThuc(){
         
     }
     public void nhapDS(){
         Scanner in=new Scanner(System.in);
         //day so phai biet bao nhieu phan tu
         //nhap so phan tu
         System.out.print("Nhap so phan tu:");
         int n=Integer.parseInt(in.nextLine());
         a=new double[n];
         //nhap day so
         for (int i = 0; i < a.length; i++) {
             System.out.print("Nhap phan tu "+i+": ");
             a[i]=Double.parseDouble(in.nextLine());
         }
         System.out.println();
     }
     //tong
     public void tongDS(){
         double t=0;
         for(double x:a)
             t+=x;
         System.out.println("Tong day:"+t);
     }
     //tang dan
     public void sapxep(){
         System.out.println("Day ban dau:"+Arrays.toString(a));
         for (int i = 0; i < a.length; i++) {
             for (int j = i+1; j < a.length; j++) {
                 if(a[i]>a[j]){
                     double t=a[i];
                     a[i]=a[j];
                     a[j]=t;
                 }
             }
         }
         System.out.println("Day da sap xep:"+Arrays.toString(a));
     }
     
     
}

