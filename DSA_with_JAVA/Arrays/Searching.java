import java.util.Arrays;

public class Searching {
    public static void sum(int num[]){
        int sum =0;
        for(int i=0; i<num.length;i++){
            sum = sum+ num[i];
        }
        System.out.println(sum);
    }

    public static int linearsearch(int num[],int key){//big o N
        for(int i=0; i<=num.length ;i++){
            if(num[i]==key){
                return i; }
            
        }
        return -1;
       
     }
     public static int Binarysearch(int num[],int key){// big o logN
         int start = 0, end = num.length-1;
         while (start <= end ){
            int mid = (start + end )/2;
            if (key ==num[ mid]) {
                return mid;
            }
            if (key<num[mid]){
                end = mid-1; }
            else{
                start = mid +1;}
         }
         return -1;
     }
    public static void main(String[] args) {
        // int num[] = {2,4,6,8,10,12,14};
        int num1[] = new int []{10,20,30,40,50};
    //     int key = 16;
    //   //  sum(num);
    // //   
    //    System.out.println("key is present this index  from linear search :   " +linearsearch(num, key) );
    //   // System.out.println("key is present at indrex  from binary search :"+Binarysearch(num, key));
    int arr[]={1,2,3,4,5};
    int num[]=new int [5];
    int first=0,last=arr.length-1;
    while(first<last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
   for(int i=0;i<arr.length;i++){
        System.out.println( arr[i]);
   }
}
}
