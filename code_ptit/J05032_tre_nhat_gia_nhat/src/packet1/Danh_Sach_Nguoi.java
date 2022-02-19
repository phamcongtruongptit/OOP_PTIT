package packet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.text.ParseException;

public class Danh_Sach_Nguoi  {
    private int  n ; 
    private ArrayList<Nguoi> M = new ArrayList<Nguoi>() ;

    public void input() throws ParseException{
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        while(n-->0){
            Nguoi T = new Nguoi(scanner.next() , scanner.next()) ;
            M.add(T);
        }
    }
    public void output(){
        Collections.sort(M);
        System.out.println(M.get(M.size()-1));
        System.out.println(M.get(0));
    }
    
}
