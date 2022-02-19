package packet1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Nguoi implements Comparable<Nguoi> {
    private String name ; 
    private Date ngay_sinh ; 
    public Nguoi (String name , String ngay_sinh ) throws ParseException {
        this.name = name ; 
        this.ngay_sinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngay_sinh); 
    }

    public String toString(){
        return name ; 
    }

    public int compareTo(Nguoi X){
        if(this.ngay_sinh.compareTo(X.ngay_sinh) > 0) return 1; 
        if(this.ngay_sinh.compareTo(X.ngay_sinh) < 0) return -1; 
        return 0; 
        
    }
    
}
