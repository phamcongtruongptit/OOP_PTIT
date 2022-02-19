//package Doc_Day_So;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String name  = "Day_So.dat" ; 
        try {
            BufferedReader br = new BufferedReader(new FileReader(name)) ; 
            String line = br.readLine() ;
            String []S = line.split("\\s+") ; 
            int t = 0 ; 
            for (String string : S) {
                try {
                    int x = Integer.parseInt(string) ; 
                    t += x; 
                } catch (NumberFormatException e) {
                    System.out.println(e);
                }
            }
            System.out.println("Tong :" + t) ;
        } catch (FileNotFoundException k) {
            System.out.println(k);
        } catch(IOException e){
            System.out.println(e);
        }
    }
    
}
