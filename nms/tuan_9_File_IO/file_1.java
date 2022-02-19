import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_1 {
    public static void main(String[] args) throws IOException {
        // FileOutputStream out = new FileOutputStream("TEST.OUT") ; 
        DataOutputStream out = new DataOutputStream(new FileOutputStream("TEST.OUT")) ;
        for(int i = 0; i <1000 ; i++){
            out.write(i) ; 
        }
        out.close();
    }
}
