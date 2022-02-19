import packet1.Danh_Sach_Nhan_Vien;

public class App {
    public static void main(String[] args) throws Exception {
        Danh_Sach_Nhan_Vien T  = new Danh_Sach_Nhan_Vien();
        T.input();
        T.sort();
        T.output();
    }
}
/* 
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
*/
/* 
NV01 Tran Thi Yen 100 24000 16000 8100

NV02 Nguyen Van Thanh 100 30000 20000 10100

NV03 Doan Truong An 300 75000 25000 50300

NV04 Le Thanh 500 140000 25000 115500
*/