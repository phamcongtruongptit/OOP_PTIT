public class Main {
    public static void main(String[] args) {
        Account a = new Account();
        Thread1 c = new Thread1("CHONG" , 3500 , a ) ; 
        Thread2 v = new Thread2("VO" , 1000 , a ) ; 
        c.start();
        v.start();
    }
}
