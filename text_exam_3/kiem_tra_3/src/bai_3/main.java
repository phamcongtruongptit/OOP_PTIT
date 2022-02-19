
public class main {

    public static void main(String args[]) {
        Data d = new Data();
        Thread t1 = new Thread1(d);
        Thread t2 = new Thread2(d);
        Thread t3 = new Thread3(d);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t3.start();
        System.out.println("CHUA KIP TINH DIEM");
    }
}
