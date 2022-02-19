

import java.util.ArrayList;
import java.util.Scanner;

import packet1.IChucNang;
import packet1.IntPhone;
import packet1.Phone;

public class PhoneBook implements IChucNang {
    ArrayList<Phone> list;
    Scanner scanner = new Scanner(System.in);




    public PhoneBook() {
        list = new ArrayList<>();
        list.add(new Phone("23" , "45685952")) ; 
        list.add(new Phone("134" , "12345567")) ; 
        list.add(new Phone("14" , "45634252")) ; 
        list.add(new Phone("156" , "85848382")) ; 
        list.add(new IntPhone("84" , "125" , "58965858")) ; 
        list.add(new IntPhone("82" , "245" , "58965858")) ; 
        list.add(new IntPhone("78" , "946" , "58965858")) ; 
        list.add(new IntPhone("14" , "145" , "58965858")) ; 
       
    }
    private int ton_tai(String sdt){
        for(int i = 0 ; i<list.size() ; i++){
            if(list.get(i).getSdt().equals(sdt)){
                return i ; 
            }
        }
        return -1 ; 
    }

    @Override
    public void them_noi_hat() {
        String res1 = "\\d{2,3}" ; 
        String res2 = "\\d{8}"  ;
        String vung , sdt ; 
        while(true){
            System.out.print("Nhap ma vung: ");
            vung = scanner.nextLine() ; 
            if(vung.matches(res1) ){
                break ;
            }
            else {
                System.out.println("Nhap lai!");
            }
        }
        while(true){
            System.out.print("Nhap sdt: ");
            sdt = scanner.nextLine() ; 
            if(sdt.matches(res2)&& ton_tai(sdt)== -1){
                break ;
            }
            else {
                System.out.println("Nhap lai sdt!");
            }
        }
        list.add(new Phone(vung , sdt)) ; 
    }

    @Override
    public void them_qt() {

        String res = "\\d{2}" ; 
        String maquocgia ;
        while(true){
            System.out.print("Nhap ma quoc gia: ");
            maquocgia = scanner.nextLine() ; 
            if(maquocgia.matches(res) ){
                break ;
            }
            else {
                System.out.println("Nhap lai!");
            }
        }
        String res1 = "\\d{2,3}" ; 
        String res2 = "\\d{8}"  ;
        String vung , sdt ; 
        while(true){
            System.out.print("Nhap ma vung: ");
            vung = scanner.nextLine() ; 
            if(vung.matches(res1) ){
                break ;
            }
            else {
                System.out.println("Nhap lai!");
            }
        }
        while(true){
            System.out.print("Nhap sdt: ");
            sdt = scanner.nextLine() ; 
            if(sdt.matches(res2)&& ton_tai(sdt)== -1){
                break ;
            }
            else {
                System.out.println("Nhap lai sdt!");
            }
        }
        list.add(new IntPhone(maquocgia,vung , sdt)) ; 
    }

    @Override
    public void in_ds() {
        System.out.println("Danh sach sdt quoc te: ");
        for (Phone phone : list) {
            if(phone instanceof IntPhone){
                phone.out();
            }
        }
        System.out.println("Danh sach sdt noi hat: ");
        for (Phone phone : list) {
            if(phone instanceof IntPhone){
                continue;
            } else {
                phone.out();
            }
        }
    }

    @Override
    public void sua_noi_hat() {
        ArrayList <Phone> n = new ArrayList<Phone>();
        for (Phone phone : list) {
            if(phone instanceof IntPhone){
                continue;
            } else {
                n.add(phone);
            }
        }
        System.out.print("Nhap sdt can sua: " );
        String sdt  = scanner.nextLine() ;
        int check = 0 ; 
        for(int i = 0 ; i<n.size() ; i++) {
            if(n.get(i).getSdt().equals(sdt)) {
                String res1 = "\\d{2,3}" ; 
                String res2 = "\\d{8}"  ;
                String vung , sd ; 
                while(true){
                    System.out.print("Nhap ma vung: ");
                    vung = scanner.nextLine() ; 
                    if(vung.matches(res1) ){
                        break ;
                    }
                    else {
                        System.out.println("Nhap lai!");
                    }
                }
                while(true){
                    System.out.print("Nhap sdt: ");
                    sd = scanner.nextLine() ; 
                    if(sd.matches(res2)){
                        break ;
                    }
                    else {
                        System.out.println("Nhap lai sdt!");
                    }
                }
                check = 1 ;
                Phone nx = new Phone(vung , sd) ; 
                n.set(i, nx) ; 
                break ; 
            }
        }
        if(check != 1) System.out.println("co dau ma sua");
        else {
            System.out.println("Danh sach noi hat: ");
            for (Phone phone : n) {
                phone.out();
            }
        }
    }
    
}
