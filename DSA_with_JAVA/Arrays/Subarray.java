//  class Subarray{
//     public static int P_maxsbarry(int num[]){
//         int max_sum ;
//         int count =0;
//         int maxi_num  = Integer.MIN_VALUE; //minus infinity
//         int pre_num[] =  new int[num.length];
//         pre_num[0] = num[0];
//         for(int i=1 ; i<pre_num.length;i++){
//             pre_num[i]= pre_num[i-1]+ num[i];
//         }
//         for(int i=0;i<num.length;i++){
//             int start = i;
//           for(int j=i; j<num.length;j++){
//             int end = j;
//             max_sum = start ==0?pre_num[end]: pre_num[end]+ pre_num[start -1];
//             if(maxi_num<max_sum)
//                maxi_num =max_sum;
//              }
//              System.out.println("");

//  }       System.out.println("maximum value is :"+maxi_num);  
//                 return 0;
// }
//     public static int psubary (int num[]){
//         int max_sum ;
//         int count =0;
//         int maxi_num =Integer.MIN_VALUE;                   
//         for(int i=0;i<num.length;i++){
//             int start = i;
//            for(int j=i; j<num.length;j++){
//                  int end =j;
//                  max_sum=0;
//               for(int k= start; k<=end;k++){
//               //  System.out.print( " "+num[k] );
//                 max_sum = max_sum + num[k];
//              }
//               System.out.print(max_sum);
//                 if(maxi_num<max_sum){
//                    maxi_num = max_sum;
//                }
//              System.out.println(" ");
//              count++;
//            }
//        // System.out.println(" sum of array"+sum);
//       System.out.println(" ");
//     }
//    System.out.println(" maximum values"+maxi_num);

    
//     // System.out.println(" sum of array"+sum);
//     System.out.println("total no. of array" +count);
//     return 0;
//  }
//  public static int  kadan_subarry (int num[]){
//      int ms = Integer.MIN_VALUE; //minus infinity
//     int cs =0;
//     for(int i=0;i<num.length;i++){
//         cs= cs+num[i];
//     if(cs<0){
//         cs=0; }
//     ms =Math.max(cs,ms);
// }
// System.out.println("maximum sum is using kadns algo :"+ms);
// return 0;
// }  
     public static void main (String args[]){
      //   int num[] = {2,4,6,8,10};
      //   String str  = "abcab";
      //   int num1[] ={ -2,-3,4,-1,-2,1,5,-3};
      //   psubary(num);
      //   //P_maxsbarry(num);
      //  // kadan_subarry(num);
     }}