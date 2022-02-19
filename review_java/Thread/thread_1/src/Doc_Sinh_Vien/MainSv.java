import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class MainSv {
    public static void main(String[] args) {
        String name = "sv.dat" ; 
        
        ArrayList<SinhVien> T = new ArrayList<SinhVien>() ; 
        try {
            BufferedReader br = new BufferedReader(new FileReader(name)) ; 
            String line = ""; 
            while((line = br.readLine()) != null) {
                String []s = line.split("\\s*\\,\\s*") ; 
                T.add (new SinhVien(Integer.parseInt(s[0]) , s[1])) ; 
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        for (SinhVien sinhVien : T) {
            System.out.println(sinhVien);
        }
    }    
}
