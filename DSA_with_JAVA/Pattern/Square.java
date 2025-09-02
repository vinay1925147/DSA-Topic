import java.util.Scanner;
 class Square {
    public static int  squar(int num ){
         for (int i=1;i<=num;i++){
            for(int j=i;j<=num;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
         }
        return 0;
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number:");
            int num = sc.nextInt();
            squar(num);
    }
    
}
