public class DeamonThread extends Thread {
    @Override
    public void run() {
        int i = 0 ; 
        while (true) {
            System.out.println("Num: " + i++);
            try {
                sleep(1000);
            } catch (InterruptedException t) {
                System.out.println(t);
                //TODO: handle exception
            }
        }
    }

    @Override
    protected void finalize() {// cac luong chay xong no  se dung cai nay
        System.out.println("STOPPPP");
    }
    
    
}
