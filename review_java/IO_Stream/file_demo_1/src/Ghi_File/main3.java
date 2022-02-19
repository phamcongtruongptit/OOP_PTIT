import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main3 {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String ten ; int tuoi ; 
        while(true) {

            try {
                System.out.print("Nhap TEN: ");
                ten = rd.readLine();
                System.out.print("Nhaop tuoi: ");
                tuoi = Integer.parseInt(rd.readLine());
                break ; 
            } catch (IOException e) {
                System.out.println(e);
            } catch(NumberFormatException f){
                System.out.println(f);
            } 
        }
        System.out.println("tee: " + ten +  " tuoi: "  + tuoi);
    }    
}
