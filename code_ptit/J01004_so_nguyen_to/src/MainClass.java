import java.util.Scanner;

import packet1.*;
/**
 * MainClass
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t  =  scanner.nextInt() ; 
        while(t-- >0 ){
            int n = scanner.nextInt() ;
            if(NguyenTo.checknto(n)) System.out.println("YES");
            else System.out.println("NO") ; 
        }


    }
}

