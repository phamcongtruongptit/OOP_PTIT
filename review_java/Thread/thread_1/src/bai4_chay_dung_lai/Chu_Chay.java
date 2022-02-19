public class Chu_Chay extends Thread {
    public boolean running = true   ;
    
    public void chay(){
        running = true ;
    } 

    public void dunglai() {
        running =  false ;  
    }

    public void run() {
        String line = "Hoc Vien Cong Nghe Buu Chinh Vien THong" ; 
        while (running) {
            line = line.charAt(line.length()-1) + line.substring(0, line.length()-1);
            System.out.println(line);
            try {
                Thread.sleep(1000) ; 
            } catch (InterruptedException t) {
                System.out.println(t); 
            }
        }
    }
}
