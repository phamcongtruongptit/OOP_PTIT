import java.text.SimpleDateFormat;
import java.util.Date;
public class bai1 {
 public static void main(String[] args) {
     new Thread(){
         public void run() {
             SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss") ;
             while (true) {
                 System.out.println("\33[31m"+f.format(new Date()));
                 try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
             } 
         }
     }.start();
 }
}
