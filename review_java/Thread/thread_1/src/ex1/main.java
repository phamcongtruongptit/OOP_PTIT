public class main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread() ; 
        // System.out.println(t.getName());
        // System.out.println(t.getPriority());
        // System.out.println(t.getState());
        // t.setPriority(3);
        // System.out.println(t.getPriority());
        System.out.println(t.getName() + " start: ");
        for (int i = 0; i <5  ; i++){
            System.out.println(t.getName() + " " + i);
            try {
                Thread.sleep(1000) ; 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        DeamonThread tt = new DeamonThread() ;
        tt.setDaemon(true); // phat set cho no TRUE
        tt.start();
        // tt.finalize();

        Thread_Demo t1 = new Thread_Demo("Gio Moi") ; 
        t1.start() ; 

        Runabledemo r = new Runabledemo("Nhom 7") ;
        Thread t2 = new Thread (r) ;  // doi so la 1 runnable
        t2.start() ; 

        System.out.println(t.getName() + " stop: ");
    }
}
