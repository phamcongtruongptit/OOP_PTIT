import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); //   hom nay troi dep lam. dd an . kem.   khong
        String  []M = s.split(" ") ; 
        for (String string : M) {
            System.out.println(string);
        }
        System.out.println("___________________________");
        String []k = s.split("\\.") ; 
        for (String string : k) {
            System.out.println(string);
        }
    }
}
