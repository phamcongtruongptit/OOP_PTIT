package packet1;

import java.util.Arrays;
import java.util.Scanner;

public class Da_Thuc {
    private int []M = new int[10000];
    private int n ; 
    public void Da_Thuc(){
        Arrays.fill(M,0);
    }
    public void output(){
        String ans = "" ; 
        for (int i = n; i >= 0; i--){
            if(M[i] == 0) continue ; 
            else if(i==0) ans+= M[i]+" + "; 
            else
                ans  = ans+M[i]+"x^"+i+" + "; 
        }
        System.out.println(ans.substring(0, ans.length()-3));
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap bac cua Da Thuc: ");
        n = scanner.nextInt();
        for (int i = n; i >= 0; i--){
            System.out.printf("Nhap he so x^%d: "  , i);
            M[i] = scanner.nextInt();
        }
        System.out.print("Da thuc vua nhap: ");
        output();
    }

    public Da_Thuc Tong_da_thu(Da_Thuc X){
        Da_Thuc ans = new Da_Thuc() ; 
        int max = Math.max(X.n, this.n) ; 
        ans.n = max ; 
        for(int i = max ; i>= 0 ; i--){
            ans.M[i] = X.M[i] + this.M[i] ; 
        }
        return ans ; 
    }
}
