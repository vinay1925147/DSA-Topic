public class Murgesort {
    public static void printarry(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void murgesrt(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    int mid = si+(ei-si)/2;// si+ei/2
    murgesrt(arr,si,mid);
    murgesrt(arr,mid+1,ei);
    murge(arr,si,mid,ei);

    }
    public static void murge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j= mid+1;
        int k = 0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
         }
        while(j<=ei){
            temp[k++] = arr[j++];
         }
        for(  k=0,i=si;k<=temp.length-1;k++,i++){
            arr[i] = temp[k];
         }
    }
    public static void main(String args[]){
        int arr[] ={6,3,5,2,8};
        String arr1[] ={"ram","shyam","radhe","sita"};
        murgesrt(arr, 0, arr.length-1);
        printarry(arr);
    }
      
}
