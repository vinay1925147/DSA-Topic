import java.util.Scanner;
class Basicmnp {
    public static void main (String args []){
       int a=5, d=1;
       int b=6;
       int c= -1; 
       System.out.println(a&b); 
       System.out.println(a|b);
       System.out.println(a^b);
       System.out.println(~c);
       System.out.println(b<<d );
       System.out.println(b>>d);
       Scanner sc = new Scanner (System.in);
       int x = sc.nextInt();
       int xor = x^x;
       System.out.println(xor);

     //////////// find X-OR from 1 to n
       int result = 0;
       int n=12;
       for (int i=1; i<=n ; i++){
         result = result ^ i;
         System.out.print(result);
       }
       // System.out.println(result);
    }
    } 
    