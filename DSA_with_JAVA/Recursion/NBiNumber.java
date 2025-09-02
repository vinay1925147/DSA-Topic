class NBiNumber{
    public static void  printbinarynumber(int n , int lastplace , String  str){
    if(n==0){
        System.out.println(str);
        return;
    }
        if(lastplace ==0){
        printbinarynumber(n-1,0,str+"0");
        printbinarynumber(n-1,1,str+"1");
    }else{
        printbinarynumber(n-1,0,str+"0");  
    }
    // printbinarynumber(n-1,0,str+"0");
    // if(lastplace==0){
    //     printbinarynumber(n-1,1,str+"1");
    // }


    }
  public static void main(String args []){
    String str="";
    int n =5;
    int lastplace = 0;
   printbinarynumber(n, lastplace, str);
  }
}