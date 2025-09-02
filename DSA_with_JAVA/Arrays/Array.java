import java.util.Scanner;
public class Array {
    public static boolean contains (int arr[],  int item ){
        for(int i=0;i<arr.length;i++){
            if(item == i){
                return true;
            }
        }
        return false;
}
    public static int  Index( int arr[] , int item){
    for (int i=0; i<arr.length;i++){
        if(i==item){
          return i;
        }
      
    }
     return -1;

}
public static void moveEnd(int arr[]){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==0){
        int temp = arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
   

  }
    
    public static void main(String[] args) {
       int  arr[] = {1,3,5,0,0,7,9};
       int item =3;
       int arr1[] = new int [10];
       int sum =0;
       for (int i=0 ; i<=arr1.length; i++){
        sum =sum+i;
       }
     int avg = sum/10;
     int index =Index (arr, item);
     if (index==-1){
        System.out.println("not found" );
     }else {
        System.out.println("index is:" +index);
     }

        System.out.println(Index (arr, item));
        System.out.println(contains(arr , 5));
        System.out.println("sum of numbers:"+sum);
        System.out.println("avarage of numbers:"+avg);
        System.out.println("sum of numbers:"+arr1[1]);

        // int marks[] =new int [5];
        // Scanner sc = new Scanner (System.in);
        // System.out.println("enter three number :");
        //  marks[0] = sc.nextInt();
        //  marks[1] = sc.nextInt(); 
        //  marks[2] = sc.nextInt();
        //  System.out.println("computer ="+marks[0]);
        //  System.out.println("Digtal ="+marks[1]); 
        //  System.out.println("operatigs ="+marks[2]);
        //  int  persentages =(( marks[0]+  marks[1]+ marks[2])/3 );
        //  System.out.println(persentages +"%");
        
////Length of array 
         System.out.println("length of array "+arr1.length );
        //  moveEnd(arr);

    }
}
