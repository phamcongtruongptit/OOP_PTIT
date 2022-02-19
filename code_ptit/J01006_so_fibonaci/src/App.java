import java.util.Scanner;

import packer1.FiBo;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            int n = scanner.nextInt();
            System.out.println(FiBo.FiBoThuN(n));
        }
    }
}
