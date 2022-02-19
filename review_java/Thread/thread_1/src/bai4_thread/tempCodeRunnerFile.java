public class bai4 {
    public static void main(String[] args) {
        new Thread(){
            public void run() {
                String line = "Hoc Vien Cong Nghe Buu Chinh Vien THong" ; 
                System.out.println(line);
                while (true) {
                    line = line.charAt(line.length()-1) + line.substring(0, line.length()-1);
                    System.out.println(line);
                    try {
                        sleep(300) ; 
                    } catch (InterruptedException t) {
                        System.out.println(t); 
                    }
                }
            }
        }.start();
        
    }
}