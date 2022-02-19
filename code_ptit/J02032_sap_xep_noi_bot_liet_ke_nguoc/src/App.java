import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        while(t-->0){
            ArrayList <String> ans  = new ArrayList<String>();
            int n = scanner.nextInt() ; 
            int M[] = new int[n+5] ; 
            for(int i=0 ; i<n ; i++){
                M[i] = scanner.nextInt() ; 
            }
            
        for(int i = n-1 ; i>=0 ; i--) {
            Boolean ok = false ; 
            for(int j=0 ; j<i ; j++){
                if(M[j]>M[j+1]){
                    ok = true ; 
                    int tmp =  M[j] ; 
                    M[j] = M[j+1] ; 
                    M[j+1] = tmp  ; 
                }
            }
            if(ok==false) break ;
            String s = "" ; 
            s+= "Buoc " + Integer.toString(n-i) + ": " ;  
            // System.out.print("Buoc "+ (n-i) + ": ");
            for(int k = 0 ; k< n ; k++) {
                s+= Integer.toString(M[k]) + " " ; 
            }
            ans.add(s); 
            
        }
        for(int  i  = ans.size()-1 ; i>=0 ; i--){
            System.out.println(ans.get(i));
        }
    }
        
    }
    
}
