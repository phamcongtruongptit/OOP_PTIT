
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LeftThread left = new LeftThread();
        RightThread right = new RightThread();
        
        left.start();
        right.start();
        Scanner sc = new Scanner(System.in);
        String string = "";
        while((string = sc.next()) != null) {
            if(string.equalsIgnoreCase("L")) {
                left.suspend();
            }
            if(string.equalsIgnoreCase("T1")) {
                left.resume();
            }
            if(string.equalsIgnoreCase("R")) {
                right.suspend();
            }
            if(string.equalsIgnoreCase("T2")) {
                right.resume();
            }
            if(string.equalsIgnoreCase("x")) {
                left.stop();
                right.stop();
                break;
            }
        }
    }
}
