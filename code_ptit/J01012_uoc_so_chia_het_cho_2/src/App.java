import java.util.Scanner;
import packet1.UocSo;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            int n = scanner.nextInt();
            System.out.println(UocSo.uoc_so_2(n));
        }
    }
}
