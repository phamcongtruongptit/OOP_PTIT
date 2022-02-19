import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M[] = new int[n+5] ; 
        for(int  i = 0 ; i<n ; i++) {
            M[i] = scanner.nextInt();
        }
        ArrayList <String> ans = new ArrayList<String>() ;
        ans.add("Buoc 0: " + Integer.toString(M[0])) ; 
        // System.out.println("Buoc 0: " + M[0]);
        for(int i=1 ; i<n ; i++) {
            int j = i-1 ; 
            int t = M[i] ; 
            while(j>= 0 && t<M[j]){
                M[j+1] = M[j] ; 
                j-- ; 
            }
            M[j+1] = t ; 
            String s  = "" ; 
            s += "Buoc " + Integer.toString(i) + ": " ; 
            // System.out.print("Buoc "+ i+ ": ");
            for(int k=0 ;k<=i ; k++) {
                // System.out.print(M[k]+ " ");
                s+= Integer.toString(M[k]) + " " ; 
            }
            ans.add(s) ; 
        }
        for(int i = ans.size() - 1 ; i>=0 ; i--){
            System.out.println(ans.get(i)); 
        }
    }
}
