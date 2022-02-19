package class4;




public class Main2 {
    public static void main(String[] args) {
        //1. tao 1 khung: - - - -
        //2. SinhVien: 
        //3. 
        CaiDat c=new CaiDat();
        c.viet();
        OopSinhVien o=new OopSinhVien() {
            private  int n=9;
            @Override
            public void diem(SinhVien sv) {
                System.out.println("gia tri:"+n);
                sv.diHoc();
            }

            @Override
            public void hienthi() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        SinhVien s=new SinhVien();
        o.diem(s);
        
    }
    
}
