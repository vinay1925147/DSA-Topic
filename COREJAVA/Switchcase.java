// import java.util.*;
// class Switchcase{
//     public static void main( String []args){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter a month:");
//         int month = sc.nextInt();
//         switch(month){
//             case 1: System.out.println("janavry");
//             break;
//             case 2: System.out.println("farvary");
//             break;   
//             case 3: System.out.println("march");
//             break;
//             case 4: System.out.println("aprail");
//             break;
//             case 5: System.out.println("may");
//             break;
//             default: System.out.println( " other month" );
//         }
       
//         }
//     }
////////////////////////////////////////////////////////////////////////////////////////////////////////
//CALCULATOR
// import java.util.*;
// public class Switchcase{
//     public static void main(String []ars){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter number: a");
//          int a = sc.nextInt();
//          System.out.println("enter number b:");
//          int b = sc.nextInt();
//          System.out.println("enter operation:");
//           char operator = sc.next().charAt(0);
//          switch(operator){
//             case '+': System.out.println(a+b);
//             break;
//             case '-': System.out.println(a-b);
//             break;
//             case '*': System.out.println(a*b);
//             break;
//             case '/': System.out.println(a/b);
//             break;
//             case '%': System.out.println(a%b);
//             break;
//             default:  System.out.println("invalid calcuater");

//          }
         


//     }
// }
//////////////////////////////////////////////////////////////////////////////////////////////////
//MARKS
import java.util.*;
 public class Switchcase{
    public static void main(String []ars){
        Scanner sc = new Scanner (System.in);
          int num = sc.nextInt();
          int marks =sc.nextInt();
          while(num>1) {
             if(marks>=90){
                System.out.println("this is good");
            }else {
                if(89>= marks >=60){
                System.out.println("also good");


            }
            else{
                System.out.println("fail");
            }
          }


        }
    }
}