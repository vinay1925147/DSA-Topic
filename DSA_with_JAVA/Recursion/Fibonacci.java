public class Fibonacci {
    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
       int fmn1 = fibo(n-1);
       int fmn2 =  fibo(n-2);
       int fn = fmn1+fmn2;
       return fn;
    }
    public static int  mean(int arr[]){
        int sum=0;
         for(int i=0;i<arr.length;i++){
             sum = sum + arr[i];
         }
         int m1 = sum /arr.length;
        return m1;
    }
     public static void main(String[] args) {
        // int n1 = 0 , n2=1 , n3 ;
        // int count  =10;
        // System.out.print( n1+ " "+n2);
        // for(int i=1;i<=count ;i++){
        //     n3 =n1+n2;
        //     System.out.print(" "+n3+" ");
        //     n1=n2;
        //     n2=n3;
        // }
        int arr[]={1,2,3,4,5};
         System.out.println(mean(arr));
        int n=5;
        // System.out.println(fibo(n));


    }
    
}
