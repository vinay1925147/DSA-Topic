import java.util.Arrays;

public class Reverse1 {
    public static int revers3(int num[]){
    int first =0;
    int last =num.length -1;
    while(first<=last){
       int  temp;
       temp = num[first];
       num[first] =num[last];
       num[last] = temp;
         first++;
         last--;
    }
    return 0;
}
public static void product(int num[]){
  int product=1;
  for(int i=0;i<num.length;i++){
    for(int j= 0 ; j< num.length ; j++){
      if(i!=j){
        System.out.println();
      }
      else{
        product = product * num[j];
      }
      
      
    }
    System.out.println(product);
  }
}
  public static boolean pairN (int num[], int target) {
    int count = 0;
        for (int i= 0 ; i<num.length;i++){
          for ( int j=i+1 ;j<num.length;j++ ){
              // System.out.print("("+num[i]+", " +num[j]+")");
                 if( num[i]+num[j]==target){
                  System.out.println(++count);
                  //  return true;
              }
            }
          System.out.println("");
       }
       System.out.println(count);
       return false;
      }
    public static boolean twoSum(int num[], int target){
      int sum;
      int left=0,right=num.length-1;
      while(left<right){
        sum = num[left]+num[right];
        if(sum==target){
          return true;
        }else if(sum>target){
          left++;
        }
        else{
          right--;
        }
      }
      return  false;
    }
    public void reverseArray(int arr[])  {
      for(int i=arr.length-1;i>=0;i--){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }
    public static void main(String arge[]){
        int[] num= {1,2,3,4,5};
        // int arr[] = new int[6];
      //   int [] num1= {1,3,4,1};
      // System.out.println(pairN(num ,5));
      // System.out.println(twoSum(num,0));
       
      //  int rev_num = revers3(tnum);
      //   for (int i=0; i<num.length ; i++){
      //     System.out.print("  "+num[i]);
      //    }
      //    product(num);
     
     

 
 
      Reverse1 s1 =new Reverse1();
      
    int arr[]={4,5,2};
    s1.reverseArray(arr);
  
  
  

          
        
         }
      }
    

  