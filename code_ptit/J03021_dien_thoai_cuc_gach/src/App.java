import java.util.Scanner;

public class App {
    private static boolean check(String s){
        s = s.toUpperCase() ; 
        String so = "" ; 
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C') so+='2' ; 
            else if(s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C') so+='2' ; 
            else if(s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F') so+='3' ; 
            else if(s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I') so+='4' ; 
            else if(s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L') so+='5' ; 
            else if(s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O') so+='6' ; 
            else if(s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S') so+='7' ; 
            else if(s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V') so+='8' ; 
            else if(s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z') so+='9' ; 
        }
        String tmp = "" ; 
        for(int i = so.length()-1 ; i>= 0 ; i--){
            tmp += so.charAt(i);
        }
        if(tmp.equals(so)) return true ; 
        else return false ; 
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        while(t-->0){
            String s = scanner.next() ; 
            if(check(s)) System.out.println("YES");
            else System.out.println("NO") ;
        }

    }
}
