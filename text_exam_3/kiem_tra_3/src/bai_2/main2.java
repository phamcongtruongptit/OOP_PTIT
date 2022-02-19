import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class main2 {
    public static long check (int n ){
        Queue<String> q = new LinkedList<>();
        q.add("9");
        long k = 0 ; 
        while(!q.isEmpty()){
            String tmp = q.poll();
            long x = Long.parseLong(tmp);
            if(x%n==0){
                k = x ; break ;  
            }
            q.add(tmp+"0");
            q.add(tmp+"9");
        }
        return k ;
    }
    public static void main(String[] args) {
        String name = "in.txt" ; 
        ArrayList<Long> list = new ArrayList<>() ; 
        try {
            BufferedReader reader = new BufferedReader(new FileReader(name)) ; 
            String line ; 
            while ((line = reader.readLine()) != null){
                int num = Integer.parseInt(line.trim()) ;
                list.add(check(num)) ; 
            }
            reader.close();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        String out = "out.txt" ; 
        try {
            PrintWriter pr = new PrintWriter(out) ;  
            for (long string : list) {
                pr.println(string);
            }
            pr.close();
        } catch (FileNotFoundException t) {
            System.out.println(t);
        }


    }
  

}
