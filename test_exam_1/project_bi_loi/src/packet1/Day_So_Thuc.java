package packet1;

import java.util.Scanner;

public class Day_So_Thuc {
    private String day_so ; 

    public void input(){
        System.out.print("Nhap vao Day so Thuc: ");
        Scanner scanner  = new Scanner(System.in) ; 
        day_so = scanner.nextLine() ;
        day_so = day_so.trim();
        day_so = day_so.replaceAll("\\s+", " ") ; 
        System.out.println("Day So Thuc Vua Nhap: " + day_so); 
    }


    public void so_nho_nhat(){
        String M[] = day_so.split("\\s+") ; 
        for (String string : M) {
            System.out.println(string);
        }

        Double min = Double.parseDouble(M[0]) ; 
        for(int i = 0 ; i<M.length ; i++){
            double tmp = Double.parseDouble(M[i]) ; 
            if(min > tmp ) min = tmp ; 
        }
        System.out.println("So Nho Nhat: " + min);
    }

    public void sap_xep(){
        String M[] = day_so.split("\\s+") ; 
        for(int  i = 0 ; i<M.length-1 ; i++){
            for(int j = i+1 ; j<M.length ; j++){
                double tmp1 = Double.parseDouble(M[i]) ; 
                double tmp2 =  Double.parseDouble(M[j]) ;
                if(tmp1 < tmp2){
                    String tmp = M[i] ; M[i] = M[j] ; M[j] = tmp ; 
                }
            }
        }
        
        System.out.print("Day Sau Khi Duoc Sap Xep: ");
        for(int  i = 0 ; i<M.length; i++){
            System.out.print(M[i] + " ");
            
        }
        System.out.println();
    }





}
