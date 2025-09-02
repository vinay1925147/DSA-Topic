public class RotateArray {
    public void rotateM1(int arr[],int d){
        int n=arr.length;
        reverse(arr , 0,n-1);
        reverse(arr , 0,d);
        reverse(arr , n-d,n-1);
    }
    public void reverse(int arr[] , int i ,int j){
         while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;           
            i++;
            j--;
         }
     }
     public  void rotateM2(int arr[],int d){
        int n=arr.length;
        d=d%n;
       int temp[]= new int[d];
       for(int i=0;i<d;i++){
        temp[i]=arr[i];
   }
       int k=0;
       for(int i=d;i<n;i++){
        arr[k]=arr[i];
        k++;
    }
       int j=0;
       for(int i=n-d;i<n;i++){
         arr[i]=temp[j];
         j++;
       }
     
 }
   

    public static void main(String[] args) {
        RotateArray obj=new RotateArray();
        int arr[]={1,2,3,4,5};
        int k=2;
        obj.rotateM1(arr, k);
        // obj.rotateM2(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
      
 }
    
}  