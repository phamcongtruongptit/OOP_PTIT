public class Thread2 extends Thread {
    private String name ; 
    private long value ; 
    Account a ;
    public Thread2(String name, long value, Account a) {
        this.name = name;
        this.value = value;
        this.a = a;
    }
    @Override
    public void run() {
        a.nap(name , value);
    } 
    
}
