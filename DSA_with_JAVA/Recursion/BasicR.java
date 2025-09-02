public class BasicR {
   
    public static void  priDec(int n){
        if(n==1){
             System.out.print(n);
            return ;
        }
        priDec(n-1);
        System.out.print(n+ " ");
        return ;
}
public static int sumarry(int arr[], int n){
    if(n==0){
        return 0;
    }
    int fmn1= sumarry(arr, n-1);
    int fn= arr[n-1]+ fmn1;
     System.out.println(fn);
    return fn;

}
public static int  avgSumarry(int arr[], int n){
    if(n==1){
        return arr[n-1];
    }
    int smn1 = avgSumarry(arr,n-1);
    int sn =  (arr[n-1]+ smn1 * (n-1))/n;
    return  sn;
}
public static void pattern(int row ,int col ){
    if(row==5){
        return ;
    }
    if(col<row){
        System.out.print(" *");
        pattern(row, col+1);
    }
    else{
        System.out.println();
        pattern(row+1, 0);
    }
    // System.out.print("*  ");
    // pattern(row-1);
}
public static void square(int row,int col){
     if(row==0){
        return;
     }
    //  pattern(col);
     System.out.println();
     square(row-1, col);
}


public static int  sum(int n ){
    if(n==1){
        return 1;
    }
    int smn1 = sum(n-1);
    int sn =  n + smn1 ;
    System.out.println(sn+" ");
    return  sn;
}

 public static int  fact(int n ){ 
    if(n==0){
        return 1;
    }
    int fn_1 = fact(n-1);
    int fn = n * fn_1;
    System.out.println(fn);
    return fn;
}
public static void createarr(int nums[] , int i , int val){
    if(i==nums.length){
        printarr(nums);
        return;
    }
     nums[i]=val;
     createarr(nums, i+1, val+1);
     nums[i] = nums[i]-2;
    }
 public static void printarr(int nums[]){
    for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
    }
    System.out.println();
 }
 public static void srchLinear(int []arr,int i,int key){
    if(arr[i]==key){
       System.out.println(i);
        return ;
    }

    srchLinear(arr, i+1, key);
  
 }
    public static void main (String args []){
       int num =4;
//     // priDec(num1);
//    // System.out.println(  fact(num2));
       // System.out.println(sum(num ));
       int arr[]={1,2,3,4,5};
    //    int n= arr.length;
    //    System.out.println(avgSumarry(arr,n));
    //    square(4,5);
    //    pattern(0,0);
    //    int nums[] = new int[5];
    //    createarr(nums, 0, 1);
    //    printarr(nums);
  srchLinear(arr,0,4);

   
     }
}
/* */