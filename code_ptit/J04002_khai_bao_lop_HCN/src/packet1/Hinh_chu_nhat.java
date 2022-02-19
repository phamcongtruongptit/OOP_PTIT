package packet1;

public class Hinh_chu_nhat {
    private double width , height ;
    private String color ;
    public Hinh_chu_nhat(){
        this.width = 1 ; 
        this.height = 1 ; 
    }
    public Hinh_chu_nhat(double width , double height , String color ){
        this.width = width ; 
        this.height = height ; 
        this.color = color ;
    }

    public double getWidth(){
        return this.width ;
    }
    public double getHeight(){
        return this.height ;
    }
    public String getColor(){
        return this.color ;
    }

    public void setWidth(double width){
        this.width = width ; 
    }
    public void setHeight(double height){
        this.height = height ; 
    }
    public void setColor(String color){
        this.color = color ; 
    }

    public double find_Area(){
        return width*height ; 
    }
    public double find_Perimeter(){
        return (width+height)*2 ; 
    }
    public String toString(){
        color = color.toLowerCase() ; 
        return (int)find_Perimeter() + " " + (int)find_Area() + " " + Character.toUpperCase(color.charAt(0)) + color.substring(1) ; 
    }

}
