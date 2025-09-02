import java.util.Scanner;
public class Create2Darray {
 /// find the largest and smallest  number 
    public static int  maxmin(int num1[][] ,int key){
        int largest = Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num1[0].length;j++){
                 largest = Math.max(largest , num1[i][j]);
                // if(largest<num1[i][j]){
                //     largest = num1[i][j];
                
                smallest = Math.min(smallest ,num1[i][j]);
            }
            }
         System.out.print( " largest element "+largest);
         System.out.println("");
         System.out.print("smallest element "+smallest);
         return 0;
         }
     // find the element in 2D array
    public static boolean  searching(int num1[][], int key ){
        for(int i=0;i<num1.length;i++){
        for(int j=0;j<num1[0].length;j++){
            if(num1[i][j]==key){
                 System.out.println(" key is found : ("+i+","+j+")");
                 return  true; }
            }
       }
       return false;
    }
    public static void main (String []args){
         int num[][] = { {1,2},{3,4}};
        int[][] num1 =new int [2][2];
        int n= num1.length ,m= num1[0].length;
        Scanner sc = new Scanner (System.in);
         int key = sc.nextInt();
       System.out.println("enter array element : ");
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            num1[i][j] = sc.nextInt();   
         }
    }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
        System.out.print(" "+num1[i][j]);
        }
       System.out.println(" ");
     }
    //  searching(num1 , key);
    //   maxmin(num1 ,key);
    }
}

