public class Thread_Demo extends Thread{
// cach 1
    public Thread_Demo(String name) {
        super(name);
    }
    public void run() {
        System.out.println(this.getName()+" Start: ");
        for (int i = 0; i <5  ; i++){
            System.out.println(this.getName() + " " + i);
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(this.getName()+" Stop !");
    }
    
}
