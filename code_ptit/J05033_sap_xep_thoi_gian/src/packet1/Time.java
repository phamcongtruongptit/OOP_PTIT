package packet1;

public class Time {
    private int hour , mins , seconds ; 
    public Time(int hour , int mins , int seconds){
        this.hour = hour ; 
        this.mins = mins ; 
        this.seconds = seconds ; 
    }
    public int getHour() {
        return hour ; 
    }
    public int getMin() {
        return mins ; 
    }
    public int getSecond() {
        return seconds ; 
    }

    public static int cmp(Time a, Time b){
        if(a.hour > b.hour) return -1 ;
        else if(a.hour < b.hour) return 1 ; 
        else if(a.mins > b.mins) return -1 ;
        else if(a.mins < b.mins) return 1 ; 
        else if(a.seconds > b.seconds) return -1 ; 
        else if(a.seconds < b.seconds) return 1 ; 
        else return 0 ;
    }
    
    public String toString() {
        return hour+ " " + mins +" " + seconds ;
    }
}
