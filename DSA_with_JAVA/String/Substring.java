import java.util.Arrays;

public class Substring {
    public static String  sbstring1(String str){
      for (int i=0; i<str.length();i++){
        int start = i;
        int count =0;
        for(int j=i; j<str.length();j++){
            int  end= j;
            int k;
            for(k= start  ; k<=end;k++){
                System.out.print(str.charAt(k));
                }count++;
                  System.out.println("   "+count);
                  System.out.println( );
              
                }
                System.out.println(  );
                System.out.println(" total substring :  "+count);
             }

            return "k";
    
    }                
    public static String  sbstring(String str  ){
        int startindx = 0;
        int endIndex = 5;
         String string =""; 
        for (int i=0 ;i<5;i++){
         string  =  string + str.charAt(i);
        }
        return string;
    }
    ////compareTo  methods in string
    public static int  Largest (String fruits[]){
        String largest = fruits[0];
        String str = "vinay";
        for (int i=1 ; i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
         }
         System.out.println("largest string is :"+largest);
        System.out.println(largest.compareTo(str));

         return 0;
    }
    public static void stringsort(String arr[],int si,int ei){
        for(si=0;si<ei;si++){
            for(int j=si+1;j<=ei;j++){
                if (arr[si].compareTo(arr[j])>0){
                    //swap
                   String temp = arr[si];
                   arr[si]=arr[j];
                   arr[j]=temp;

                }
             }
        }
        System.out.println(Arrays.toString(arr));


    }
    public static void sortString( String s){
        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    // Swap characters
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        String sortedString =new String (charArray);
        System.out.println("Sorted string: " + sortedString);
    }
    public static void main(String[] args) {
      //   String  str ="Helloworld";
      //   String sati = str.substring(0,5);
      //   String sati1 = str.substring(0);
      // // System.out.println(sbstring(str ));
      //   String  fruits[]  = { "apple" , "mango" , "banana"};
      // // Largest(fruits);
      //   // sbstring1(str);
      // String arr[]={"ram","shyam","radhe", "sita","krishna"};
      //   int size=arr.length;//5
      //  stringsort(arr,0,size-1);
       sortString("Vinay");
 
      

        
        

    }
}
