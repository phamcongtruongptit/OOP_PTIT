import java.util.Scanner;

public class App {
    private static String chuanhoa(String s){
        s = s.trim();
        s = s.toLowerCase() ; 
        s = s.replaceAll("\\s+", " ") ; 
        String []M = s.split(" ") ; 
        String ans = "";
        for(int i = 0 ; i<M.length ; i++){
            ans += Character.toUpperCase(M[i].charAt(0)) ; 
            if(M[i].length()>1){
                ans+= M[i].substring(1) + " ";    
            } else ans+= " " ; 
        }
        return ans ; 
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int  t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String s  = scanner.nextLine();
            System.out.println(chuanhoa(s)); 
        }
        
    }
}
