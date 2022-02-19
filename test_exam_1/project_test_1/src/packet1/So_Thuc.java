package packet1;

import java.util.Scanner;

public class So_Thuc {
    private double x , epsilon ; 

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap x: ");
        x = scanner.nextDouble();
        System.out.print("Nhap epsilon: " );
        epsilon = scanner.nextDouble();
        System.out.println("Gia tri vua nhap: ");
        System.out.println("x = "  + x );
        System.out.println("epsilon = " + epsilon );
    }
    
}
