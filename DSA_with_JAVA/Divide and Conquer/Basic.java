//  import java.util.ArrayList;
//  import java.util.Collections;
 import java.util.*;
public class Basic {
  public static void swap(ArrayList<Integer> list){
     int idx1 = 1 , idx2 =2;
    int temp = list.get(1);
     list.set(idx1 , list.get(idx2));
     list.set(idx2 , temp);
    }
    // public void sum(Arrtaylist<Integer> sum1){
 
    // }
  public static void main(String args[]){
  ArrayList<Integer> list= new ArrayList<Integer>();
    list.add(1);//0
    list.add(3);//1
    list.add(2);//2
    list.add(4);//3
    list.add(5);//4
    
   System.out.println(list);
   Collections.sort(list);
   System.out.println(list);
   Collections.sort(list,Collections.reverseOrder());
   System.out.println(list);
// list.add(3,40);
// System.out.println(list);
// System.out.println(list.get(3));
//     list.remove(2);
//     System.out.println(list);
//     int sel = list.set(2,35);
//     System.out.println(list);
//     System.out.println(list.contains(20));
//     System.out.println(list.contains(50));
    // System.out.println(list.size());

    ///////// to print list based on index

      // for(int i=0;i<list.size();i++){
      //   System.out.print(list.get(i));
      // }
      // System.out.println();
      //////////////////
      ///Reverse of Arrylist

      // for(int i=list.size()-1;i>=0;i--){
      //   System.out.print(list.get(i));
      // }
      /////////////////////
      //largest number
      // int largest = Integer.MIN_VALUE;
      // int smallest = Integer.MAX_VALUE;
      // int sum=0;
      // for(int i=0;i<list.size();i++){
      //   sum = sum+list.get(i);
        // if(largest<list.get(i)){
        //   largest=list.get(i);
        // }
      //   largest = Math.max(largest , list.get(i));
      //   smallest = Math.min(smallest,list.get(i));
        
      // }
      // System.out.println(largest); 
      // System.out.println(smallest);
      // System.out.println(sum);
     swap(list);
    //  System.out.println(list);
    
}
}          



          
              