
public class LeftThread extends Thread {

    String s = "HOC VIEN CONG NGHE BUU CHINH VIEN THONG - KHOA CNTT 1";
    @Override
    public void run() {
        while (true) {
            s = s.substring(1, s.length()) + s.charAt(0);
            System.out.println(s);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
