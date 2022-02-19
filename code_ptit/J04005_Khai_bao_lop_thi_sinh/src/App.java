import java.util.Scanner;

import packet1.Thi_Sinh;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Thi_Sinh T = new Thi_Sinh();
        T.input(scanner);
        System.out.println(T);
    }
}
