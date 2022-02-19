import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        String name = "in.txt"  ; 
        String out = "out.txt" ; 
        ArrayList<Phan_So> list = new ArrayList<>() ; 

        try {
            BufferedReader reader = new BufferedReader(new FileReader(name)) ; 
            String line  ; 
            while((line = reader.readLine()) != null){
                String[]s = line.split("\\s+") ; 
                Phan_So t1  = new Phan_So(Integer.parseInt(s[0]),Integer.parseInt(s[1])) ; 
                Phan_So t2  = new Phan_So(Integer.parseInt(s[2]),Integer.parseInt(s[3])) ;
                Phan_So ans = t1.add(t2) ;
               list.add(ans);    
            }
            reader.close(); 
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException t){
            System.out.println(t);
        }

        try {
            PrintWriter pr = new PrintWriter(out) ;
            for (Phan_So phan_So : list) {
                pr.println(phan_So.tu_so + "/" + phan_So.mau_so);
            }
            pr.close();
        } catch (FileNotFoundException s) {
            System.out.println(s);
        } 
    }
}
