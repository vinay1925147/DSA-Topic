import java.util.*;
 class fact {
    public static void  calculatefact( int num)
    {
       int factorial =1;
       for (int i =num ; i>= 1 ; i--){
         factorial = factorial*i;
        
       }
       System.out.println("fact of one  number:"+factorial);
       return ;
    }
    public static  int  multi( int n ,int m ,int r ){
          int multi1 = n * m *r;
          System.out.println("multiply of three number:"+ multi1);
        return multi1;
    }
    public static  int avarage( int a, int b, int c ){
        int avg = (a+b+c)/3;
        System.out.println("avg og three numbers:"+ avg);
        return avg;
    }
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter one number:");
       int n= sc.nextInt();
       System.out.println("enter second number:");
       int m= sc.nextInt();
       System.out.println("enter third number:");
       int r = sc.nextInt();
        int  avg = (n+m+r)/3;
        calculatefact(n);
        multi(n,m,r);
        avarage( n,m,r);
        System.out.println("avg  three numbers:"+ avg);
        }}
        

    
    

