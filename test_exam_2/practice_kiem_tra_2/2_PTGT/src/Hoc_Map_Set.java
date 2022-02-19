import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hoc_Map_Set {

    public static void main(String args[]) {
        // init map
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        // add elements to map
        map.put(1, "Java");
        map.put(3, "C++");
        map.put(3, "C+");
        map.put(2, "PHP");
        map.put(4, "Python");
        map.put(4, "Pyt346yerhon");
        // show map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
