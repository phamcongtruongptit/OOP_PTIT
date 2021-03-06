
import java.util.*;
public class Test {
    static int M=(int) (1E9+7);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        while(true) {
            int a=sc.nextInt();
            long b=sc.nextLong();
            if(a==0&&b==0)
                break;
            System.out.println(power(a,b));
        }
    }
    public static long power(int n, long k) {
        if(k==0)
            return 1;
        long x = power(n,k/2);
        if(k%2==0)
            return x*x%M;
        return x*x%M*n%M;
    }
}