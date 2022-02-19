import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ex1 {
    public static void main(String[] args) {
        // int a , b; 
        // a = 10 ; b = 0 ; 

        // try {// cos the bo qua phan co loi de chayj han tiep theo
        //     int c = a/b ; 
        //     System.out.println(c);
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }
        // System.out.println("van de 1");
        // System.out.println("van de 2");
        // System.out.println("van de 3");
        String so = "234" ; 
        try { // tai
            int n = Integer.parseInt(so) ; 
            System.out.println(n);
            String sd = "152/04001" ; 
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy") ;
            Date k = f.parse(sd) ;
            System.out.println(k.toString());
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }  catch(NumberFormatException k){
            System.out.println(k.getMessage());
        } finally {// luon luon thuc hien
            System.out.println("Luon thuc hien");
        }

        System.out.println("Tac vu 1");
    }
}
