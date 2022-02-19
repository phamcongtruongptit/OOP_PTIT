import java.util.Scanner;
public class App {
    private static String check(String s){
        String res = "\\d+" ; 
        if(!s.matches(res) || s.charAt(0) == '0') return "INVALID" ; 
        int chan = 0 , le = 0 ; 
        for(int i = 0 ; i<s.length() ; i++){
            if(Integer.parseInt(Character.toString(s.charAt(i))) % 2 == 0) {
                chan++ ; 
            } else le++ ; 
        }
        if(s.length()%2 == 0 && chan>le) return "YES" ; 
        if(s.length()%2 == 1 && chan<le) return "YES" ; 
        return "NO" ; 
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        while(t-->0){
            String s = scanner.next();
            System.out.println(check(s));
        }
    }
}
