
package ktra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;


public class QLPTGT implements ChucNang{
    private List<PTGT> list;
    private Scanner in=new Scanner(System.in);

    public QLPTGT() {
        
        list=new ArrayList<>();
        list.add(new Oto("HN876","yaris",2021, 800000, "do", "cho nu", 4));
        list.add(new XeMay("HN321", "Vision",2014, 38000, "Xam", 150));
        list.add(new XeMay("HN881", "spacy",2000, 10000, "trang", 200));
        list.add(new Oto("HN111","yaris",2000, 120000, "Do", "cho nu", 7));
        list.add(new Oto("HN999","yaris",2014, 900000, "do", "cho nu", 16));
        list.add(new Oto("HN666","yaris",2021, 30000, "xanh", "cho nu", 7));
    }
    
    @Override
    public boolean nhap(PTGT p) {
        //check
        return list.add(p);
    }
    @Override
    public void vietDS() {
        System.out.println("Danh sach oto");
        for(PTGT i:list)
            if(i instanceof Oto)
                System.out.println(i);
        System.out.println("Danh sach Xe may");
        for(PTGT i:list)
            if(i instanceof XeMay)
                System.out.println(i);
        System.out.println("---------------");
    }

    @Override
    public void sua() {
        System.out.print("nhap ma can sua:");
        String ma=in.nextLine();
        int vt=vitri(ma);
        if(vt==-1)
            System.out.println("co dau ma sua!");
        else{
            PTGT p=list.get(vt);
            System.out.print("nhap hang:");
            String hang=in.nextLine();
            System.out.print("nhap nam:");
            int nam=Integer.parseInt(in.nextLine());
            System.out.print("nhap gia:");
            double gia=Double.parseDouble(in.nextLine());
            System.out.print("nhap mau:");
            String mau=in.nextLine();
            p.setHang(hang);
            p.setNam(nam);
            p.setGia(gia);
            p.setMau(mau);
            System.out.println("sua thanh cong!!");
        }
    }
    private int vitri(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    @Override
    public void xoa() {
        System.out.print("nhap ma can xoa:");
        String ma=in.nextLine();
        int vt=vitri(ma);
        if(vt==-1)
            System.out.println("co dau ma xoa!");
        else{
            list.remove(vt);
            System.out.println("xoa thanh cong!!");
        }
            
    }
   //tim chinh xac
    @Override
    public void timThemMa() {
        System.out.print("nhap ma can tim:");
        String ma=in.nextLine();
        int vt=vitri(ma);
        if(vt==-1)
            System.out.println("khong tim thay!");
        else{
            System.out.println(list.get(vt));
        }
    }
    //tim gan dung - chua
    @Override
    public void timTheoHang() {
        System.out.print("nhap hang can tim:");
        String h=in.nextLine();
        boolean co=false;
        for(PTGT i:list){
            if(i.getHang().toLowerCase().indexOf(h.toLowerCase())>=0){
                System.out.println(i);
                co=true;
            }
        }
        if(!co){
            System.out.println("Khong tim thay!!!");
        }
    }

    @Override
    public void timTheoNam() {
        System.out.print("Tu nam:");
        int n1=Integer.parseInt(in.nextLine());
        System.out.print("Den nam:");
        int n2=Integer.parseInt(in.nextLine());
        boolean co=false;
        for(PTGT i:list){
            if(i.getNam()>=n1 && i.getNam()<=n2){
                System.out.println(i);
                co=true;
            }
        }
        if(!co)
            System.out.println("khong co PT nao!!");
    }

    @Override
    public void timPTDatDo() {
        System.out.print("nhap muc gia:");
        double g=Double.parseDouble(in.nextLine());
        
        boolean co=false;
        for(PTGT i:list){
            if(i.getGia()>g){
                System.out.println(i);
                co=true;
            }
        }
        if(!co)
            System.out.println("khong co PT nao!!");
    }

    @Override
    public void sapxepTheoMa() {
        Collections.sort(list);
    }

    @Override
    public void sapxepTheoNam() {
        //Collections.sort(list);
        Collections.sort(list, new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                //tang dan
                //return o1.getNam()-o1.getNam();
                //giam dan
                return o2.getNam()-o1.getNam();
            }
             
        });
    }

    @Override
    public void sapxepTheoGia() {
        list.sort(new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        });
    }

    @Override
    public void sapxepTheoSCvaMau() {
        //lay ds oto
        List<Oto> o=new ArrayList<>();
        for(PTGT i:list)
            if(i instanceof Oto)
                o.add((Oto)i);
        
        o.sort(new Comparator<Oto>() {
            @Override
            public int compare(Oto o1, Oto o2) {
                if(o1.getSocho()==o2.getSocho())
                    return o1.getMau().compareToIgnoreCase(o2.getMau());
                else
                    return o1.getSocho()-o2.getSocho();
            }
        });
        //viet ra ds Oto da sap xep
        for(Oto i:o)
            System.out.println(i);
         
    }
    public void tim(String ma){
        Comparator<PTGT> c=new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o1.getMa().compareToIgnoreCase(o2.getMa());
            }
        };
        Oto o=new Oto(ma, "", 0, 0, "", "", 0);
        int pos=Collections.binarySearch(list, o, c);
        if(pos>=0)
            System.out.println(list.get(pos));
    }
    //map key group by : min, max, sum avg count
    //dem nhoms theo nam int - long
    public void countTheoNam(){
        Map<Integer, Long> count=list.stream().collect(
                Collectors.groupingBy(PTGT::getNam,Collectors.counting() ));
        System.out.println(count);
    }
    public void countTheoMau(){
        Map<String, Long> count=list.stream().collect(
                Collectors.groupingBy(PTGT::getMau,Collectors.counting() ));
        System.out.println(count);
    }
    public void sumTheoMau(){
        Map<String,Double> sum=list.stream().collect(
                Collectors.groupingBy(PTGT::getMau,Collectors.summingDouble(
                        PTGT::getGia)));
        Iterator i=sum.keySet().iterator();
        while(i.hasNext()){
            String key=(String)i.next();
            Double value=sum.get(key);
            System.out.println(key+": tong gia "+value);
        }
    }
    //dua ra PT co gia cao nhat - max
    public void maxGia(){
        Optional<PTGT> max=list.stream().collect(Collectors.maxBy(
        Comparator.comparing(PTGT::getGia)));
        System.out.println(max.isPresent()?max.get():"DS ronf");
    }
    //max or min group by
    public void maxByGiaGroupbyMau(){
        
        Map<String,PTGT> o=list.stream().collect(Collectors.groupingBy(
                PTGT::getMau,Collectors.collectingAndThen(
                        Collectors.reducing((PTGT p1,PTGT p2) -> 
                        p1.getGia()> p2.getGia()?p1:p2),
                   Optional::get)));
        System.out.println(o);
    }
    @Override
    public void thongke() {
        
    }
    
}
