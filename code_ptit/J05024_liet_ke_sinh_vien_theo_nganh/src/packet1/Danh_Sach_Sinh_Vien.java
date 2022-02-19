package packet1;

import java.util.ArrayList;
import java.util.Scanner;

public class Danh_Sach_Sinh_Vien {
    private ArrayList<Sinh_Vien> M = new ArrayList<Sinh_Vien>() ; 
    private ArrayList<String> TV = new ArrayList<String>() ; 
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ; 
        scanner.nextLine() ;
        for(int i = 1; i<=n ; i++){
            Sinh_Vien T = new Sinh_Vien(scanner.nextLine() , scanner.nextLine() , scanner.nextLine() , scanner.nextLine() );
            M.add(T) ; 
        }
        int q = scanner.nextInt() ; 
        scanner.nextLine() ;
        for(int i = 1; i<= q ; i++){
            String tmp = scanner.nextLine() ; 
            if(tmp.equalsIgnoreCase("Ke toan")){
                TV.add("DCKT") ;
            } else if(tmp.equalsIgnoreCase("Cong nghe thong tin")){
                TV.add("DCCN") ;
            }
            else if(tmp.equalsIgnoreCase("An toan thong tin")){
                TV.add("DCAT") ;
            }
             else if(tmp.equalsIgnoreCase("Vien thong")){
                 TV.add("DCVT") ; 
            }
             else 
                TV.add("DCDT") ;
            
        }
    }

    private String ten_nganh(String s){
        if(s.equals("DCKT") == true) return "Ke toan" ; 
        if(s.equals("DCCN") == true) return "Cong nghe thong tin" ; 
        if(s.equals("DCAT") == true) return "An toan thong tin" ; 
        if(s.equals("DCVT") == true) return "Vien thong" ; 
        else  return "Dien tu" ;
    }

    public void output(){
        // for(int i = 0 ; i<TV.size() ; i++){
        //     System.out.println(TV.get(i)  +"---"+ M.get(i).getNganh() + "---" + M.get(i).getHeDaoTao());
        // }


        for(int i = 0 ; i<TV.size() ; i++){
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n" , ten_nganh(TV.get(i)).toUpperCase());
            for(int  j = 0 ; j<M.size() ; j++){
                if(M.get(j).getNganh().equals(TV.get(i))) {
                    if( (TV.get(i).equals("DCCN") || TV.get(i).equals("DCAT"))){
                        if(!M.get(j).getHeDaoTao().equals("E")){
                         System.out.println(M.get(j));
                        }
                    } else {
                        System.out.println(M.get(j));
                    }
                }

            }
        }
    }
}