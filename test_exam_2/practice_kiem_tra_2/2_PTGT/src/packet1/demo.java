
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        
        String res = "^N[OG]\\d{2}" ; 
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        if(x.matches(res)){
            System.out.println("Dung");
        } else{System.out.println("Sai");}
    }
}
public String toString() {
    return super.getMa() + "\t" + super.getTenTaiXe() + "\t" + super.getdoanhThu() + "\t" + soHieuTuyen + "\t" + getSoLuotDiDuoc();
}