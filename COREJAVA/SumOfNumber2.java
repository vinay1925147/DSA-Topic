import java.util.Scanner;

public class SumOfNumber2 {
    public static void main(String args []){
        int x,y,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        x= sc.nextInt();
        System.out.println("enter second number :");
        y =sc.nextInt();
        sum =sum (x,y);
        System.out.println("the sum of two number is: " +sum);

    }
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    
}
