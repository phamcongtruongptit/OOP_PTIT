import java.util.Scanner;

import Exception.GpaEx;
import Exception.KhongRongEx;
import Exception.SoDuongEx;
import Object.SinhVien;

// public class App {
//     public static void main(String[] args) throws Exception { // cach 1
//         SinhVien sv   = null; 
//         try {
//             sv = new SinhVien("Truong", 5, 25)  ; 
//         } catch (KhongRongEx t ) {
//             System.out.println(t);
//         } catch (SoDuongEx   e) {
//             System.out.println(e);
//         } catch (GpaEx x){
//             System.out.println(x);
//         }
//         System.out.println(sv);
//     }
 
// }

public class App { // cach 2
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String hoten  ; int ma  ;  double gpa  ; 
        while(true){
            System.out.print("Nhap ho ten: ");
            try {
                hoten = scanner.nextLine() ; 
                if(hoten.equals("")) throw new KhongRongEx("Nhap ten khong rong") ; 
                break ; 
            } catch (KhongRongEx t) {
                System.out.println(t);
            }
        }
        while(true){
            System.out.print("Nhap ma: ");
            try {
                ma = Integer.parseInt(scanner.nextLine()) ; 
                if(ma<=0) throw new SoDuongEx("Nhap so Duong !") ; 
                break ; 
            } catch (NumberFormatException k) {
                System.out.println("Nhap Bang So !");
            } catch (SoDuongEx t) {
                System.out.println(t);
            }
        }

        while(true){
            System.out.print("Nhap GPA: ");
            try {
                gpa = Double.parseDouble(scanner.nextLine()) ; 
                if(gpa<=0 || gpa >4) throw new GpaEx("GPA nam trong khoang 0 - 4") ; 
                break ; 
            } catch (NumberFormatException t) {
                System.out.println("Nhap doule");
            } catch (GpaEx t){
                System.out.println(t);
            } 
        }
        SinhVien T = new SinhVien(hoten , ma , gpa ) ; 
        System.out.println(T);
    }
 
}