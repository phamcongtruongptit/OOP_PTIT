import java.util.Scanner;

import packet1.mang;

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            mang T = new mang() ; 
            T.input(scanner);
            System.out.println(T.diemcanbang());
        }
    }
}
