import java.util.Scanner;

public class App {
    public static String xautren(String s){
        String ans = "" ; 
        for(int i  = 0 ; i<s.length() ; i++){
            if(s.charAt(i) == '1') ans += '1' ; 
            else if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') ans += '0' ; 
            else return "INVALID" ; 
        }
        int i = 0 ; 
        while(ans.charAt(i) == '0' ){
            i++ ; 
            if(i ==  ans.length()) break ; 
        }
        if(i == ans.length()) return "INVALID" ; 
        else return ans.substring(i) ; 
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            String s = scanner.next();
            System.out.println(xautren(s));
        }
    }
}
