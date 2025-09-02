import java.util.*;
public class Binomialco {
    public static int factorial(int n ){
        int fact=1; 
        for(int i=n ; i>=1 ; i--){
            fact =  fact * i;
        }
         return fact;
    }    
    public static int Bicoffi( int n, int r){
              int fact_n = factorial(n);
              int fact_r =factorial(r);
              int fact_nmr =factorial(n-r);
             int bino = fact_n/(fact_r * fact_nmr);
            
             return bino;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int r = sc.nextInt();
        System.out.println( Bicoffi(n,r)  );

    }
    
}
