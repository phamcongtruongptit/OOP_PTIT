public class Main2 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1() ; 
        t1.start() ;
        try {
            t1.join() ; 
        } catch (InterruptedException e) {
            System.out.println(e);
            //TODO: handle exception
        }
        Thread1 t2 = new Thread1() ;
        t2.start() ;
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}

