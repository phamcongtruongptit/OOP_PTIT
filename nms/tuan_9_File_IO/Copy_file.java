import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_file {
    public static void main(String[] args) throws IOException {
        FileInputStream in =   new FileInputStream("A.docx") ;
        FileOutputStream out = new FileOutputStream("B.docx");
        int t = 0 ; 
        while((t = in.read()) != -1){
            out.write(t) ; 
        }
        out.close();
    }
    
}
