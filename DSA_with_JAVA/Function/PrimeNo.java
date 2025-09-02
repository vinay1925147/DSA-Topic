import java.util.*;
public class PrimeNo{
//     public static void  main( String []args){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter a number:");
//         int n =sc.nextInt();
//         for (int i=2 ; i<=n ; i++){
//         if(n%i==0){
//             System.out.println(" not prime ");
//         }
//         else {
//             System.out.println(" prime ");
//         }

//     }
// }
// }
public static boolean isprime(int n)  {
    for(int i=2; i<=n-1; i++){
        if(n%i==0){
           return false;
        }
    }
    return true ;
}
public static void primerange(int n){
    int i;
    for( i=2 ; i<=n ;i++){
      if(isprime(i)){
        System.out.print(" "+i);
      }
     }
     
     System.out.println("");
     }

public static void  main( String []args){
           Scanner sc = new Scanner (System.in);
           System.out.println("enter a number:");
           int n =sc.nextInt();
          primerange(n);
}}        
