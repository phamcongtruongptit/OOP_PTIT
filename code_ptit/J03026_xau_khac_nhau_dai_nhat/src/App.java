import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String s1 = scanner.next() ; 
            String s2 = scanner.next() ; 
            if(s1.equals(s2) == true ) {
                System.out.println("-1");
            } else {
                System.out.println(Math.max(s1.length(), s2.length()));
            }
        }
    }
}
