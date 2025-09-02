import java.util.Scanner;
public class Conversion {
    public static  int BtD(int number){
        //int deci=0;
        int bi =0 ;
        int pow =0;
        //int pow =0 ;
        while (number>0){
         /* Binary to Decimal
         int  LD = number % 10;
             deci = deci +( LD *(int) Math.pow(2,pow));
             pow++;
             number = number /10; */  
        // Decimal to Binary
         int rem = number%2;
         bi = bi + (rem * (int)Math.pow(10,pow));
         pow++;
         number=number/2;
         }
        System.out.println( "conversion of decimal number  " +number+ " to binary number is : "+ bi);
        return  bi;

    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter a number: ");
    int number = sc.nextInt();
    BtD(number);


    }
}
