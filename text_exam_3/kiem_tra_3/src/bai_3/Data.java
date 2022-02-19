import java.io.PushbackReader;
import java.util.ArrayList;

public class Data {
    private int index ;
    public int i ; 
    private boolean check;
    private String cauhoi ; 
    public ArrayList<String> kq = new ArrayList<String>();
    public ArrayList<String> ans = new ArrayList<String>();
    public Data() {
        index = 1;
        check = true;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public String getCauhoi() {
        return cauhoi;
    }
    public void setCauhoi(String cauhoi) {
        this.cauhoi = cauhoi;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public boolean isCheck() {
        return check;
    }
}
