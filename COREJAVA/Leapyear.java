import java.util.Scanner;

public class Leapyear {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter  Year :");
        int year = sc.nextInt();

        boolean x= (year%4)==0;
        boolean y =  ( year%100) != 0;
        boolean z = (year%1000)==0 && (year%400)==0;


        

        if( x || y&&z) {
             System.out.println("this is leap year");
        } else {
            System.out.println("not leep year");
        }



    }
}
