public class Account {
    private long balance = 3000;

    public boolean check(long value) {
        return value < balance;
    }

    public synchronized void rutTien(String name , long value) {
        System.out.println(name+ " RUT TIEN " + value );
        if(!check(value)){
            try {
                System.out.println("Doi Tien Vao");
                wait();
            } catch (InterruptedException t) {
                System.out.println(t);
                //TODO: handle exception
            }
            try {
                Thread.sleep(1000) ; 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } 
         balance -= value;
        System.out.println("Success");
        System.out.println("So tien con lai: " + balance );
    }

    public synchronized void nap(String name , long value) {
        System.out.println(name +  " nap " + value);
        balance += value;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException t) {
            System.out.println(t);
        }
        notify();
    }
}
