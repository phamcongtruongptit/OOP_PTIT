public class Runabledemo implements Runnable{
    private String name  ;
    public Runabledemo(String name) {
        this.name = name;
    } 
    public void run() {
        System.out.println(name+" Start: ");
        for (int i = 0; i <5  ; i++){
            System.out.println(name + " " + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name+" Stop !");
    }
    
}
