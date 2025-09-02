import java.util.Scanner;

public class Pyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter row no.");
         int n =sc.nextInt();
//         for (int i=1;i<=n;i++){
//             for(int j=1; j<=i; j ++){
//                 System.out.print(j );
//                 j=j+2;
//             }
//             System.out.println("  ");
//         }
//     }
// }
     
    //  for(int i=1 ; i<=n ; i++){
    //     //space
    //     for (int j=1 ; j<=(n-i); j++){
    //         System.out.print("  ");
    //     }
    //     //star
    //     for(int j=1;j<=i; j++){
           
    //         System.out.print(" * " );
            
    //     }
    //     System.out.println(  );
    //  }
    // }}
//////////////////////
//inverted pyramid

 for (int i=1;i<=n; i++){
    for(int j=1; j<=i; j++){
         int  sum =i+j;
        if (sum%2==0)
          System.out.print("1");
         else
         System.out.print("0"); 
         } 
         System.out.println("");
}
///////////////////////////////////////////////
//Actual Number Pyramid
// for (int i=1 ; i<=n; i++){
//     for (int j=1 ; j<=n-i ;j++ ){
//         System.out.print(" ");
//     }
//         {
//             for ( int  j=1 ; j<=i ;j++){
//                 System.out.print(i+ "  " );
//             }
//         } 
//          System.out.println( );
//     }
  
// }
// }
// PALENDROM PYRAMID
 for(int i= 1; i<=n ; i++){
    for (int j=1 ; j<=n-i; j++){
        System.out.print(" ");
    }
    for (int j=i ; j>=1 ; j--){
        System.out.print(j+"");
    }
    for (int j=2 ; j<=i ; j++){
        System.out.print(j+"");
 }
 System.out.println(" ");
}}}