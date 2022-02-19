package packet1;

public class GiaiPT {
    private int a , b  ; 
    public void input(int a , int b ){
        this.a = a ;
        this.b = b ;
    }
    public void giai_pt(){
        if(this.a == 0 && this.b == 0) System.out.println("VSN") ; 
        else if(this.a == 0 && this.b != 0) System.out.println("VN");
        else {
            double kq = ((double)this.b * -1 ) / this.a ;
            System.out.printf("%.2f" , kq);
        }
        
    }
    
}
