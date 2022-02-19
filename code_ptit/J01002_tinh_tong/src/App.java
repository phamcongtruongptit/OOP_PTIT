import java.util.Scanner;

import packet1.TinhTong;

public class App {
    public static void main(String[] args) {
        int t ; 
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt() ; 
        while(t-- >0){
            int n = scanner.nextInt() ;
            TinhTong bai1 = new TinhTong() ; 
            bai1.setN(n);
            System.out.println(bai1.getKq()) ; 
        }
    }
}
