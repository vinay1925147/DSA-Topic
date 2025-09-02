import java.util.Arrays;

class Hello{
    public  static int getSecondLargest(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int i,j;
        Arrays.sort(arr);
        for( i=0;i<=arr.length-1;i++){
            for( j=0;j<=arr[0].length-1;j++){
               if(max<arr[i][j]){
                max=arr[i][j];
            }
           // secondlargest=Math.max(max, arr[i][j]);
           }
        }
        return max;
    }
    public static int squareSum(int n ){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            sum1 += (int)Math.pow( i, 1);
            sum2 +=  (int)Math.pow( i, 2);
        }
         System.out.println("sum of natural : "+sum1 );
         System.out.println("sum of square of number :"+sum2);
         int sqsum=(int)Math.pow(sum1,2);
         int absdiff = Math.abs(sqsum-sum2);
         return  absdiff;
     }
     public static void armstrong(double arr[]){
        double sum=0;
          for(int i=0;i<arr.length;i++){
              sum+=Math.pow(arr[i],3);
          }
          System.out.println((int)sum);
          if(sum==153){
            System.out.println( " is armstrong ");
          }
          else{
            System.out.println(" not armastrong");
          }
     }
    public static void main(String args[]){
        double arr[]= {1,5,3};
        int num=5;
    //    System.out.println(squareSum(num));
        int a;
       armstrong(arr);

    //  System.out.println(getSecondLargest(arr));

    }
}

