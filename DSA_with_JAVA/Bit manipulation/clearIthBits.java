import java.util.Scanner;
public class clearIthBits {
    public static int clearRangbits(int num , int i ,int j){
        int a= ~0<<j+1;
        int b= (1<<i)-1;
        int bitmask = a|b;
        return num & bitmask;
    }
    public static boolean   IspowerOFtwo(int num ){
         int result =num & num-1;
         return(result ==0);
    }
    public static int countSetbit(int num ){
        int count  = 0;
        while(num>0){
            if((num & 1) != 0){
                count++;
             }
              num= num>>1;
        }
        return count ;
    }
    public static int fastexponential(int a , int n){
        int ans = 1;
        while(n>0){
            if((n & 1)!= 0){
                ans = ans * a;
            }
           a= a*a;
           n = n>>1;
        }
        System.out.println(ans);
        return 0;
    }
    public static void main(String args []){
        // int num =15;
        // int i=0;
        // int bitmask = ~0<<i;
        // int result = num & bitmask;
        // System.out.println(result);
        // Scanner sc = new Scanner (System.in);
        // int x= sc.nextInt();
        // int y= sc.nextInt(); 
        // System.out.println("Before swap: x = " + x + " and y = " + y);
        //     //swap using xor
        //     // x = x ^ y;
        //     // y = x ^ y;
        //     // x = x ^ y;
        //     int temp = x;
        //     x=y;
        //     y =temp;
        // System.out.println("After swap: x = " + x + " and y = " + y);
    //    System.out.println("After clear bit and range Is :"+clearRangbits(10,2,7));
    //    System.out.println(""+IspowerOFtwo(7));
    //    System.out.println(" "+countSetbit(15));
    //    fastexponential(5,3);
     int num  = 0b1010;
     System.out.println(num);

            
            
     }
    
}
