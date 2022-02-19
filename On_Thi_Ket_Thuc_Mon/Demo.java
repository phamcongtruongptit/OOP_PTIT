public class Demo {
    public static void main(String[] args) {
        String ngaydangki = "12/58/5222" ; 
        String []l = ngaydangki.split("/") ; 
        System.out.println( Integer.parseInt(l[l.length-1])) ;
    }
}
