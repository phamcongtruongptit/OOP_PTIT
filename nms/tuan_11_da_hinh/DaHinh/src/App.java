import packet1.PerSon;
import packet1.Student;

public class App {
    public static void main(String[] args) throws Exception {
        // PerSon a = new Student("Nguyen Van A","Hai Phong" , "B19DCAT202") ; 
        // System.out.println(a);
        PerSon p = new Student("B19DCTA2020","Truong" , "Nghe An") ; 
        Student x  = (Student)p ; 

        System.out.println(x); // loi/ vi 
    }
}
