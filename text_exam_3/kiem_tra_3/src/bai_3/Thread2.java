import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Thread2 extends Thread{
    Data d;

    public Thread2(Data d) {
        this.d = d;
    }
    public void run(){
            synchronized(d){
                FileReader reader = null;
                BufferedReader bufferedReader = null;
                try{
                    reader = new FileReader("dapan.txt");
                    bufferedReader = new BufferedReader(reader);
                    synchronized(d) {
                        String line = null;
                        while((line = bufferedReader.readLine()) != null){
                            d.kq.add(line.trim()) ; 
                        }
                    }
                }catch(FileNotFoundException e){
                    System.out.println(e);
                }catch(IOException e){
                    System.out.println(e);
                }
            }
        
        System.out.println("T2 : STOP");
        synchronized(d){
            stop();
        }
    }
}
