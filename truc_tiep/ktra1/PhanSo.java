
package ktra1;


public class PhanSo {
    private int tu,mau;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public void nhap(){
        
    } 
    private int UCLN(){
        int a=Math.abs(tu),b=Math.abs(mau);
        while(a>0){
            if(a<b){
                int t=a;
                a=b;
                b=t;
            }
            a=a%b;
        }
        return b;
    }
    private void rutGon(){
        int u=UCLN();
        tu=tu/u;
        mau=mau/u;
    }
    public void viet(){
        rutGon();
        //if(tu<mau)
        if(mau<0)
              System.out.println((-tu)+"/"+Math.abs(mau));
        else
            System.out.println(tu+"/"+mau);
//        else if (tu%mau==0)
//            System.out.println(tu/mau);
//        else{
//            int v=tu/mau,u=tu%mau;
//            System.out.println(v+" "+u+"/"+mau);
//        }
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }
    
    public PhanSo tong(PhanSo b){
        PhanSo t=new PhanSo();
        t.setTu(tu*b.getMau()+b.getTu()*mau);
        t.setMau(b.getMau()*mau);
        t.rutGon();
        return t;
    }
    public PhanSo hieu(PhanSo b){
        PhanSo t=new PhanSo();
        t.setTu(tu*b.getMau()-b.getTu()*mau);
        t.setMau(b.getMau()*mau);
        t.rutGon();
        return t;
    }

    public PhanSo tich(PhanSo b){
        PhanSo t=new PhanSo();
        t.setTu(tu*b.getTu());
        t.setMau(b.getMau()*mau);
        t.rutGon();
        return t;
    }
    
    public PhanSo thuong(PhanSo b){
        PhanSo t=new PhanSo();
        t.setTu(tu*b.getMau());
        t.setMau(mau*b.getTu());
        t.rutGon();
        return t;
    }
}
