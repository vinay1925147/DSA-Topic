import java.util.*;
public class Swap {
    public static void main(String [] args){
        Scanner   sc  = new Scanner (System.in);
        System.out.println("enter a num1 :");
        int   a = sc.nextInt();
        System.out.println("enter a num2 :");
        int b = sc.nextInt();
        System.out.println("enter a num3 :");
        int c = sc.nextInt();
        // int sum = a+b;
        // System.out.println(sum);
        a= a+b;
        b= a-b ;
        c= c-b;  
      
        System.out.println("swaping of a = " +a + " ,b="+ b + ", c=" +c);
    }
    
}
