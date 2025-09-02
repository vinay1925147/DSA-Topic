import java.util.*;
  class Basicstring{
    public static boolean isVowel(int  rem){
      
      return rem==0 || rem==1 || rem==4||rem==5||rem==6||rem==9;
    }
    public static void findperfactsqr(int num){
          int rem = num%10;
          boolean c =isVowel(rem);
          if(c){
            System.out.println("perfact square");
          }
          else{
            System.out.println("not perfact square");
          }
                
       
      }
    
    
    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        String arr[] = {"ram","shyam","radhe","sita"};
        // int n= arr.length();
        // for( int i=0;i<4;i++)
        // {System.out.println(arr[i]+"");}
        //  create a string
        // String firstName = "vinay";
        // String lastname  = "asati";
        // char ch[] = {'s','a','t','i'} ;
        // String s1 = new String ("java is language");
        // String s2 = new String (ch);
        // //   System.out.println(" "+s1);
        //   System.out.println(" "+s2);
        //   System.out.println(" "+firstName);
        // // Input OR output 
        //   Scanner sc = new Scanner (System.in);
        //   String  name , name1 ;
        //   name = sc.next();
        //   name1  = sc.nextLine();
        //   System.out.println(name1 +" ");
        //   System.out.println(name +" ");
        //   //find the length
        //    System.out.println(firstName.length() +" ");
        //   // concatenation
        //   String FullName = firstName+" "+lastname;
        //   System.out.println(FullName);
        //   // Indexing in string 
        //   System.out.println(firstName.charAt(0) );
        //   for (int i=0 ; i<firstName.length();i++){
        //       System.out.print(FullName.charAt(i) +" "); //poora string k char print hoge
        //   }
        // char a = 'A';
        // int ascii = a;
        //  ///Print ascii
        //   for ( int i=0;i<127;i++){
        //   System.out.println( " each values of ascii charecter : "+i +"="+ (char)i); 
        //   }
     
  String vol =" ";
 findperfactsqr(101);
  
    }
    
}
 