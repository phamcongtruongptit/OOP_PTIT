import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Vao_Ra_File {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("VD.txt") ; 
        // System.out.println(f.getAbsoluteFile());
        // System.out.println(f.length());
        Scanner scanner = new Scanner(f);
        // System.out.println(scanner.nextInt());
        int sum = 0 ; 
        while(scanner.hasNextInt()){ // ddc het cac so nguyen - chi doc duoc kieu int (ham hastnetxt kiem tra token tiep theo co dung voi kieu du lieu minh muojn hay khong)
            sum+= scanner.nextInt();
            // System.out.println(scanner.nextInt());
        }
        // cach tiep can tot hon: nextLine
        System.out.println(sum);
        PrintWriter out = new PrintWriter("KQ.OUT") ; 
        out.println(sum);
        out.close(); // bat buoc phai dong
    }
}
