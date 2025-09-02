import java.util.Scanner;
public class Aparameter {
    public static void rotate(int marks[],int k){
        for(int j=marks.length-1;j>=0;j--){
             System.out.print(marks[j]);
        }
        System.out.println();
        for(int j=marks.length-1;j>=1;j--){
            System.out.print( marks[j]);
          }
          System.out.println( );
       for(int i=0;i<marks.length;i++){
        System.out.print(" "+marks[i]);
       }
       System.out.println();
  }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        int marks[] = new int[n];
        for(int i= 0; i<marks.length;i++){
            marks[i] = sc.nextInt();   
         }
        for(int i= 0; i<marks.length;i++){
           System.out.print(marks[i]+" ");
        }
       
        rotate(marks,1);

   


      
        
        
    }
}
