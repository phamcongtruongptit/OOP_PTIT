package packet1;

public class Student extends PerSon {
    private String id  ;

    public Student(String name, String add, String id) {
        super(name, add);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + "]" + name + " " + add;
    }

    public void testStuednt(){
        System.out.println("student");
    }
    
    
}
