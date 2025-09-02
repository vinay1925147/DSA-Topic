import java.util.*;
 class minmax {
      public static int largest( int number[]) {
        int largest = Integer.MIN_VALUE;// minus infinity
       for (int i=0 ;i<number.length ; i++){
            if(largest < number[i]){
                largest = number[i];
             }
        }
        return largest ;
    }
    public static int  smallest(int number[]){
        int smallest = Integer.MAX_VALUE;// plus Infinity
        for(int i=0 ; i<number.length ; i++){
            if(smallest >  number[i]){
             smallest = number[i];
             }
        }
        return smallest;
    }
    public    static  void  secondlargest(ArrayList<Integer> list){
       int  largest=-1;
       int slargest=-1;
       for(int i=0;i<list.size();i++){
          if(list.get(i)>largest){
            largest=list.get(i);
          }
       }
       System.out.println(largest);//5
       for(int j=list.size()-1;j>=0;j--){
          if(slargest<list.get(j) && list.get(j)<largest){
              slargest=list.get(j);
          }
       }
       System.out.println(slargest);
    }
    public static void main (String []args){
     int number[] = { 1,3,4,5,6,8};
     ArrayList<Integer> list=new ArrayList<Integer>();
    // //  System.out.println("largest number is : "+ largest(number));
    // //  System.out.println("smallest number is : "+smallest(number));
    list.add(-1);list.add(6);list.add(-2);list.add(5);list.add(-4);
    System.out.print(list);
    secondlargest(list);
   
    }
    
}

