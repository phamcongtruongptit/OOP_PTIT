public class Thread1 extends Thread {
    private String name ; 
    private long value ; 
    Account a ;
    public Thread1(String name, long value, Account a) {
        this.name = name;
        this.value = value;
        this.a = a;
    }
    @Override
    public void run() {
        a.rutTien(name , value);
    } 
}
