import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next() ; 
        while(true){
            boolean found = false ; 
            for(int i = 0 ; i<s.length()-1 ; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    found = true ;  
                    s = s.substring(0,i) + s.substring(i+2  ) ; 
                    break  ; 
                }
            }
            if(found == false || s.equals("") == true){
                break  ; 
            }
        }
        if(s.equals("") == true) {
            System.out.println("Empty String");
        } else {
            System.out.println(s);
        }
    }
}
