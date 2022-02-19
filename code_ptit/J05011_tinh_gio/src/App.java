import packet1.Danh_Sach_Nguoi_Choi;

public class App {
    public static void main(String[] args) throws Exception {
        Danh_Sach_Nguoi_Choi T = new Danh_Sach_Nguoi_Choi();
        T.input();
        T.sort();
        T.output();
    }
}
/* 
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/