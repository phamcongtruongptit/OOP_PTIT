import java.util.Scanner;

public class App {
    private static int MaxLength(String s){
        int count = 0  ; 
        while(true){
            boolean check = false ; 
            if(s.contains("100") == true){
                check = true ; 
                s = s.substring(0 ,s.indexOf("100")) + s.substring(s.indexOf("100") + 3 ) ; 
                count+=3 ; 
            }
            if(check==false || s.equals("") == true) break ; 
        }
        return count ; 
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine() ;
        while(t-->0){
            String s = scanner.next() ;
            System.out.println(MaxLength(s));
        }
    }
}

