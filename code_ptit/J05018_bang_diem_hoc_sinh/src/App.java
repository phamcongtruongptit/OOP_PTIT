import packet1.Danh_Sach_Hoc_Sinh;

public class App {
    public static void main(String[] args) throws Exception {
        Danh_Sach_Hoc_Sinh T = new Danh_Sach_Hoc_Sinh();
        T.input();
         T.sort();
        T.output();
    }
}
/* 
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
*/