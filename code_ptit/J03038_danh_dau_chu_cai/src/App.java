import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static int []M = new int[1000] ; 
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        s.toLowerCase() ; 
        Arrays.fill(M, 0);
        for(int i = 0; i < s.length() ; i++){
            M[(int)s.charAt(i)]++ ; 
        }
        int count = 0 ; 
        for(int i = (int)'a' ; i<= (int)'z' ; i++){
            if(M[i] > 0) count++ ; 
        }
        System.out.println(count); 
    }

}
