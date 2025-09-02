import java.util.*;
class Basic {
  public static void moveEnd(int arr[]){
    for(int i=0;i<arr.length;i++); {
        for(int j=0;j<arr.length-1;j++)
          if(arr[j]==0){
            if(arr[j]<arr[j+1]){
            int temp = arr[j]; 
            arr[j]=arr[j+1];
            arr[j+1]=temp; }
          }
        }

   
    for(int i=0;i<arr.length;i++){
      System.out.print(" "+arr[i]);
    }
   

  }

  public static void main (String []args){
       int arr[] ={1,2,3,0,0,3};
       // productOfarr(arr);
        // moveEnd(arr);
        float n = 100/3f;
        System.out.println(n);
        
        
}
}                                         