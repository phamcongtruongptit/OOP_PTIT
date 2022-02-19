public class RightThread extends Thread {
    String s = "HOC VIEN CONG NGHE BUU CHINH VIEN THONG - KHOA CNTT 1";
    @Override
    public void run() {
        while (true) {
            s = s.charAt(s.length()-1) + s.substring(0, s.length()-1);
            System.out.println(s);
            try {  String
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
