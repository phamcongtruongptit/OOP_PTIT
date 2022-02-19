

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vung , sdt ; 
        String res1 = "^N[OG]\\d{2}" ; 
        System.out.print("Nhap ma vung: ");
        vung = scanner.nextLine() ; 
        if(vung.matches(res1)){
         System.out.println("DUng");
        }
        else {
            System.out.println("Nhap sai ma vung!");
        }
    }
    
    
}
