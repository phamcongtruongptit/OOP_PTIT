import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class file_2 {
    public static void main(String[] args) throws IOException {
        // FileInputStream in = new FileInputStream("TEST.OUT") ; 
        DataIntputStream in = new DataIntputStream(new FileInputStream("TEST.OUT")) ;
        int t = 0  , count = 0; 
        while((t = in.read()) != -1){
            System.out.println(t);
        }
    }
}
