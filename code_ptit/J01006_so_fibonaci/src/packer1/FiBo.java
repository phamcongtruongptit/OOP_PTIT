package packer1;

public class FiBo {
    public static long FiBoThuN(int n){
        long M[] = new long[93] ;
        M[1] =1 ; M[2] =1 ;
        for( int i=3 ; i<93 ; i++){
            M[i] = M[i-1] + M[i-2] ;
        }
        return M[n] ;
    }
}
