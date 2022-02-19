
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Thread.sleep;

/**
 *
 * @author fpt
 */
public class Thread1 extends Thread{
    Data d;

    public Thread1(Data d) {
        this.d = d;
    }
    public void run(){
        System.out.println("Danh Sach Cau HOI: ");
        
        try{
            FileReader reader = null;
            BufferedReader bufferedReader = null;
            reader = new FileReader("cauhoi.txt");
            bufferedReader = new BufferedReader(reader);
            d.i = 1 ;
            synchronized(d) {
                String line = null;
                while((line = bufferedReader.readLine()) != null){
                    System.out.print("Cau hoi thu " + d.i + ": ");
                    line = line.trim();
                    d.setCauhoi(line);
                    System.out.print(line);
                    System.out.println();
                    d.i++ ; 
                }
            }
        } catch(FileNotFoundException h){
            System.out.println(h);
        }catch(IOException e){
            System.out.println(e);
        }
        
    
    }
}
