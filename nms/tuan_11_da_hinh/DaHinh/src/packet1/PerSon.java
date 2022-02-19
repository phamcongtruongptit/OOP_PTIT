package packet1;

public class PerSon {
    protected String name, add ;

    public PerSon(String name, String add) {
        this.name = name;
        this.add = add;
    }

    @Override
    public String toString() {
        return "PerSon [add=" + add + ", name=" + name + "]";
    } 
    public void tesstPertson(){
        System.out.println("person");
    }

}
