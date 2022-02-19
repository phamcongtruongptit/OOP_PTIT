public class main {
    public static void main(String[] args) {
        Thread_Demo t1 = new Thread_Demo("Luong 1");
        Thread_Demo t2 = new Thread_Demo("Luong 2");
        Thread_Demo t3 = new Thread_Demo("Luong 3");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
            //TODO: handle exception
        }
        t3.start();

    }
}
