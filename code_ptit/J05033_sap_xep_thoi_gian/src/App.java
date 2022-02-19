import java.util.Scanner;

import packet1.Time;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt() ;
        Time []M = new Time[n] ; 
        for(int i = 0 ; i<n ; i++){
            int a , b  , c ; 
            a = scanner.nextInt() ;
            b = scanner.nextInt() ;
            c = scanner.nextInt() ;
            M[i] = new Time(a,b,c) ;
        }
        for(int i = 0 ; i<n-1 ; i++){
            for(int j= i+1 ; j<n ; j++){
                if(Time.cmp(M[i], M[j])< 0){
                    Time tmp = M[i] ; 
                    M[i] = M[j] ; 
                    M[j] = tmp ;
                }
            }
        }

        for(int i = 0 ; i<n ; i++){
            System.out.println(M[i]);
        }

    }
}
