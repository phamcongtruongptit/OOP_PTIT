import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine() ; 

        String []M = s.split("[abc\\s]+") ; 
        for (String string : M) {
            System.out.println(string);
        }

        // String[] a = s.split("[^a-zA-Z]+"); 
        // System.out.println("Cac tu cua xau: ");
        // for(String i:a){
        //     System.out.println(i);
        // }

        // String[] chu = s.split("[\\d\\s]+");
        // for(String i:chu){
        //          System.out.println(i);
        // }
    }
}
