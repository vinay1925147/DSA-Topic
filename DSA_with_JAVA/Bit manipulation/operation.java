import java.util.Scanner ;
public class operation {
    public static int getIthbit(int num , int i){
        int bitmask = 1<<i;
           if((num & bitmask) == 0){
             return  0;
        }
        return 1;
    }
    public static int setIthbit(int num , int i){
         int bitmask = 1<<i;
      
            return num | bitmask ;
         }
    public static int clearithbit(int num ,int i){
            int bitmask = ~(1<<i);
            return num & bitmask ;
         }
    public static int updateIthbit(int num ,int i ,int newbit){
        if(newbit == 0){
           return  clearithbit(num ,i);
        }else{
            return setIthbit(num ,  i);
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter a number :");
        int num  = sc.nextInt();
        System.out.println("enter shift position : ");
        int i = sc.nextInt();
        System.out.println("enter newbit : ");
        int newbit = sc.nextInt();
        System.out.println( " Get Ith bit is : "+getIthbit(num , i));//  0 or 1
        System.out.println(" set bit is  " + setIthbit(num, i)); ///  
        System.out.println(" clear set Bit number  is: "+clearithbit(num, i));
        System.out.println(" update the ith bit in number is :"+updateIthbit(num , i , newbit));
    }
}
