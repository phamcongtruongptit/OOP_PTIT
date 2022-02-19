import java.util.Scanner;

public class Thread3 extends Thread{
    Data d;

    public Thread3(Data d) {
        this.d = d;
    }
    public void run(){
        for (int i = 0; i < 11; i++) {
            System.out.println("Moi ban nhap cau tra loi: ");
            synchronized(d){
                for(int  j = 0; j< d.i ; j++){
                    System.out.print("nhap cau tra loi cho cau hoi "+ (j+1) + ": ");
                    Scanner scanner =new Scanner(System.in);
                    String ans = scanner.next();
                    d.ans.add(ans) ; 
                }
        }
        System.out.println("T3: STOP");
        synchronized(d){
            stop();
        }
    }
}
}
