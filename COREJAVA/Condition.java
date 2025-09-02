// import java.util.*;
// public class Condition {
//     public static void main (String [] args){
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if(a==b){
//             System.out.println("equal");
           
//          }else if(a<b){
//                 System.out.println("a is less than b");
//             }
//             else {
//                 System.out.println("a is greater thn b");
//                 System.out.println("a is less than b");
//             }
         
// }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
// import java.util.*;
// class Condition{
//     public static void main(String []args){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter a number:");
//          double temp = sc.nextDouble();
//         if(temp>100){
//             System.out.println("fever");
//         }else
//         {
//              System.out.println(" Not fever");
//         }
//      TERNORY OPERATOR
//         String   name = (temp>100)? ("fever" ):( "not fever");
//       System.out.println(name);
    
// }
// }
public class Condition {
    public static void main(String args[]) {
    int a = 63, b = 36;
    boolean x = (a < b ) ? true : false;
    int y= (a > b ) ? a : b;
  System.out.println(x);  
  System.out.println(y);  

    }
}