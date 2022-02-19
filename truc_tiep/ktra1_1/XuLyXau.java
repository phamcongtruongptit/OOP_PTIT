import java.util.Arrays;
import java.util.Scanner;

public class XuLyXau {
   /*
    4.	Nhập vào 1 đoạn
5.	Đưa ra độ dài xâu
6.	Tách các từ trong đoạn (có cả số và dấu cách)
    */
    private String st;
    public XuLyXau(){
       Scanner in=new Scanner(System.in);
        System.out.print("Nhap vao xau:");
        st=in.nextLine().trim();
    }
    public void dodai(){
        System.out.println("Do dai:"+st.length());
    }
    public void tachTu(){
        System.out.println("xau ban dau:"+st);
        String re="[\\d\\s]+";
        String[] tu=st.split(re);
        System.out.println("Xau:"+Arrays.toString(tu));
    }
}
