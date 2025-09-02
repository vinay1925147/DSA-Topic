class Exponentiation{
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
    public static void main (String args []){
        int a= 3,n=5;
        fastexponential( a,n);


    }
}