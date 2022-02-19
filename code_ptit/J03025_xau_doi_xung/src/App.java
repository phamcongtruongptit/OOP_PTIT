import java.util.Scanner;

public class App {
    private static int CountKhacNhau(String s){
        int count = 0;
        for(int i = 0 ; i< s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                count++ ; 
            }
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        scanner.nextLine() ;  
        while(t-->0){
            String s = scanner.next(); 
            if(s.length()%2 != 0){
                if(CountKhacNhau(s) == 0 || CountKhacNhau(s) == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");  
                
                }
            } else {
                if(CountKhacNhau(s) == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
