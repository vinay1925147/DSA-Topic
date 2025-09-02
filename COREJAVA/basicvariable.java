import java.util.Scanner;
class basicvariable{
  
        // String name = "vinay";
        // int a= 10;
        // int b = 5;
        // int sum = a+b;
        // int diff = a-b;
        // int multi = a*b;
        // int Ans = (a*b)/(a-b);

        // System.out.println(name);
        // System.out.println(sum);
        // System.out.println(diff);
        // System.out.println(multi);
        // System.out.println(Ans);
        public static int Fibonacci( int n){
          int num1 =0;
          int num2 = 1;
          System.out.print(" "+num1 +" "+ num2);
          for (int i=1;i<=n ; i++){
            int num3 ;
            num3 = num1 + num2;
            System.out.print( " "+num3);
            num1 = num2 ;
            num2 = num3;
          }
         return 1;
        }
        public static void main(String [] args){
          Scanner sc =new Scanner (System.in );
          System.out.println("enter a number :");
          int n = sc.nextInt ();
          Fibonacci(n);


    }
}
    

