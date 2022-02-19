import java.util.Scanner;

import packet1.UocSoBoiSo;

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            UocSoBoiSo U = new UocSoBoiSo() ; 
            U.input(scanner);
            U.output();
        }
    }
}
