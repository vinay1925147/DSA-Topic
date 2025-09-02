 import java.util.*;
 class EvenOdd {
    public static void main (String args []){
        Scanner sc   = new Scanner (System.in);
        int num =  sc.nextInt();
       // int a= num & 1;
        if( (num&1)==1 ){
            System.out.println( "number is odd");
         }else{
            System.out.println("number is even ");
         }

     

    }
    
}
