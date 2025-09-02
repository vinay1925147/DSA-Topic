public class reverse {
     public static void  pair(String str ){
        char  curnt ;
     //   char  other ;
        for(int i=0;i<str.length();i++){
           curnt = str.charAt(i);
           char other =0 ;
            for(int j=i+1 ;j<i+2;j++){
              
               other = str.charAt(j);
              }
              System.out.print("("+curnt +","+ other+")");
              char temp;
              temp = curnt;
              curnt = other;
              other = temp;
              System.out.print(" After swipping  Pair Is :");
              System.out.println( "("+curnt+ ","+other+")");
          
              }
            }
      public static String revers(String str){
        StringBuffer sb  = new StringBuffer("");
        for(int i =str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
           
        }
       
        return sb.toString();
    }
   public static String rvrsSentens(String str1[]){
      String a ="";
      
      for(int i=str1.length -1 ; i>=0;i--){
           a += str1[i];
         }
      return a;
   }
    public static void main(String args []){
        String str = "hello";
        String str1[] = { " i " , " love " , " you " , " for " , "me "};
        StringBuilder sb  = new StringBuilder("Hello");
         String nstr ="";
         for(int i=str.length()-1;i>=0;i--){
           char ch = str.charAt(i);
           nstr += ch;
         }
         if(str.compareTo(nstr) ==0){
            System.out.println( " string is palindrom :");
         }else{
            System.out.println(" not palindrom" );
         }
         System.out.println(nstr);
        // System.out.println(revers(str));
         //pair(str);
       System.out.println( rvrsSentens(str1));
       String num = " 1111334456";
       int count =0 ;
       for(int i=0;i<num.length();i++){
        
          if(num.charAt(i) == '1') {
            count ++;
          }
       }
       System.out.println(count +" ");
      System.out.println( str.toLowerCase());
      System.out.println(  str.toUpperCase());
         
        
    
    }
}

