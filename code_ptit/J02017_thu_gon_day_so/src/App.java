import java.util.Scanner;
import java.util.Stack;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ;
        Stack<Integer> T = new Stack<Integer>();
        T.push(scanner.nextInt()) ; 
        n-- ; 
        
        while(n-->0){
            int a = scanner.nextInt() ;
            if(T.empty()){
                T.push(a) ; 
            } else {
                int  TOP = T.peek();
                if((TOP + a) % 2 == 0) T.pop() ; 
                else   T.push(a) ; 
            }
        }

        System.out.println(T.size());
    }
}
