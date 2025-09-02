import java.util.*;
public class ButterFly {
    public static void main(String[] args) {
        Scanner sc =new Scanner ( System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
       // upper half 
    //     for (int i=1 ; i<=n ;i++){
    //         for (int j=1 ; j<=i ; j++){
    //             System.out.print("*");
    //          }
    //         for (int j=1 ; j<=2*(n-i); j++){
    //             System.out.print(" ");
    //         }
    //         for (int j=1 ; j<=i ; j++){
    //             System.out.print("*");
    //         }
   //             System.out.println();
    //          }
    //             for (int i=n ; i>=1;i--){
    //             for (int j=1 ; j<=i ; j++){
    //                 System.out.print("*");
    //              }
    //             for (int j=1 ; j<=2*(n-i); j++){
    //                 System.out.print(" ");
    //             }
    //             for (int j=1 ; j<=i ; j++){
    //                 System.out.print("*");
    //             }
               
    //             System.out.println();
              
    //         } 
    //     }
    // }
    ///hollow butterfly
              for (int i=1 ; i<=n ;i++)
              {
                for (int j=1 ; j<=i ; j++){
                    if(i==n || (j==1 || j==n || j==i))
                        System.out.print("*");
                      else {
                        System.out.print(" ");
                     }}
                    for (int j=1 ; j<=2*(n-i); j++){
                        System.out.print(" ");
                    }
                    for (int j=1 ; j<=i ; j++){
                        if(i==n || (j==1 || j==n || j==i))
                        System.out.print("*");
                      else
                        System.out.print(" ");
                     
                    }
                    
                    System.out.println();
                } 
                     
               for (int i=n ; i>=1;i--)
               {
                      for (int j=1 ; j<=i ; j++) {
                           if(i==n || (j==1 || j==n ||j==i))
                                    System.out.print("*");
                             else
                                System.out.print(" ");
                        }    for (int j=1 ; j<=2*(n-i); j++){
                                System.out.print(" ");
                            }
                            for (int j=1 ; j<=i ; j++)
                                {
                                    if (i==n || (j==1 || j==n ||j==i))
                                             System.out.print("*");                             
                                     else
                                         System.out.print(" ");
                                }          
                            System.out.println();
                            } 
                
                    }}