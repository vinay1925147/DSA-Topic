
import java.util.*;
public class Table {
   
   public static int  printNsum( int n){
      int sum= 0;
      for(int i=1; i<=n; i++){
        sum= sum+i;
      }     System.out.println( "  sum of natural number : " + sum);
            return sum ;
    }
    public static void printtable( int n){
      int table ;
      for(int i=1; i<=12; i++){
         table = n*i;
         System.out.println( "n number of Table :" + table  );
      }
        return ;
    }
    public static int  printNsquare( int n){
      int total  =0;
      for(int i=1; i<=n; i++){
         total = total +(i*i);
         }
        System.out.println( "    sum of square of  numbers:" + total );
        return total ;
    }
    public static int Fibonacci( int n){
      int num1 =0;
      int num2 = 1;
      System.out.print(" "+num1 +" "+ num2);
      for (int i=1;i<=n ; i++){
        int num3 ;
        num3 = num1 + num2;
        System.out.print( " fibonacci  numbers are : "+num3);
        num1 = num2 ;
        num2 = num3;
      }
     return 1;
    }
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("entr a number: ");
      int n = sc.nextInt();
       printNsum(n);
       printtable(n);
       printNsquare(n);
       Fibonacci(n);
}
}



