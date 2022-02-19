import java.util.Scanner;
public class Main2 {
    
    public static void main(String[] args) {
        Chu_Chay t = new Chu_Chay() ;
        t.start();

        Scanner scanner = new Scanner(System.in);
        String in = null ; 
        while (scanner.hasNext() && !((in = scanner.next()).equalsIgnoreCase("exit"))) {
            if(in.equalsIgnoreCase("c")){
                t.suspend(); // dung lai
            }     else {
                t.resume(); // tiep tuc
            }
        }
        t.stop();
        scanner.close();
    }
}