 //    import java.util.Arrays;
    class Basicsrt {
    public static void main (String args[]) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int n=10;
        // Arrays.sort(arr,0,4);
        // printarr(arr, n);
       // bubblesrt(arr, n);
       counting(arr, n) ;
       printarr(arr, n);
        //  selectionsrt(arr, n);
        //  printarr(arr, n);
        // Insertionsrt(arr,n);
        //printarr(arr, n);
    }
    public static int printarr(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("  ");
        return 0;
    }
    public static int counting(int arr[] , int n){
          int largest = Integer.MIN_VALUE;
          for(int i=0;i<n;i++){
            largest = Math.max(largest , arr[i]);
          }
          int count[] =new int[largest+1];
          for(int i=0;i<n;i++){
            count[arr[i]]++;
         
          }
          int j=0;
          for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
             }
          }
        return 0;
    }
    
    public static int Insertionsrt(int arr[] , int n){
        for(int i=1;i<arr.length ;i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev]>curr){
                arr[prev + 1] = arr[prev];
                prev--;    
            }
            arr[prev+1] = curr;
          
       }
        return 0;
    }
    public static int selectionsrt ( int arr[] , int n){
        for (int i =0; i<=n-2; i++){
            int minpos  = i;
            for (int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[minpos])
                    minpos=j; 
            }
              //swap
             if (minpos!=i){
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
            }
        }
       return 0;
    }
    public static int bubblesrt(int arr[], int n){
        int swap =0;
       for (int i = 0; i<=n-2;i++){
         swap =0;
          for (int j=i+1;j<=n-2-i ; j++){
            if(arr[i]>arr[j+1])
            {
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
                swap++;
                }
                System.out.print(" "  +swap);
            }
            System.out.println("");
            System.out.println(" "+swap);
            
        }
        System.out.println(" "+swap);
        return 0;
       
    }
}
        
    
    