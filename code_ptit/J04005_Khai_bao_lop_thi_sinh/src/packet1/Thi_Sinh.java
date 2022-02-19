package packet1;

import java.util.Scanner;

public class Thi_Sinh {
    private String name ; 
    private String birthday ;
    private float []diem = new float[3] ; 

    public void input(Scanner scanner){
        name = scanner.nextLine() ; 
        birthday = scanner.nextLine(); 
        for(int i = 0 ; i < 3 ; i++){
            diem[i] = scanner.nextFloat() ; 
        }
    }

    public String toString(){
        float sum = 0 ;
        for(int i = 0 ; i < 3 ; i++){
            sum+=diem[i] ;
        }
        return name +" " +  birthday +" " + sum ; 

    }


    
}
