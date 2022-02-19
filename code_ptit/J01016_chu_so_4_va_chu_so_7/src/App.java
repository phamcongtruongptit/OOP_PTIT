import java.util.Scanner;

public class App {
    private static boolean check(String s){
        int count = 0; ; 
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) == '4' || s.charAt(i) == '7') count++; ; 
        }
        if(count == 4 || count == 7){
            return true;
        }
        else return false ; 
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            String  n = scanner.next() ; 
            if(check(n)) System.out.println("YES");
            else System.out.println("NO") ; 
    }
}
