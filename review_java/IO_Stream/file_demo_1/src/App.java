import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        // String filename = "hanoi.txt" ; 
        String filename = "D:\\tai_lieu_ptit\\java_oop\\review_java\\IO_Stream\\file_demo_1\\src\\hanoi.txt" ; 
        // File f = new File(filename) ; 
        // System.out.println(f.getAbsolutePath());
        // System.out.println(f.getName());
        // System.out.println(new Date(f.lastModified()));

        // String fileanme2 = "D:\\tai_lieu_ptit\\java_oop\\nms\\tuan_9_File_IO\\han3oi.txt" ; 
        // File f2 = new File(fileanme2);
        // System.out.println(f2.exists());

        // try {
        //     FileReader r = new FileReader(filename) ;   // doc tung ky tu ra dang INT
        //     int k  ; 
        //     while(true){
        //         k = r.read();
        //         if(k == -1 ) break  ; 
        //         char c = (char)k ; 
        //         System.out.print(c);
        //     }
        //     r.close();
        // } catch (FileNotFoundException t) {
        //     System.out.println(t);
        // } catch (IOException e) {
        //     System.out.println(e);
        // }
        // System.out.println();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename)); 
            String line = "" ; 
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException g){
            System.out.println(g);
        }
    }
}
