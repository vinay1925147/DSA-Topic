import java.util.*;
public class ReverseNo {

   /*  public static int  Product( int  a, int  b){
         return a*b;
        }
        public static int  Product( int  a, int  b,  int  c){
            return a*b*c ;
           }
          public static float  Product( float  a, float  b,  float  c){
            return a*b*c ;
           } public static void main (String args[])
    {  System.out.println( Product(5, 6));
      System.out.println( Product(5, 6, 6));
      System.out.println( Product(5.5f, 6.5f, 6.6f));
    }}    
     */
    public static int reverseNo(int num){
      int rev_num =0 ;
      int palin = num;
      while(palin >0){
        rev_num = rev_num*10 + palin%10;
        palin =palin/10;
      }
     
      return rev_num;
    }
    public static void main (String args[]){
      Scanner sc = new Scanner (System.in);
      System.out.println("enter a number :");
      int num = sc.nextInt();
      reverseNo(num);
      if( num == reverseNo(num) ){
        System.out.print("number is palindrom");
        }
        else{
          System.out.print("not palindrom");
        }
      //System.out.println(reverseNo(num));
    }
    }



    

