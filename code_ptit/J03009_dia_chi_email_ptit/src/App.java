import java.util.ArrayList;
import java.util.Scanner;

// import packet1.Email_Ptit;

public class App {
    private static String chuan_hoa(String s ){
        s = s.trim(); 
        s = s.toLowerCase() ; 
        s = s.replaceAll("\\s+" , " ") ; 
        String []M = s.split(" ") ; 
        String ans = "" ; 
        ans+= M[M.length - 1] ; 
        for(int i = 0 ; i<M.length -1 ; i++){
            ans+= M[i].charAt(0) ;  
        }
        return ans ; 
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt() ;
        scanner.nextLine() ; 
        ArrayList<String> ARR = new ArrayList<String>() ; 
        while(t-->0){
            String s ; 
            s = scanner.nextLine() ; 
            ARR.add(chuan_hoa(s)) ; 
        }
        for(int i = 0 ; i<ARR.size() ; i++){
            int count = 1 ; 
            for(int j = 0 ; j<i ; j++){
                if(ARR.get(i).equals(ARR.get(j)) == true){
                    count++ ; 
                }
            }
            if(count==1) 
            System.out.println(ARR.get(i)+ "@ptit.edu.vn") ;
            else {
                 System.out.println(ARR.get(i)+count+ "@ptit.edu.vn") ;

            }
        }
    }
    
}

