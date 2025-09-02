import java.util.*;
class OprArray{
    //  public static int insertion(int arr[]){
    //       int pos=3;
    //       int  x= 4;
    //        int i;
    //        for(i=arr.length-6;i>=pos-1;i--){
    //            arr[i+1 ] = arr[i];
    //            arr[pos] = x;
    //        }
          
    //        arr[i]++;
    //        System.out.println("new array"+arr[i]);
        

      

        
        
    //     return 0;
    // }
 
   
    public static int  duplicateNo(int arr[]){
        for(int i= 0; i<arr.length-1;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
             System.out.println("duplicate are present :");;
            }else {
              System.out.println("not duplicate:");
            }
            
          }
         
        }
        return 0;
       
     
    }        
    public static void main(String args[]){
        //CREATE ARRAY
       Scanner sc =new Scanner (System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("create the array :");
        for(int i=0;i<arr.length-5;i++){
            arr[i]= sc.nextInt();}
        for(int i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]+" ");}
        
        //  insertion(arr );
        

    duplicateNo(arr);

    }
}
