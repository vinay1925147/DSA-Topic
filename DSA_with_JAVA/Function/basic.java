import java.util.*;
public class basic {
        public static boolean isEven( int n ){
           if (n%2==0)
             return true;
           else 
             return  false;
           }   
        
          
       public static void main (String []args){
        Scanner sc = new Scanner (System.in);
         System.out.println("enter a number :");
        int n = sc.nextInt();
          isEven(n);  // function call 
         System.out.println((isEven(n)));
        return; 
    }
}
