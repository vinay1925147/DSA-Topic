public class DuplicateSrt {
    public static int  removeDsrt(int arr[],int n){
        int i=0;
        for(int j=1;j<n-1;j++){
          if(arr[i]!=arr[j]){
            i++;
            arr[i]=arr[j];
          }       
        }
        return i+1;
  }
   
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,3};
        int n=arr.length;
         int newsize=removeDsrt(arr, n);
        for(int i=0;i<newsize;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
