public class Palindrom {

    // public static string
     public static boolean ispalindrom( String  str){
         for (int i= 0; i<=str.length()/2;i++){
         // int n= str.length()-1;
             if (str.charAt(i) !=str.charAt(str.length()-1-i)){
                 System.out.println(" not palindrom :");
                  return false;
            }
     }
      System.out.println(" is  palindrom :");
     return true ;
    }
    public static float shortestPath(String  str1 ,String str2 ){
        int x=0,y=0;
        for(int i=0;i<str1.length();i++){
            int dir = str1.charAt(i);
            System.out.print("  "+dir);
            System.out.println();
            if(dir == 'S'){
                y--;
            }else if(dir=='N'){
                y++;
            }else if(dir=='E'){
                x++;
            }else{
                x--;
            }
    }
    int X1 = x*x;
    int Y1 = y*y;
    int X = X1+Y1;
    return (float)Math.sqrt(X);
    }

     public static void main(String [] args){
        String  str = "vinay";
    System.out.println( ispalindrom(str));

       /*   methods of StringBuffer
      StringBuffer str3  = new StringBuffer(" vinay");
      System.out.println(  str3.reverse());
      System.out.println(str3.insert(5,"asati"));  
      System.out.println(  str3.delete(1,2)); // start = initial index ,end = last index -1
      System.out.println(str3.replace(1, 3, str));/// same above 
      System.out.println(str3.append(578) );
     System.out.println(str3.capacity()); // 16 additional  charector are added
 **/


    }
}

