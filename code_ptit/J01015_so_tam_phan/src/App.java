import java.util.Scanner;

public class App {
    private static boolean check(String s){
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2')  continue;
            else return false ; 
        }
        return true ; 
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t  = scanner.nextInt() ;
        while(t-->0){
            String s = scanner.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO") ;
        }
    }
}
