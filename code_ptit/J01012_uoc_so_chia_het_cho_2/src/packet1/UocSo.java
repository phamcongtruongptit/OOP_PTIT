package packet1 ; 
public class UocSo {

    public static int uoc_so_2(int n){
        int count = 0;
        for(int i=1 ; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                if(i != n/i){
                    if( (n/i) %2 ==0) count++ ; 
                    if(i%2 == 0 ) count++;
                } else {
                    if(i%2 == 0) count++;
                }
            }
        }
        return count ; 
    }
}