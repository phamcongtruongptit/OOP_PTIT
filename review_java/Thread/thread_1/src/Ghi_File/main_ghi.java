import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class main_ghi {
    public static void main(String[] args) {
        String out = "out.txt" ; 
        int a = 243   ; 
        try {
            PrintWriter pr = new PrintWriter(out) ;  
            pr.println("ghi file: " + a + "!!!!!34523523523!!!");
            pr.println("ghi file: " + a + "!!!!!!!!");
            pr.close();
        } catch (FileNotFoundException t) {
            System.out.println(t);
        }
    }
}
