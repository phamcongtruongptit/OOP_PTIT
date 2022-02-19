import java.text.SimpleDateFormat;
import java.util.Date;
public class Thread2 extends Thread {
    private int num ; 
    public Thread2(int num) {
        this.num = num ;
    }
    @Override
    public void run() {

            SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss") ;
            while (num>=0 ) {
                System.out.println("\33[31m"+f.format(new Date()));
                try {
                   sleep(1000);
               } catch (InterruptedException e) {
                   System.out.println(e);
               }
               num-- ; 
            
        }
    }
    
}
