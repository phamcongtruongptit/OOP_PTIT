
package dienthoai;
import java.util.Scanner;

public class DSDT {
     private DienThoai[] list;
     private Scanner in;
     private int n;
    public DSDT() {
        //nhap vao cap phat list
        n=0;
        in=new Scanner(System.in);
        System.out.print("nhap so luong toi da dong dien thoai:");
        int m=Integer.parseInt(in.nextLine());
        list=new DienThoai[m];
        list[n++]=new DienThoai("S1287","Sam sung A70",12,56, true);
        list[n++]=new DienThoai("N9087","Nokia a678",23,100, false);
        list[n++]=new DienThoai("IP9087","Iphone a678",23,100, false);
        list[n++]=new DienThoai("S9087","Samsung a678",23,100, false);
    }
    private DienThoai tontaiDT(String ma){
        for (int i = 0; i < n; i++) {
            if(list[i].getMa().equalsIgnoreCase(ma))
                return list[i];
        }
        return null;
    }
    public void nhap(){
        String ma;
        String ten;
        double gia;
        int soLuong;
        boolean loai;
        String reg="(^S|^N|^IP)+\\d{4}$";
        while(true){
            System.out.print("Nhap ma:");
            ma=in.nextLine().toUpperCase();
            if(ma.matches(reg)&&tontaiDT(ma)==null)
                break;
            System.err.println("Nhap lai!!!");
        }
        System.out.print("Nhap ten:");
        ten=in.nextLine();
        System.out.print("Nhap gia:");
        gia=Double.parseDouble(in.nextLine());
        System.out.print("Nhap so luong:");
        soLuong=Integer.parseInt(in.nextLine());
        System.out.print("Nhap loai (true/false):");
        loai=Boolean.parseBoolean(in.nextLine());
        list[n++]=new DienThoai(ma, ten, gia, soLuong, loai);
    }
    public void viet(){
        System.out.println("DANH SACH DIEN THOAI");
        for (int i = 0; i < n; i++) {
            System.out.println(list[i]);
        }
    }
    public void timTheoMa(){
        System.out.print("Nhap ma can tim:");
        String ma=in.nextLine();
        DienThoai d=tontaiDT(ma);
        if(d==null)
            System.out.println("Khong tim thay");
        else
            System.out.println(d);
    }
    //tim chinh xac theo ten
    //tim co ten thay
    //voi gia trong khoang tu:   den:
    //voi gia it hon
    //voi gia cao
    //dien thoai moi, cu
    //....
     //sap xep: ma,ten,so luong,gia...tang dan giam dan
    public void sapxepTheoMa(){
        System.out.println("chua sap xep");
        viet();
        System.out.println("sau khi sap xep theo ma");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(list[i].getMa().compareToIgnoreCase(list[j].getMa())>0){
                    DienThoai d=list[i];
                    list[i]=list[j];
                    list[j]=d;
                }
            }
        }
        viet();
        
    }
}
