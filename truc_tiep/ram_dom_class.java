import java.util.Random;

public class ram_dom_class {
    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println(rd.nextInt(3)); // 0 1 2 
        int min = 3 , max  = 8 ; 
        /* Lay ngau nhien tu 3--> 8 */
        int r = rd.nextInt(max - min + 1 ) + min;  
        System.out.println(r);
        Math.ceil(2.30) ; // --> 3 
        System.out.println(Math.ceil(2.30) );
        System.out.println(Math.floor(2.3)); // --> 2
        System.out.println(Math.round(2.6)) ; // --> 3;
        System.out.println(Math.floor(2.6)) ; // --> 2;
    }
}
