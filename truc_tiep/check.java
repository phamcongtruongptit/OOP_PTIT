import java.util.Scanner;

public class check {
    private static int tongDaySo(int... a){
        int t = 0;  
        for(int tmp : a){
            t+=tmp ;  
        }
        return t  ;
    }
    public static void main(String[] args) {
        double n1 = (double)1/2 ; /* ep kieu */
        System.out.println(n1);
        /* chuyen to --> be thi phai ep kieu */
        System.out.println("Tong: " + tongDaySo(2 , 5,7));
        String ten[] = { "1", "2", "3", "4", "5",} ; 
        for(String check : ten){
            System.out.print(check + " ");
        }
    }
}

































