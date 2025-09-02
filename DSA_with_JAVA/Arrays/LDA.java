 
 public class LDA {
      public static boolean dupleNo(int num[]){
        int count=0;
        for(int i=0;i<num.length-1;i++){
         for(int j=i+1;j<num.length;j++){
            if(num[i]==num[j])
                return true;
                count++;
               }
              }
              System.out.println(count);
       return false;
        } 
   public static void main (String []args){
    int num[] = {1,2,3,4,4,5};
       System.out.println( dupleNo(num));
    }
    }
 

