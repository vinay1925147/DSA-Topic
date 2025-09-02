import java.util.Scanner;
class Pactice{
    public static int rcsum(int arr[][]){
        int sum =0;
        for(int i=0; i<arr.length;i++){
            if(i== 1){
           for(int j=0;j<arr[0].length;j++)
                {  if(j==1)
                   sum += arr[i][j];
                }
           }
        }
             return sum;
        }
         public static int arrSum(int  arr[][] , int arr1 [][] ,int size1,int size2)
         { 
            int sumarr[][] = new int [size1][size2] ;

               for (int i=0; i<size1;i++){
                for (int j=0; j<size2;j++){
                    sumarr[i][j] = arr[i][j] + arr1[i][j];
                } }
                System.out.println("sum of two  arrays : ");
                for (int i=0; i<3;i++){
                    for (int j=0; j<3;j++){
                        System.out.print( " "+sumarr[i][j]);
                    }System.out.println(" ");
                }
            return 0;
         }

        public static void main(String[] args) {
            Scanner sc=  new Scanner (System.in);
           int size1 = sc.nextInt();
           int size2 = sc.nextInt();
           int arr[][] = new int [size1][size2];
           int arr1[][] = new int [size1][size2];
        //  int arr[][] = {{1,2,3},{1,3,4},{5,6,7}};
        //  int arr1[][] = {{4,5,6},{5,4,3},{2,3,1}};
            int count = 1;
            for(int i=0; i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                   arr[i][j] = sc.nextInt();
                }}
         System.out.println("First   matrix  :");
          for(int i=0; i<arr.length;i++){
          for(int j=0;j<arr[0].length;j++){
              System.out.print(" "+arr[i][j]);
                // if(arr[i][j] == 1)
                //  count++;
            }
                System.out.println( );
         }
         for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
             arr1[i][j] = sc.nextInt();
            }
        }
         System.out.println(" second matrix :");
         for(int i=0; i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                System.out.print(" "+arr1[i][j]);
                 }
                  System.out.println( );
           }

    
       System.out.println( " count : "+count);
       System.out.println( " sum of single row or column "+rcsum(arr));
       System.out.println( "'Number of rows:"+arr.length);
       System.out.println( "'Number of columns:"+arr[0].length);
       System.out.println( "order of matrix is :"+arr.length + ""+"*"+""+arr[0].length);
       arrSum(arr, arr1 , size1 , size2);
    }
}
