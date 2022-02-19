import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        // Thread1 g = new Thread1() ;
        // Thread t = new Thread(g) ; 
        // t.start();

        Chu_Chay t = new Chu_Chay() ;
        t.start();

        Scanner scanner = new Scanner(System.in);
        String in = null ; 
        if((in = scanner.next()).equalsIgnoreCase("c")){
            // g.stop();
            t.dunglai();
        }

    }
    
}
