package packet1;

public class Nguoi_Choi {
    private String name , id ;
    private int hour , min ; 
    private String gio (String s){
        return s.substring(0,s.indexOf(":")) ; 
    }
    private String phut(String s){
        return s.substring(s.indexOf(":") + 1) ; 
    }
    private int tinh_phut(String s1, String s2){
        int vao_gio = Integer.parseInt(gio(s1)) ; 
        int ra_gio = Integer.parseInt(gio(s2)) ;
        int vao_phut = Integer.parseInt(phut(s1)) ; 
        int ra_phut = Integer.parseInt(phut(s2)) ; 
        return (ra_gio*60 + ra_phut)-(vao_gio*60  + vao_phut) ;
    }


    public Nguoi_Choi(String id , String name , String s1 , String s2){
        this.id = id ; 
        this.name = name;
        this.min = tinh_phut(s1,s2)%60 ; 
        this.hour = tinh_phut(s1, s2)/60 ; 
    }
    public String toString(){
        return id + " " + name +" " + hour + " gio " + min  + " phut" ; 
    }

    public int compareTo(Nguoi_Choi n) {
        if(this.hour > n.hour ) return 1 ; 
        else if(this.hour < n.hour ) return -1 ; 
        else if(this.min > n.min) return 1 ; 
        else if(this.min < n.min) return -1 ; 
        else return 0 ; 

    }

}
