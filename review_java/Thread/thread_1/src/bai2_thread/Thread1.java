public class Thread1 extends Thread {
    private int num ; 
    public Thread1(int num) {
        this.num = num ;
    }
    @Override
    public void run() {
        while(num>=0){
            System.out.println("\33[32mcount: " + num);
            num-- ; 
            try {
                sleep(1000) ; 
            } catch (InterruptedException t) {
                System.out.println(t); 
            }
        }
    }
}
