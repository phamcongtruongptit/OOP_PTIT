import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine() ;
        while(t-->0){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            String []M1 = s1.split(" ") ; 
            String []M2  = s2.split(" ") ; 
            ArrayList<String> A1 = new ArrayList<String>() ;
            ArrayList<String> A2 = new ArrayList<String>() ;
            for(int i = 0 ; i<M1.length ; i++){
                A1.add(M1[i]) ; 
            }
            for(int i = 0 ; i<M2.length ; i++){
                A2.add(M2[i]) ; 
            }
            A1.removeAll(A2) ; 
            Collections.sort(A1) ;
            Set<String> set = new LinkedHashSet<String>(A1);
            ArrayList <String> ans = new ArrayList<String>(set);
            for(int i = 0 ;i<ans.size() ; i++){
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
    }
}
