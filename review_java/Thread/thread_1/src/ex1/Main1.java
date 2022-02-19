public class Main1 {
    public static void main(String[] args) {
        Thread_Demo t = new Thread_Demo("Nhom 7:");        
        System.out.println(t.getState());
        t.start(); 
        System.out.println(t.getState()); // trang thai
    }
    
}
