import java.util.Scanner;

import checkso.CheckSoDep;

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine() ; 
        while(t-->0){
            CheckSoDep T = new CheckSoDep() ; 
            T.input(scanner);
            System.out.println(T.ketQua());
        }
    }
}
